package decorator;

public class Main {
    public static void main(String[] args) {
        Boisson boisson = new Expresso();
        System.out.println("---------------"+ boisson.getDescription());
        System.out.println("------------------------------------------");
        boisson = new Caramel(boisson);
        System.out.println("---------------"+ boisson.getDescription());
        boisson = new Chocolat(boisson);
        System.out.println("---------------"+ boisson.getDescription());
        boisson = new Chocolat(boisson);
        System.out.println("---------------"+ boisson.getDescription());

        System.out.println("cout final = "+ boisson.cout());
    }
}
