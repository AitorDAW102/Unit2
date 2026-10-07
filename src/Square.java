public class Square {
    private double l1;

    public Square (double newL1){
        l1=newL1;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double newl1) {
        l1 = newl1;
    }

    public double peremiterr(){
        double perimeter = l1*4;
        return(perimeter);
    }
    public double area(){
        double area = l1*l1;
        return(area);
    }
}
