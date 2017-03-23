import java.util.Vector;
public class Hotel {

  private String nume;

  private String Recenzii;

  private int nrStele;

    /**
   * 
   * @element-type Destinatii
   */
  private Vector  myDestinatii;
  private Vector  myBD;

  public int getInfo() {
      return this.nrStele;
  }

  public String getRecenzii() {
      return this.Recenzii;
  }

  public String Hotel() {
      return this.nume;
  }

}