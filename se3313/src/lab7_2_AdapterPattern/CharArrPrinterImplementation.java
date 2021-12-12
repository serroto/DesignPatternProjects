package lab7_2_AdapterPattern;

public class CharArrPrinterImplementation implements PrinterAdapter{
    private PrinterRoom printerRoom;

    @Override
    public void print(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
