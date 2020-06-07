package org.nbk.polymorphism.overriding.service;

public class ReportingService {

    void generateReport() {
	System.out.println("Generate Generic Report");
    }

    // Like Coveriant return types. Its the same for ExceptionHandling. The child
    // can either throw same level, a level lower or no exception.
    public Number convertReport() throws Exception {
	System.out.println("Generic Convert Report");
	return null;
    }

    // Cannot be overridden
    public static void showReport() {
	System.out.println("Generic static show report");
    }

    // Cannot be overridden as method is final
    public final void showFinalReport() {
	System.out.println("Generic static show report");
    }

    // Cannot be overridden as method is private
    private void showOnlyGenericReport() {
	System.out.println("Generic static show report");
    }

}
