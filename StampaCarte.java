package carte;

public class StampaCarte {

  public static void main(String[] args) {
    //Carta c = new CartaFrancese(11,4);
    //Mazzo m = new Mazzo(CartaTrevisana.GRANDEZZA_MAZZO, CartaTrevisana.NUMERO_SEMI);
    //m.add(c);
    //System.out.println(c);

    Mazzo mazzoFrancese = new Mazzo();
    CompositoreMazzo.componiMazzoFrancese(mazzoFrancese);
    System.out.println(mazzoFrancese.toString());

    Mazzo mazzoTrevisano = new Mazzo();
    CompositoreMazzo.componiMazzoTrevisano(mazzoTrevisano);
    System.out.println(mazzoTrevisano.toString());

    System.out.println(CompositoreMazzo.componiMazzoFrancese().toString());
    System.out.println(CompositoreMazzo.componiMazzoTrevisano().toString());

  }

}
