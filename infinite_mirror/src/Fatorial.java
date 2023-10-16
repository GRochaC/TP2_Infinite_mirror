public class Fatorial{
    public long calcular(int n) {
        if(n < 0) {
            throw new IllegalArgumentException();
        } else if (n <= 1) {
            return 1;
        } else {
            return n * calcular(n-1);
        }
    }
}