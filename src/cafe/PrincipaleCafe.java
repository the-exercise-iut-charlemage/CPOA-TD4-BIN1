package cafe;

public class PrincipaleCafe {

    public void run() {
        Boisson deca = new BoissonChantilly(new BoissonChantilly(new BoissonCreme(new Deca())));
        System.out.println(deca.toString());
    }

    public static void main(String[] args) {
        new PrincipaleCafe().run();
    }
}
