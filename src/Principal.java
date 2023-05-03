import java.util.Scanner;

public class Principal {
    public void entrada(){
        Scanner scanner = new Scanner(System.in);
        Invertir invertir = new Invertir();
        Fragmento fragmento = new Fragmento();
        Tama tama = new Tama();
        MayusMinus mayusMinus = new MayusMinus();
        int opcion;

        System.out.println(" Ingrese una cadena de caracteres");
        String palabra;
        palabra = scanner.nextLine();
        do{


            System.out.println("-- QUE OPERACION DESEA REALIZAR--");
            System.out.println(" [0] Cambiar Cadena de caracteres.");
            System.out.println(" [1] Calcular mayusculas y minusculas.");
            System.out.println(" [2] Mostrar el tamaño de la cadena.");
            System.out.println(" [3] Extraer un fragmento de la cadena");
            System.out.println(" [4] Escribir alreves.");
            System.out.println(" [5] Salir.");
            opcion = scanner.nextInt();
            switch (opcion){
                case 0:
                    System.out.println(" Ingrese una cadena de caracteres");
                    palabra = scanner.nextLine();
                    break;
                case 1:
                    int totalMayus = mayusMinus.Mayusculas(palabra);
                    int totalMinus = mayusMinus.Minusculas(palabra);
                    System.out.println("La cadena de caracteres cuenta con: "+totalMayus+" letras mayusculas");
                    System.out.println("La cadena de caracteres cuenta con: "+totalMinus+" letras minusculas");
                    break;
                case 2:
                    int tam = tama.tam(palabra);
                    System.out.println("La cadena tiene un tamaño de: "+tam+" caracteres");
                    break;
                case 3:
                    String nuevaPalabra = fragmento.fragmento(palabra);
                    System.out.println("Cadena extraida: "+nuevaPalabra);
                    break;
                case 4:
                    String invertida = invertir.inver(palabra);
                    System.out.println("Cadena invertida:");
                    System.out.println(invertida);
                    break;
                default:
            }

        }while(opcion != 5);

    }
}
