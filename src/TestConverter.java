public class TestConverter {
    public static void main(String[] args) {
        double distance =13.6;

        /*Millas Kilometros*/
        System.out.println(distance+" millas son unas " +Converter.milesToKms(distance)+"km");

        /*Kilometros Millas*/
        System.out.println(distance+"km son unas " +Converter.kmsToMiles(distance)+" millas");


    }
}
