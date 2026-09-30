public class Pajaro {
    private String color;
    private int edad;

    public void setEdad(int newEdad){
        edad=newEdad;
    }

    public void printEdad(){
        System.out.println("La edad es: "+edad);
    }

    public void setColor(String newColor){
        color=newColor;
    }

    public void printColor(){
        System.out.println("El color es: "+color);
    }
}
