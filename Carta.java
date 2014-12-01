package carte;

public class Carta {

  protected int numero;
  protected int seme;
  protected int valore;

  public Carta(int numero, int seme){
    this.numero = numero;
    this.seme = seme;
    this.valore = 0;
  }

  public Carta(int numero, int seme, int valore){
    this.numero = numero;
    this.seme = seme;
    this.valore = valore;
  }

  public static boolean compareTo(Carta c1, Carta c2){
    if(c1.valore < c2.valore){
      return false;
    }
    return true;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public void setSeme(int seme){
    this.seme = seme;
  }

  public int getNumero() {
    return numero;
  }

  public int getSeme() {
    return seme;
  }

  public int getValore() {
    return valore;
  }
}
