package template;

public class MorocoImpl extends Template{
    @Override
    public int param1() {
        return 3;
    }

    @Override
    public double compute(int a, int b) {

        return Math.sqrt(a*a + b*b);
    }
}
