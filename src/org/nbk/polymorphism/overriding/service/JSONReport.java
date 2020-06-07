/**
 * 
 */
package org.nbk.polymorphism.overriding.service;

public class JSONReport extends ReportingService {

    @Override
    void generateReport() {
	super.generateReport();
    }
    
    

    // Compile time error as Object is higher level than Number

    /**
     * Uncomment to test
     */
    /*
     * @Override public Object convertReport() { // TODO Auto-generated method stub
     * return super.convertReport(); }
     */

}
