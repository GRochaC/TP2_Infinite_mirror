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

    @Test
    public void fatoracao461() {
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(461, 1);

        assertEquals(map1, fat.get_fatoracao(461));
    }

    @Test
    public void fatoracao728() {
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(2, 3);
        map1.put(7, 1);
        map1.put(13, 1);

        assertEquals(map1, fat.get_fatoracao(728));
    }

    @Test
    public void fatoracao1000() {
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(2, 3);
        map1.put(5, 3);

        assertEquals(map1, fat.get_fatoracao(1000));
    }

    @Test
    public void fatoracao76() {
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(2, 2);
        map1.put(19, 1);

        assertEquals(map1, fat.get_fatoracao(76));
    }
}
