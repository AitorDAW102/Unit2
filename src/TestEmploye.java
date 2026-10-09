public class TestEmploye {
    public static void main(String[] args) {
        Employe e1 = new Employe("Yolanda",5600);
        System.out.println("El empleado se llama "+e1.getName());
        System.out.println(e1.getName()+" cobra unos "+e1.getSalary()+"€ al mes");
        System.out.println("¿"+e1.getName()+" cobra mas de 3000? "+e1.moreThan3000());
    }
}
