public class testGame {
    public static void main(String[] args) {
        Game p1 = new Game(5);
        p1.printLives();
        p1.damage(1);
        p1.printLives();
    }
}
