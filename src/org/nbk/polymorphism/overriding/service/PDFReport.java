package org.nbk.polymorphism.overriding.service;

public class PDFReport extends ReportingService {

    @Override
    public void generateReport() {
	System.out.println("Generate Generic Report");
    }

}
