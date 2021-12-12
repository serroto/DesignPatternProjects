package lab7_2_AdapterPattern;

public class CharPrinterImplementation implements PrinterAdapter{ //For buffer
    @Override
    public void print(String text) {
        for (int i = 0; i < text.length(); i=i+2) {
            System.out.print(text.substring(i,i+2));
            System.out.println();
        }
    }
}
