public class App {
    public static void main(String[] args) throws Exception {

        double saldo = 25.0;
        double valorSoclicitado = 26.0;

        if (valorSoclicitado < saldo) {
            saldo = saldo - valorSoclicitado;
            System.out.println("saldo -> " + saldo);

        } else {
            System.out.println("saldo insuficiente");
        }

    }
}
