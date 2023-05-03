public class Tama {
    public int tam(String palabra){
        int tama = 0;
        for (int i = 0; i < palabra.length(); i++) {
            tama++;
        }
        return tama;
    }
}
