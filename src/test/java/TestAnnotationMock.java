import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

public class TestAnnotationMock extends EasyMockSupport {

    @Rule
    public EasyMockRule easyMockRule = new EasyMockRule(this);

    @Mock
    private Example mock;

    @TestSubject
    private TestImpl test = new TestImpl();

    @Test
    public void addDocument() {
        mock.addDocument("Hello");
        replayAll();
        test.documentAdd("Hello");
        verifyAll();

    }

}
