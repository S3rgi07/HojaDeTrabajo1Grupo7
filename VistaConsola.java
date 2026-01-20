public class VistaConsola {
    CarRadio carRadio = new CarRadio();

    public void mostrarMenu() {
        System.out.println("Bienvenido a la Radio del Carro");
        System.out.println("Estación actual: " + carRadio.getCurrentStation());
        System.out.println("Frecuencia actual: " + carRadio.getCurrentFrequency());
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Encender/Apagar Radio");
        System.out.println("2. Cambiar Estacion");
        System.out.println("3. Avanzar Frecuencia");
        System.out.println("4. Retroceder Frecuencia");
        System.out.println("5. Guardar Frecuencia");
        System.out.println("6. Cargar Frecuencia");
    }
}
