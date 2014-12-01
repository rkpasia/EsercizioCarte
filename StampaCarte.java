package carte;

public class StampaCarte {

  public static void main(String[] args) {
    //Carta c = new CartaFrancese(11,4);
    //Mazzo m = new Mazzo(CartaTrevisana.GRANDEZZA_MAZZO, CartaTrevisana.NUMERO_SEMI);
    //m.add(c);
    //System.out.println(c);
    System.out.println("Con che carte vuoi giocare?\n1 - Francesi\n2 - Trevisane");
    int scelta = Leggi.unInt();

    Mazzo<Carta> mazzo = new Mazzo<Carta>();

    if(scelta == 1){
      CompositoreMazzo.componiMazzoFrancese(mazzo);
    }else if(scelta == 2){
      CompositoreMazzo.componiMazzoTrevisano(mazzo);
    }else{
      System.out.println("Il numero inserito non seleziona una tipologia di carte corretta.");
    }

    CartaPiuAltaVince.game(mazzo);
  }

}
