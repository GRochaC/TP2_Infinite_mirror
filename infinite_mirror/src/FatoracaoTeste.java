import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;
import org.junit.Test;


public class FatoracaoTeste {
    Fatoracao fat = new Fatoracao();

    @Test
    public void fatoracao1() {
        assertThrows(IllegalArgumentException.class, 
                    () -> {
                        fat.get_fatoracao(-1);
                    });
    }

    @Test
    public void fatoracao2() {
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(2, 1);

        assertEquals(map1, fat.get_fatoracao(2));
    }
}
