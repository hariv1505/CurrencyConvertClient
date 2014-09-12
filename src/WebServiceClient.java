
import au.edu.unsw.sltf.client.CurrencyConvertServicesStub;
import au.edu.unsw.sltf.client.CurrenyConvertMarketDataFaultException;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataResponseDocument;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataResponseDocument.CurrenyConvertMarketDataResponse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web service client that connects to the TopDownSimpleServices
 * Web service.
 */
public class WebServiceClient {

    public static void main(String[] args) {
        String wsURL = "http://localhost:8080/axis2/services/TopDownSimpleServices";
        try {
            CurrencyConvertServicesStub stub = new CurrencyConvertServicesStub(wsURL);
            System.out.println("The output of importMarketData operation is: ");
            System.out.println(callCurrencyConvertMarketDataOperation(stub));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String callCurrencyConvertMarketDataOperation(CurrencyConvertServicesStub stub) throws Exception {
        // Ready the request for rdthImport operation.
        CurrenyConvertMarketDataDocument reqDoc = CurrenyConvertMarketDataDocument.Factory.newInstance();
        CurrenyConvertMarketData req = reqDoc.addNewCurrenyConvertMarketData();
        req.setEventSetId("3");
        req.setTargetCurrency("USD");        

        String result = "";
        try {
        	CurrenyConvertMarketDataResponseDocument respDoc = stub.currenyConvertMarketData(reqDoc);
            CurrenyConvertMarketDataResponse resp = respDoc.getCurrenyConvertMarketDataResponse();
            result += resp.getEventSetId();
        } catch (CurrenyConvertMarketDataFaultException ce) {
        	CurrenyConvertMarketDataFaultDocument faultDoc = ce.getFaultMessage();
        	CurrenyConvertMarketDataFault fault = faultDoc.getCurrenyConvertMarketDataFault();
        	String faultType = fault.getInvalidMarketData();
        	result = "Fault type: " + faultType;
        }

        return result;
    }

}