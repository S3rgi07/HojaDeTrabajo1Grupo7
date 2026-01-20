import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CarRadio myCarRadio = new CarRadio();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (myCarRadio.getIsOn() == false) {
                System.out.println("La radio está apagada. Presione 1 para encenderla o 7 para salir.");
                int option = scanner.nextInt();
                if (option == 1) {
                    myCarRadio.turnOnOff();
                } else if (option == 7) {
                    System.exit(0);
                }
                continue;
            } else {

                System.out.println("Bienvenido a la Radio del Carro");
                System.out.println("Estacion Actual: " + myCarRadio.getCurrentStation());
                System.out.println("Frecuencia Actual: " + Math.round(myCarRadio.getCurrentFrequency() * 100.) / 100.0);
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Encender/Apagar Radio");
                System.out.println("2. Cambiar Estacion"); // <--
                System.out.println("3. Avanzar Frecuencia"); // <--
                System.out.println("4. Retroceder Frecuencia"); // <--
                System.out.println("5. Guardar Frecuencia");
                System.out.println("6. Cargar Frecuencia Guardada"); // <--
                System.out.println("7. Salir");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        myCarRadio.turnOnOff();
                        break;

                    case 2:
                        myCarRadio.changeStation(myCarRadio.getCurrentStation());
                        break;

                    case 3:
                        myCarRadio.forwardFrequency();
                        break;

                    case 4:
                        myCarRadio.backwardFrequency();
                        break;

                    case 5:
                        System.out.println("Ingrese el slot donde desea guardar la frecuencia (1-12):");
                        int slotToSave = scanner.nextInt();
                        myCarRadio.saveFrequency(myCarRadio.getCurrentFrequency(), slotToSave - 1);
                        break;

                    case 6:
                        System.out.println("Ingrese el slot desde donde desea cargar la frecuencia (1-12):");
                        int slotToLoad = scanner.nextInt();
                        myCarRadio.loadFrequency(slotToLoad - 1);
                        break;

                    case 7:
                        System.exit(0);

                    default:
                        break;
                }
            }
        }

    }

}