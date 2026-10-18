public class TestRestaurante {
    public static void main(String[] args) {
        System.out.println("=== Restaurante 'La casa de Paco' ===");

        // 1. Creamos el almacén con una cantidad inicial (ej. 10 kg de patatas y 4 kg de salchichas)
        WareHouse almacdPaco = new WareHouse(10, 4);

        // 2. Mostramos el estado inicial
        System.out.println("\n--- Estado Inicial ---");
        almacdPaco.showPotatoes();
        almacdPaco.showSausages();
        System.out.println("Comidas que se pueden ofrecer: " + almacdPaco.getNumberOfMeals());

        // 3. Añadimos más ingredientes
        System.out.println("\n--- Añadiendo ingredientes ---");
        almacdPaco.addPotatoes(5);   // Añadimos 5 kg más de patatas
        almacdPaco.addSausages(2);   // Añadimos 2 kg más de salchichas

        // 4. Mostramos el estado actualizado y las nuevas comidas posibles
        System.out.println("\n--- Estado Actualizado ---");
        almacdPaco.showPotatoes();
        almacdPaco.showSausages();
        System.out.println("Comidas que se pueden ofrecer ahora: " + almacdPaco.getNumberOfMeals());
    }
}