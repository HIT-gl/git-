import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class garpTest {

    /**
     * Test method for {@link garph#queryBridgeWords(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testQueryBridgeWords() throws IOException {
        garph G = new garph();
        
       //����һ
        assertSame("error2",G.queryBridgeWords("bad","way"));
        //������
        assertSame("error3",G.queryBridgeWords("it","good"));
        //������
        assertSame("error4",G.queryBridgeWords("it","has"));
        //������
        assertEquals("has ,",G.queryBridgeWords("it","been"));
    }

}
