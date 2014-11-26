package carte;

public class CartaFrancese extends Carta {

  final static private String[] semi = {"Cuori","Quadri","Fiori","Picche"};
  final static private String[] valori = {"Asso","Due","Tre","Quattro","Cinque","Sei","Sette","Otto","Nove","Dieci","Jack","Donna","Re"};
  final static int GRANDEZZA_MAZZO = semi.length * valori.length;
  final static int NUMERO_SEMI = semi.length;


  public CartaFrancese(int numero, int seme) {
    super(numero, seme, NUMERO_SEMI * (numero - 1) + seme);
  }

  public String toString(){
    return valori[this.numero - 1] + " di " + semi[this.seme - 1] + "  VALORE CARTA: " + this.valore;
  }
}
