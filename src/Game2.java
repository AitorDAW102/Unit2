public class Game2 {
    private int lifeLeft;
    private int initialLifes;
    private static int record=0;


    Game2(int initialLifes){
        this.initialLifes=initialLifes;
        lifeLeft=initialLifes;
    }

    public void printLifes(){
        System.out.println("Te quedan "+lifeLeft+" vidas");
    }

    public boolean damage(int damage) {
        if (lifeLeft>0) {
            lifeLeft -= damage;
        }
        return lifeLeft>0;
    }

    public void initializeGame(){
        lifeLeft=initialLifes;
        System.out.println("Ahora tienes "+lifeLeft+" vidas");
    }

    public void updateRecord(){
        if (lifeLeft==record){
            System.out.println("Has igualado el record");
        } else if (lifeLeft > record){
            System.out.println("EL NUEVO RECORD LOGRADO ES "+lifeLeft);
            record=lifeLeft;
        }

    }

}
