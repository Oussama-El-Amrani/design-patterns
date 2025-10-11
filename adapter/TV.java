package adapter;

public class TV implements HDMI {
    private String data;

    @Override
    public void show(String text) {
        this.data = text;
        System.out.println(data);
    }
}
