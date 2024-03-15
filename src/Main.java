public class Main {
    public static void main(String[] args) {

        Cliente fulano = new Cliente("Pedro", 127, 458796,1000);
        Cliente beltrano = new Cliente("ana", 587, 965841,200);

        System.out.println(fulano.mostrar());
        fulano.realizarDeposito(9000);
        fulano.realizarSaque(4785);
        System.out.println(fulano.mostrar());

        System.out.println(beltrano.mostrar());
        beltrano.realizarDeposito(845);
        beltrano.realizarSaque(900.5f);
        System.out.println(beltrano.mostrar());

    }
}