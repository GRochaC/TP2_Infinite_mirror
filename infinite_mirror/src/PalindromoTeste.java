import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromoTeste {
    Palindromo pal = new Palindromo();

    @Test
    public void stringNula() {
        assertEquals(true, pal.verificar(""));
    }

    @Test
    public void stringUnitaria() {
        assertEquals(true, pal.verificar("a"));
    }

    @Test
    public void stringDois() {
        assertEquals(false, pal.verificar("null"));
    }
}
