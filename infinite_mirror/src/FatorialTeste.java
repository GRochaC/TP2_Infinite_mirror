import static org.junit.Assert.*;

import org.junit.Test;;

public class FatorialTeste{
    Fatorial fat = new Fatorial();
    
    @Test
    public void fatZeroIgualUm() {
        assertEquals(1, fat.calcular(0));
    }

    @Test
    public void fatUmIgualUm() {
        assertEquals(1, fat.calcular(1));
    }

    @Test
    public void fatMenosUmIgualExp() {
        assertThrows(IllegalArgumentException.class, 
                    () -> {
                        fat.calcular(-1);
                    });
    }

    @Test
    public void fat8Igual40320() { 
    assertEquals(40320, fat.calcular(8));
    }

    

    @Test
    public void fat_5IgualExp() { 
        assertThrows(IllegalArgumentException.class, 
            () -> {
            fat.calcular(-5); 
            });
    }


    @Test
    public void fat18Igual6402373705728000() { 
    assertEquals(6402373705728000L, fat.calcular(18));
    }

    

    @Test
    public void fat4Igual24() { 
    assertEquals(24, fat.calcular(4));
    }

    

    @Test
    public void fat15Igual1307674368000() { 
    assertEquals(1307674368000L, fat.calcular(15));
    }

    

    @Test
    public void fat_4IgualExp() { 
        assertThrows(IllegalArgumentException.class, 
            () -> {
            fat.calcular(-4); 
            });
    }
    

    @Test
    public void fat10Igual3628800() { 
    assertEquals(3628800, fat.calcular(10));
    }
    

    @Test
    public void fat13Igual6227020800() { 
    assertEquals(6227020800L, fat.calcular(13));
    }

    

    @Test
    public void fat11Igual39916800() { 
    assertEquals(39916800, fat.calcular(11));
    }

    

    @Test
    public void fat_2IgualExp() { 
        assertThrows(IllegalArgumentException.class, 
            () -> {
            fat.calcular(-2); 
            });
    }
    

    @Test
    public void fat5Igual120() { 
    assertEquals(120, fat.calcular(5));
    }

    

    @Test
    public void fat17Igual355687428096000() { 
    assertEquals(355687428096000L, fat.calcular(17));
    }

    

    @Test
    public void fat12Igual479001600() { 
    assertEquals(479001600, fat.calcular(12));
    }

    

    @Test
    public void fat2Igual2() { 
    assertEquals(2, fat.calcular(2));
    }
}
