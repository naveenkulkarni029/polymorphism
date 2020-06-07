package org.nbk.polymorphism.overriding.service;

public class PDFReport extends ReportingService {
    // Access Modifier should be always more visible than parent.
    // If Parent is protected then we can have public protected

    // If Parent is default
    // child --> Public protected and default
    @Override
    protected void generateReport() {
	System.out.println("Generate PDF Report");
    }

    // Covariant return type
    // the child should always return a same type as parent or lower than the
    // parent.
    // Ex: parent is a Number, here return type as Integer
    // Learning: Type changing from Integer to Object or String it gives a compile
    // time error.
    // Can throw any exception here as parent throws Exception
    // Learning Try Changing from ClassCastException to Throwable it give a compile
    // type error.
    @Override
    public Integer convertReport() throws ClassCastException {
	return null;
    }

    public static void showReport() {
	System.out.println("Show PDF report static");
    }
}
