public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(55.5,55.5,55.5);

        System.out.println("Los lados del tringulo son: "+t1.getL1()+", "+t1.getL2()+", "+t1.getL3());
        System.out.println("¿por lo que es un triangulo equilatero? "+t1.isEquilateral());
    }
}
