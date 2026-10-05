public class TestPajaro {
    public static void main(String[] args) {
        System.out.println("Primer Pajaro");
        Pajaro p = new Pajaro();
        System.out.println("Numero de pajaro "+p.getNumpajaro());
        p.setEdad(5);
        p.printEdad();
        p.setColor("Amarillo");
        p.printColor();
        p.printSexo();


        System.out.println("Segundo Pajaro");
        Pajaro p2=new Pajaro();
        System.out.println("Numero de pajaro "+p2.getNumpajaro());
        p2.setEdad(69);
        p2.printEdad();
        p2.setColor("Rojo");
        p2.printColor();
        p2.printSexo();
    }
}
