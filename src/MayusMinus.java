public class MayusMinus {
    public int Mayusculas(String palabra){
        int mayus = 0;
        for(int i=0;i<palabra.length();i++){
            char letra = palabra.charAt(i);
            if (Character.isUpperCase(letra)) {
                mayus++;
            }
        }
        return mayus;
    }
    public int Minusculas(String palabra){
        int minus = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (Character.isLowerCase(letra)) {
                minus++;
            }
        }
        return minus;
    }
}
