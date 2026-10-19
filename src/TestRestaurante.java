public class TestRestaurante {
    public static void main(String[] args) {
        System.out.println("=== Restaurante 'La casa de Paco' ===");

        WareHouse almacdPaco = new WareHouse(10, 4);

        System.out.println("\n--- Estado Inicial ---");
        almacdPaco.showPotatoes();
        almacdPaco.showSausages();
        System.out.println("Comidas que se pueden ofrecer: " + almacdPaco.getNumberOfMeals());

        System.out.println("\n--- Añadiendo ingredientes ---");
        almacdPaco.addPotatoes(5);
        almacdPaco.addSausages(2);

        System.out.println("\n--- Estado Actualizado ---");
        almacdPaco.showPotatoes();
        almacdPaco.showSausages();
        System.out.println("Comidas que se pueden ofrecer ahora: " + almacdPaco.getNumberOfMeals());
    }
}