package lab10_TemplateMethodPattern;

public abstract class Computer {
   final void plug(){
        plugCPU();
        plugMemory();
        plugStorage();
        plugPeripherals();
    }
    abstract void plugCPU();
    abstract void plugMemory();
    abstract void plugStorage();
    void plugPeripherals(){
        System.out.println("Connecting mouse, keyboard, monitor");
    }
}
