import java.util.Scanner;

public class Fragmento {
    public String fragmento(String palabra){
        Scanner scanner = new Scanner(System.in);
        String nuevaPalabra = " ";
        System.out.println("Ingrese el rango del fragmento.");
        System.out.println("Del caracter: ");
        int inicio = scanner.nextInt();
        System.out.println("Al caracter: ");
        int fin = scanner.nextInt();

        if(fin <= palabra.length() || inicio < fin){
            for (int i = inicio; i < fin; i++) {
                if (i < palabra.length()) {
                    nuevaPalabra += palabra.charAt(i);
                } else {
                    break;
                }
            }
        }else{
            System.out.println(" Rango de caracteres invalido.");
        }

        return nuevaPalabra;
    }
}


