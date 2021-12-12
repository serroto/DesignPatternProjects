package lab7_FacadePattern;

public class Main {
    public static void main(String[] args) {
        SmartRemoteFacade remoteFacade= new SmartRemoteFacade();
        remoteFacade.setUpMovie();
        remoteFacade.prepareFood();
        remoteFacade.endMovie();
        remoteFacade.endKitchen();
    }
}
//Serra Atalay 19070006028
