//package pachet1;
package ip;
import java.util.Vector;
import java.util.*;

public class Ghid extends Persoana {

  private int Experienta;
  
  private String Name;

  private int Pret;
  
  private int nrLocuriLibere=10;

  private String myDestinatii;
    /**
   * 
   * @element-type Destinatii
   */
  private Vector  myBD;
  
  public String getName() {
      return this.Name;
  }

  public String getLocation() {
      return this.myDestinatii;
  }

  public int getExperienta()
  {
      return this.Experienta;
  }
  
  //
  private void setName(String nume){
      this.Name=nume;
  }
  
  public int getNrLocuriLibere(){
      return this.nrLocuriLibere;
  }
  //
  public int getPrice() {
      return this.Pret;
  }

  public String Ghid() {
      return "Nume: " + this.Name + " cu " + this.Experienta + " de experienta" + " avand salariul" + this.Pret;
  }
  

}
