import org.junit.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GeneralTest {

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("testBeforeClass");
    }

    @Before
    public void testBefore() {
        System.out.println("testBefore");
    }

    @Test
    public void testA() {
        System.out.println("A");
    }

    @Test
    public void testC() {
        System.out.println("C");
    }

    @Test
    public void testB() {
        System.out.println("B");
    }

    @After
    public void testAfter() {
        System.out.println("testAfter");
    }

    @AfterClass
    public static void testafterClass() {
        System.out.println("testAfterClass");
    }
}
