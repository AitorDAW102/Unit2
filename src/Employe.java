public class Employe {
    private String name;
    private int salary;

    public Employe(String newName, int newSalary){
        name=newName;
        salary=newSalary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public void printData(){
        System.out.println("Nombre: "+name);
        System.out.println("Salario: "+salary+"€");
    }

    public boolean moreThan3000(){
        boolean money=(salary>3000);
        return money;
    }
}
