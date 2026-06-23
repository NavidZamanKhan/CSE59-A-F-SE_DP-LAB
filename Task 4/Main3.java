interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}

class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}

class MultiFunctionalCopier implements Printer, Scanner, FaxMachine {
    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
    @Override
    public void scanDocument() {
        System.out.println("Scanning...");
    }
    @Override
    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

public class Main {
    public static void main(String[] args) {
        BasicPrinter printer = new BasicPrinter();
        printer.printDocument();
        
        MultiFunctionalCopier mfc = new MultiFunctionalCopier();
        mfc.printDocument();
        mfc.scanDocument();
        mfc.faxDocument();
    }
}
