import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fatoracao {
    private int MAX = 1000+1;
    private ArrayList<Integer> primos;
    private Map<Integer,Integer> fatoracao;

    public Fatoracao() {
        primos = new ArrayList<>();
        for(int i = 0; i < MAX; i++) primos.add(i);

        primos.set(0, -1);
        primos.set(1, -1);

        check_primo(2);
    }

    private void check_primo(int n) {
        if(n >= MAX) return;

        if(primos.get(n) == n) {
            set_menor_primo(n+n,n);
        }

        check_primo(n+1);
    }

    private void set_menor_primo(int n, int primo) {
        if(n >= MAX) return;

        if(primos.get(n) == n) primos.set(n, primo);

        set_menor_primo(n+primo, primo);
    }

    Map<Integer,Integer> get_fatoracao(int n) {
        if(n < 2) {
            throw new IllegalArgumentException();
        }

        fatoracao = new HashMap<Integer,Integer>();

        fatorar(n);

        return fatoracao;
    }

    private void fatorar(int n) {
        if(n == 1) return;

        int menor_primo = primos.get(n);
        int prox = n/primos.get(n);
        
        if(!fatoracao.containsKey(menor_primo)) {
            fatoracao.put(menor_primo, 1);
        } else {
            fatoracao.replace(menor_primo, fatoracao.get(menor_primo)+1);
        }

        fatorar(prox);
    }
}
