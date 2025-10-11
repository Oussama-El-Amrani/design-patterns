package adapter;

public class HDMIToVGAAdapter implements VGA {
    private HDMI hdmiDevice;

    public HDMIToVGAAdapter(HDMI device) {
        this.hdmiDevice = device;
    }

    @Override
    public void print(String text) {
        hdmiDevice.show(text);
    }
}
