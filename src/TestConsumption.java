public class TestConsumption {
    public static void main(String[] args) {
        Consumption c1= new Consumption(43,60,120,2);
        System.out.println(c1.getTime());
        System.out.println(c1.avarageConsumption());
        System.out.println(c1.avaragePrice());

    }
}
