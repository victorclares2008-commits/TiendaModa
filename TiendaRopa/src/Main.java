import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ TIENDA DE MODA ------");
        System.out.println("¿Que prenda te gustaría llevarte hoy?");
        System.out.println("1. Camiseta - 15 €\n" +
                "2. Pantalón - 25 €\n" +
                "3. Zapatillas - 40 €\n" +
                "4. Gorra - 10 €\n" +
                "5. Sudadera - 30 €");

        int numeros = sc.nextInt();
        sc.nextLine();


        int camiseta = 0;
        int pantalen = 0;
        int zapatillas = 0;
        int gorra = 0;
        int sudadera = 0;
        String prenda = "";

        if (numeros ==1){
            camiseta = 15;
            prenda = "Camiseta";
        }
        else if (numeros ==2){
            pantalen = 25;
            prenda = "Pantalen";
        }
        else if (numeros ==3){
             zapatillas = 40;
             prenda = "Zapatillas";
        }
        else if (numeros ==4){
            gorra = 10;
            prenda = "Gorra";
        }
        else if (numeros ==5){
            sudadera =  30;
            prenda = "Sudadera";
        }

        int cuenta = camiseta + pantalen + zapatillas + gorra + sudadera;

        System.out.println("Gracias por comprar " + prenda);

        System.out.println("------ RESUMEN DE COMPRA ------");
        System.out.println("El precio total de tu compra es: " + cuenta + " €");
        System.out.println("¡De nada por apliar tu armario!HELLOOOO");

    }
}