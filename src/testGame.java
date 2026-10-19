public class testGame {
    public static void main(String[] args) {
        Game p1 = new Game(5);
        p1.printLives();
        p1.damage(1);
        p1.printLives();


        Game2 p2 = new Game2(5);
        p2.printLifes();
        System.out.println(p2.damage(1));
    }
}
