package carte;

public class CompositoreMazzo {

  public static Mazzo componiMazzoTrevisano(){
    Mazzo mazzoTrevisano = new Mazzo();
    for(int i = 1; i <= CartaTrevisana.NUMERO_SEMI; i++){
      for(int j = 1; j <= CartaTrevisana.GRANDEZZA_MAZZO/CartaTrevisana.NUMERO_SEMI; j++){
        mazzoTrevisano.add(new CartaTrevisana(j,i));
      }
    }
    return mazzoTrevisano;
  }

  public static void componiMazzoTrevisano(Mazzo mazzo){
    for(int i = 1; i <= CartaTrevisana.NUMERO_SEMI; i++){
      for(int j = 1; j <= CartaTrevisana.GRANDEZZA_MAZZO/CartaTrevisana.NUMERO_SEMI; j++){
        mazzo.add(new CartaTrevisana(j,i));
      }
    }
    mazzo.setMaxSize();
    mazzo.mescola();
  }

  public static Mazzo componiMazzoFrancese() {
    Mazzo mazzoFrancese = new Mazzo();
    for (int i = 1; i <= CartaFrancese.NUMERO_SEMI; i++) {
      for (int j = 1; j <= CartaFrancese.GRANDEZZA_MAZZO / CartaFrancese.NUMERO_SEMI; j++) {
        mazzoFrancese.add(new CartaFrancese(j, i));
      }
    }
    return mazzoFrancese;
  }

  public static void componiMazzoFrancese(Mazzo mazzo) {
    for (int i = 1; i <= CartaFrancese.NUMERO_SEMI; i++) {
      for (int j = 1; j <= CartaFrancese.GRANDEZZA_MAZZO / CartaFrancese.NUMERO_SEMI; j++) {
        mazzo.add(new CartaFrancese(j, i));
      }
    }
    mazzo.setMaxSize();
    mazzo.mescola();
  }
}
