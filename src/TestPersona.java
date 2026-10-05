public class TestPersona {
    public static void main(String[] args) {
        /*PERSONA1*/
        Persona person1=new Persona();

        /*PERSONA2*/
        Persona person2=new Persona("Yolanda",18,'F');

        /*PERSONA3*/
        Persona person3=new Persona("Martin",18,'M',"3456732L",72.56,1.67);

        /*ADULTO*/
        System.out.println("Persona 1");
        person1.isAdult();
        System.out.println("Persona 2");
        person2.isAdult();
        System.out.println("Persona 3");
        person3.isAdult();

        /*IMC*/
        System.out.println("Persona 1");
        person1.hasIdealWeight();
        System.out.println("Persona 2");
        person2.hasIdealWeight();
        System.out.println("Persona 3");
        person3.hasIdealWeight();

        /*PRINT*/
        System.out.println("Persona 1");
        person1.printData();
        System.out.println("Persona 2");
        person2.printData();
        System.out.println("Persona 3   ");
        person3.printData();
    }
}
