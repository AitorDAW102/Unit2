public class TestEmploye {
    public static void main(String[] args) {
        Employe e1 = new Employe("Hector",5555);
        e1.printData();

        System.out.println("El empleado se llama "+e1.getName());
        System.out.println(e1.getName()+" cobra unos "+e1.getSalary()+"€ al mes");

        System.out.println("¿"+e1.getName()+" cobra mas de 3000 y le tocara pagar mas impuestos? "+e1.payTaxes()+" Es de unos"+e1.getSalary());
    }
}
