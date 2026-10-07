public class Triangle {
    private double l1;
    private double l2;
    private double l3;

    public Triangle(double newl1, double newl2, double newl3){
        l1=newl1;
        l2=newl2;
        l3=newl3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double newl1) {
        l1 = newl1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double newl2) {
        l2 = newl2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double newl3) {
        l3 = newl3;
    }

    public boolean isEquilateral(){
        boolean equirateral = (l1==l2 && l1==l3 );
        return (equirateral);
    }
}
