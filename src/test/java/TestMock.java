import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMock {

    private Example mock;
    private TestImpl test;

    @Before
    public void setup() {
        mock = EasyMock.createMock(Example.class);
        test = new TestImpl();
        test.setExample(mock);
    }

    @Test
    public void check(){
        mock.addDocument("Hello");
        EasyMock.replay(mock);
        test.documentAdd("Hello");
        EasyMock.verify(mock);
    }
}
