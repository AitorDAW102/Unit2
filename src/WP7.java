public class WP7 {
    private String name;
    private int age;
    private String code;
    private int credits;

    public WP7(String newName, int newAge){
        name=newName;
        age=newAge;
        code="31332Q";
        credits=0;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void printDetails(){
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+age);
        System.out.println("Codigo: "+code);
        System.out.println("Creditos: "+credits);
    }
}