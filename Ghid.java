
import java.util.Vector;


public class Ghid extends Persoana {

  private int Experienta;
  
  private String Name;

  private int Pret;

    private Vector  myDestinatii;
    /**
   * 
   * @element-type Destinatii
   */
  private Vector  myBD;
   
  public String getName() {
      return this.Name;
  }

  public Vector getLocation() {
      return this.myDestinatii;
  }

  public int getExperienta()
  {
      return this.Experienta;
  }
  
  public int getPrice() {
      return this.Pret;
  }

  public String Ghid() {
      return "Nume: " + this.Name + " cu " + this.Experienta + " de experienta" + " avand salariul" + this.Pret;
  }

}