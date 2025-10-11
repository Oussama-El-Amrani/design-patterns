package adapter;

public class CentralUnit {
    private VGA display;

    public void setDisplay(VGA vga){
        this.display = vga;
    }
    
    public VGA getDisplay(){
        return display;
    }
    
    public void print(String s){
        display.print(s);
    }
}
