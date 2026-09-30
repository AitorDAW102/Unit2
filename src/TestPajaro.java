public class TestPajaro {
    public static void main(String[] args) {
        System.out.println("Primer Pajaro");
        Pajaro p = new Pajaro();
        p.setEdad(5);
        p.printEdad();
        p.setColor("Amarillo");
        p.printColor();

        System.out.println("Segundo Pajaro");
        Pajaro p2=new Pajaro();
        p2.setEdad(69);
        p2.printEdad();
        p2.setColor("Rojo");
        p2.printColor();
    }
}
