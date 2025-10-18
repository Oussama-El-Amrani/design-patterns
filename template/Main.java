package template;

public class Main {
    public static void main(String[] args) {
        Template template = new MorocoImpl();
        System.out.println(template.perform(2,5));
        template = new Spaintempl();
        System.out.println(template.perform(2,5));
    }
}
