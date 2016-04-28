
package Testing.Package;

import java.util.logging.Logger;
import operatii.Operatii;
import org.junit.*;
import static org.junit.Assert.*;


public class OperatiiTest {
    
    int x;
    
    public OperatiiTest(){
        
    }
    
    @Test
    public void testAduna(){
        int a = 10;
        int b = 10;
        Operatii op = new Operatii();
        int c = op.aduna(a,b);
        int d = a + b;
        
        assertTrue(c == d);
    }
}
