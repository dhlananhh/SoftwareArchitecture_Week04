package iuh.fit.se.designs.BridgePattern;

public abstract class Shape {
	//Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}
