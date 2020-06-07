package org.nbk.polymorphism.overriding.service;

public class XMLReport extends ReportingService {

    @Override
    protected void generateReport() {
	System.out.println("XML Report");
    }
    
    // Compile time error. As Number and String are of same level in the horizontal
    
    /**
     * Uncomment to Test
     */
    
    /*@Override
    public String convertReport() {
	
	System.out.println("Covariant Return Type Here its String parent is Object");
	return null;

    }*/

}
