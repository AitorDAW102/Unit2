public class TestEmploye {
    public static void main(String[] args) {
        Employe e1 = new Employe("Hector",5555);
        e1.printData();

        System.out.println("El empleado se llama "+e1.getName());
        System.out.println(e1.getName()+" cobra unos "+e1.getSalary()+"€ al mes");

        if (e1.payTaxes()){
            System.out.println(e1.getName()+" cobra mas de 3000 y le tocara pagar mas impuestos");
        }
        else{
            System.out.println(e1.getName()+" no cobra mas de 3000 y no le tocara pagar mas impuestos");

        }
    }
}
