package br.com.mariojp.solid.isp;

public class OfficeService {
    private iPrinter printer;

    public OfficeService(iPrinter printer) {
        this.printer = printer;
    }

    public void printReport(String report) {
        printer.print(report);

    }

}
