package lab10_TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer();
        Computer officeComputer = new OfficeComputer();
        gamingComputer.plug();
        officeComputer.plug();
    }
}

//Serra Atalay - 19070006028