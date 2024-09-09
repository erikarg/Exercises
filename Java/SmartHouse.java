import java.util.Scanner;

public class SmartHouse {
    private boolean isLampOn;

    public SmartHouse() {
        this.isLampOn = false;
    }

    public void turnLampOn() {
        this.isLampOn = true;
    }

    public void turnLampOff() {
        this.isLampOn = false;
    }

    public boolean isLampTurnedOn() {
        return isLampOn;
    }

    public static void main(String[] args) {
        SmartHouse house = new SmartHouse(); // Create an instance of SmartHouse
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um comando (ligar/desligar) ou 'sair' para encerrar:");
            String userInput = scanner.nextLine().trim().toLowerCase();

            switch (userInput) {
                case "sair":
                    System.out.println("Saindo...");
                    scanner.close();
                    return; // Exit the main method

                case "ligar":
                    if (house.isLampTurnedOn()) {
                        System.out.println("A lâmpada já está ligada.");
                    } else {
                        house.turnLampOn();
                        System.out.println("A lâmpada ligou.");
                    }
                    break;

                case "desligar":
                    if (house.isLampTurnedOn()) {
                        house.turnLampOff();
                        System.out.println("A lâmpada desligou.");
                    } else {
                        System.out.println("A lâmpada já está desligada.");
                    }
                    break;

                default:
                    System.out.println("Comando inválido. Por favor, digite 'ligar' para ligar ou 'desligar' para desligar.");
                    break;
            }
        }
    }
}
