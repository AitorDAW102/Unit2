public class Game {
    private int liveLeft;

    Game(int live){
        liveLeft=live;
    }

    public void printLives(){
        System.out.println("Te quedan "+liveLeft+" vidas");
    }

    public void damage(int damage) {
        liveLeft-=damage;
    }
}
