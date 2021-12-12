package lab7_2_AdapterPattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrinterRoom proom=null;
        PrinterAdapter printerAdapter=null;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = myObj.nextLine();

        System.out.println("Enter printer type: ");
        String ptype = myObj.nextLine();

        if(ptype.equals("char")){
            proom = new CharArrPrinter();
            printerAdapter = new CharArrPrinterImplementation();
        }else if(ptype.equals("buffer")){
            proom = new CharPrinter();
            printerAdapter = new CharPrinterImplementation();
        }else{
            System.out.println("Your type choice isn't valid!");
        }
        printerAdapter.print(text);
    }
}

//Serra Atalay 19070006028