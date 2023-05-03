public class Invertir {
    public String inver(String palabra){
        StringBuilder invertida = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0;i--){
            invertida.append(palabra.charAt(i));
        }
        return invertida.toString();
    }
}
