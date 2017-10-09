import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestWithParametrs {

    private Integer num;

    public TestWithParametrs(Integer num) {

        this.num = num;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3}
        });
    }

    @Test
    public void t() {
        Assert.assertEquals(3, num, 0.1);
    }
}
