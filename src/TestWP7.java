public class TestWP7 {
    public static void main(String[] args) {
        WP7 p1 = new WP7("Yolanda",18);

        System.out.println("Nombre: "+p1.getName());
        p1.setAge(19);
        p1.printDetails();
    }
}
