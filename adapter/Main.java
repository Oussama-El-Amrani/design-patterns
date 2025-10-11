package adapter;

public class Main {
    public static void main(String[] args) {
        CentralUnit computer = new CentralUnit();
        
        VGA monitorDevice = new Monitor();
        computer.setDisplay(monitorDevice);
        computer.print("Connected via VGA");
        
        HDMI television = new TV();
        VGA adapter = new HDMIToVGAAdapter(television);
        computer.setDisplay(adapter);
        computer.print("Connected via HDMI with adapter");
    }
}
