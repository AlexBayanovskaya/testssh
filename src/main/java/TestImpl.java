public class TestImpl {

    Example example;

    public void setExample(Example example) {
        this.example = example;
    }

    public void documentAdd(String title) {
        example.addDocument(title);
    }
}
