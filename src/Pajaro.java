public class Pajaro {
    private String color;
    private int edad;
    private boolean esHembra;

    public Pajaro(){
        color = "Verde";
        edad=0;
        esHembra=true;
    }

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

    public void setEsHembra(boolean sexo){
        esHembra=sexo;
    }

    public void printSexo(){
        System.out.println("¿El pajaro es hembra? "+esHembra);
    }
}
