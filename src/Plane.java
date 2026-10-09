public class Plane {
    private double x;
    private double y;

    public Plane (double newX, double newY){
        x = newX;
        y = newY;
    }

    public int whichQuadrant (){
        int quadrant;
        if (x>0&&y>0){
            quadrant=1;
        } else if (x<0&&y>0) {
            quadrant=2;
        } else if(x<0&&y<0){
            quadrant=3;
        } else {
            quadrant=4;
        }
        return quadrant;
    }
    public void whereItIs(){
        int quadrant;
        if (x>0&&y>0){
            quadrant=1;
        } else if (x<0&&y>0) {
            quadrant=2;
        } else if(x<0&&y<0){
            quadrant=3;
        } else {
            quadrant=4;
        }
        System.out.println("El punto esta en el cuadrante: "+quadrant);
    }
}
