package adapter;

import java.util.Arrays;

public class HdmiVgaAdapter implements VGA{
    protected HDMI hdmi;

    public HdmiVgaAdapter(HDMI hdmi){
        this.hdmi = hdmi;
    }

    @Override
    public void print(String s){
        hdmi.show(Arrays.toString(s.getBytes()));
    }
}