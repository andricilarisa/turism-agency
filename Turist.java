//package pachet1;
package ip;
import java.util.*;

public class Turist extends Client {

  public String numeDestinatie;

  public String numeTransport;

  public Date perioadaSejur;

    public MijlocDeTransport transport ;
    public Destinatii Locatie;
    public Vector  myBD;

 public void setDestination(String s){
     this.numeDestinatie=s;
 }
    
  public String getDestination() {
      return this.numeDestinatie;
  }

  public void getTransport() {
  }

  public void getPerioadaSejur() {
  }

  public void Turist() {
  }
    // De testat 
  public int Cerere(Ghid g){
      String turistDest = this.getDestination();
      String ghidDest = g.getLocation();
      if(turistDest.equals(ghidDest))
          if(g.getNrLocuriLibere()>0)
              return 1;
      return 0;
  }

}
