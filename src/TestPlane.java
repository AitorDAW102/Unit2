public class TestPlane {
    public static void main(String[] args) {
        Plane point1 = new Plane(45.5, 31.0);

        System.out.println("El punto esta en el cuadrante "+point1.whichQuadrant());
        point1.whereItIs();
    }
}
