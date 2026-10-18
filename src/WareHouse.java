public class WareHouse {
    private int potatoes;
    private int sausages;

    public WareHouse(int potatoes, int sausages) {
        this.potatoes = potatoes;
        this.sausages = sausages;
    }


    public int getNumberOfMeals() {
        int mealsFromPotatoes = this.potatoes * 3;
        int mealsFromSausages = this.sausages * 6;

        return Math.min(mealsFromPotatoes, mealsFromSausages);
    }

    public void addPotatoes(int p) {
        if (p > 0) {
            this.potatoes += p;
        }
    }

    public void addSausages(int s) {
        if (s > 0) {
            this.sausages += s;
        }
    }

    public void showPotatoes() {
        System.out.println("Patatas en el almacén: " + this.potatoes + " kg");
    }

    public void showSausages() {
        System.out.println("Salchichas en el almacén: " + this.sausages + " kg");
    }
}