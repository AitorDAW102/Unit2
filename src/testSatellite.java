public class testSatellite {
    public static void main(String[] args) {
        Satellite s1 = new Satellite();

        s1.setMeridian(6.1);
        s1.setParallel(13.3);
        s1.setDistanceToEarth(4431);

        s1.printPosition();
    }
}
