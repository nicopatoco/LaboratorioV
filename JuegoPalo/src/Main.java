import edu.utn.MazoCartas;
import edu.utn.Jugador;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MazoCartas mazoCartas = new MazoCartas();
        System.out.println(mazoCartas.getMazo());
        System.out.println(mazoCartas.getMazo().size());

        Jugador player1 = new Jugador("Nico", mazoCartas, "Basto");
        Jugador player2 = new Jugador("Juan", mazoCartas, "Espada");
        Jugador player3 = new Jugador("Pedro", mazoCartas, "Oro");
        Jugador player4 = new Jugador("Alejandro", mazoCartas, "Copa");

        player1.start();
        player2.start();
        player3.start();
        player4.start();

        Thread.sleep(2000);
        System.out.println(mazoCartas.getMazo().size());

    }
}
