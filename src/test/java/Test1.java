import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    @Test(expected = IndexOutOfBoundsException.class)
    public void test1() {
        List<String> list = new ArrayList<>();
        Assert.assertEquals(list.get(1), "y");
    }
}
