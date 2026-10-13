public class Satellite {
    private double meridian;
    private double parallel;
    private double distanceToEarth;
    Satellite(){
        meridian=0;
        parallel=0;
        distanceToEarth=0;
    }


    public void setMeridian(double newMeridian) {
        meridian = newMeridian;
    }

    public void setParallel(double newParallel) {
        parallel = newParallel;
    }

    public void setDistanceToEarth(double newDistance) {
        distanceToEarth = newDistance;
    }

    public void printPosition(){
        System.out.println("Meridiano= "+meridian);
        System.out.println("Paralelo= "+parallel);
        System.out.println("Distancia= "+distanceToEarth+"km");
    }
}
