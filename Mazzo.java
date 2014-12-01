package carte;
import prog.utili.*;

/**
 * Created by Riccardo on 26/11/14.
 */
public class Mazzo<E> extends Sequenza<E> {

  private int MaxSize;

  public Carta estrai() {
    Carta carta = (Carta) this.toArray()[0];
    this.remove((E) carta);
    return carta;
  }

  public void setMaxSize(){
    this.MaxSize = this.size();
  }
  public int getMaxSize(){
    return MaxSize;
  }
}
