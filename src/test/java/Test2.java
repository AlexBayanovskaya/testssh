import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    @Ignore
    @Test(expected = NullPointerException.class)
    public void test1() {
        List<String> list = new ArrayList<>();
        Assert.assertEquals(list.get(1), "з");
    }
}
