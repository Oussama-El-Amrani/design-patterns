package adapter;

public class Monitor implements VGA {
    private String content;

    @Override
    public void print(String text) {
        this.content = text;
        System.out.println(content);
    }
}
