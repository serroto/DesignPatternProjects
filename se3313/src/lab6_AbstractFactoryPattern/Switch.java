package lab6_AbstractFactoryPattern;

public abstract class Switch {
    protected String name;
    protected KeyCap keyCap;
    protected Stem stem;
    protected CoilSpring coilSpring;

    public abstract void gatherParts();

    public void placeCoilSpring() {
        System.out.println("Coil is placed into base");
    }

    public void placeStem() {
        System.out.println("Stem is placed on to coil");
    }

    public void placeKeyCap() {
        System.out.println("KeyCap is placed on to the stem");
    }

    @Override
    public String toString() {
        return "Switch{" +
                "name='" + name + '\'' +
                ", keyCap=" + keyCap +
                ", stem=" + stem +
                ", coilSpring=" + coilSpring +
                '}';
    }
}
