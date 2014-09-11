/*
 * An XML document type.
 * Localname: currenyConvertMarketDataFault
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one currenyConvertMarketDataFault(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class CurrenyConvertMarketDataFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument
{
    
    public CurrenyConvertMarketDataFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENYCONVERTMARKETDATAFAULT$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currenyConvertMarketDataFault");
    
    
    /**
     * Gets the "currenyConvertMarketDataFault" element
     */
    public au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault getCurrenyConvertMarketDataFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault target = null;
            target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault)get_store().find_element_user(CURRENYCONVERTMARKETDATAFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "currenyConvertMarketDataFault" element
     */
    public void setCurrenyConvertMarketDataFault(au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault currenyConvertMarketDataFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault target = null;
            target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault)get_store().find_element_user(CURRENYCONVERTMARKETDATAFAULT$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault)get_store().add_element_user(CURRENYCONVERTMARKETDATAFAULT$0);
            }
            target.set(currenyConvertMarketDataFault);
        }
    }
    
    /**
     * Appends and returns a new empty "currenyConvertMarketDataFault" element
     */
    public au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault addNewCurrenyConvertMarketDataFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault target = null;
            target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault)get_store().add_element_user(CURRENYCONVERTMARKETDATAFAULT$0);
            return target;
        }
    }
    /**
     * An XML currenyConvertMarketDataFault(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class CurrenyConvertMarketDataFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault
    {
        
        public CurrenyConvertMarketDataFaultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INVALIDMARKETDATA$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "InvalidMarketData");
        
        
        /**
         * Gets the "InvalidMarketData" element
         */
        public java.lang.String getInvalidMarketData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InvalidMarketData" element
         */
        public org.apache.xmlbeans.XmlString xgetInvalidMarketData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InvalidMarketData" element
         */
        public void setInvalidMarketData(java.lang.String invalidMarketData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDMARKETDATA$0);
                }
                target.setStringValue(invalidMarketData);
            }
        }
        
        /**
         * Sets (as xml) the "InvalidMarketData" element
         */
        public void xsetInvalidMarketData(org.apache.xmlbeans.XmlString invalidMarketData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDMARKETDATA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVALIDMARKETDATA$0);
                }
                target.set(invalidMarketData);
            }
        }
    }
}
