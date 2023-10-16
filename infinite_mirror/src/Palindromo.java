public class Palindromo {
    public boolean verificar(String s) {
        s = s.toLowerCase();
        int inicio = 0, fim = s.length() -1;
        if(s.length() == 1 || s.isEmpty()) {
            return true;
        } else if(s.charAt(inicio) == s.charAt(fim)){
            String r = s.substring(inicio+1, fim);
            return verificar(r);
        }

        return false;
    }
}
