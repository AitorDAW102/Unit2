public class Persona {
    private String name;
    private int age;
    private String dni;
    private char gender;
    private double weight;
    private double height;

    public Persona(){
        name="";
        age=0;
        dni="00000000X";
        gender='N';
        weight=00.0;
        height=00.0;
    }

    public Persona(String newName, int newAge, char newGender){
        name=newName;
        age=newAge;
        gender=newGender;
        dni="00000000X";
        weight=00.0;
        height=00.0;
    }

    public Persona(String newName, int newAge, char newGender,String newDni, double newWeight, double newHeight){
        name=newName;
        age=newAge;
        gender=newGender;
        dni=newDni;
        weight=newWeight;
        height=newHeight;
    }

    /*MODIFICADOR DE VARIABLES*/
    public void setName(String newName){
        name=newName;
    }

    public void setDni(String newDni){
        dni=newDni;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setGender(char newGender) {
        gender = newGender;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    /*DEVOLVER VALOR*/

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    /*FUNCIONES*/

    public void isAdult(){
        boolean adult;
        adult=(age>=18);
        System.out.println("¿Es adulto? -> " + adult);
    }

    public void hasIdealWeight(){
        double imc;
        imc=(weight/(height*height));
        System.out.println("Su IMC es: "+imc);
    }

    public void printData(){
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+age);
        System.out.println("DNI: "+dni);
        System.out.println("Genero: "+gender);
        System.out.println("Peso: "+weight);
        System.out.println("Altura: "+height);

    }
}
