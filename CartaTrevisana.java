package carte;

public class CartaTrevisana extends Carta {

  final static private String[] semi = {"Bastoni","Coppe","Spade","Danari"};
  final static private String[] valori = {"Asso","Due","Tre","Quattro","Cinque","Sei","Sette","Otto","Nove","Re"};
  final static int GRANDEZZA_MAZZO = 40;
  final static int NUMERO_SEMI = semi.length;

  public CartaTrevisana(int numero, int seme){
    super(numero, seme, NUMERO_SEMI*(numero - 1) + seme);
  }

  public String toString(){
    return valori[this.numero - 1] + " di " + semi[this.seme - 1] + "  VALORE CARTA: " + this.valore;
  }
}
