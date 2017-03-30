package pachet1;

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

  public void Hotel()
  {
      this.nume = null;
      this.Recenzii = null;
      this.nrStele = 0;
  }

  public void setRecenzii(String recenzie)
  {
      this.Recenzii = recenzie;
  }

  public String getRecenzii()
  {
      return this.Recenzii;
  }

  public void setInfo(int numar_stele)
  {
      this.nrStele = numar_stele;
  }

  public int getInfo()
  {
      return this.nrStele;
  }

}