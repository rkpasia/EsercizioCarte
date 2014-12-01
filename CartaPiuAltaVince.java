package carte;

/**
 * Created by Riccardo on 01/12/14.
 */
public class CartaPiuAltaVince {

  private static String g1 = "G1";
  private static String g2 = "G2";

  public static void game(Mazzo mazzo){
    Carta cg1,cg2;
    for(int i = 0; i < (mazzo.getMaxSize()/2); i++){
      System.out.println(i + "\n");
      cg1 = mazzo.estrai();
      cg2 = mazzo.estrai();
      System.out.println(cg1);
      System.out.println(cg2);
      if(Carta.compareTo(cg1,cg2)){
        System.out.println("Ha vinto" + g1);
      }else{
        System.out.println("Ha vinto" + g2);
      }
      System.out.println("Continuare?");
      if(!Leggi.unBoolean()) break;
      System.out.println("\n" + mazzo.size());
    }
    System.out.println("Le carte nel mazzo sono finite.");
  }
}
