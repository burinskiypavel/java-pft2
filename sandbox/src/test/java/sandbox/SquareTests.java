package sandbox;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class SquareTests {

    @Test
    public void testAresa(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(),25.0);
    }
}
