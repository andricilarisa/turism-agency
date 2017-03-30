package pachet1;

import java.util.Vector;

public class Pachete {

  public  int pretPromotional;

  public  String Informatii ;

  public String numePachet ;

  public String recenzii ;
  
  

    public String[]  myDestinatii;
    /**
   * 
   * @element-type Destinatii
   */

  public void getInfo() {
  }

  public Pachete(String numePachet, int pret, String info, String recenzii, String[] destinatii) {
	  this.numePachet = numePachet;
	  this.pretPromotional = pret;
	  this.Informatii = info;
	  this.recenzii = recenzii;
	  for (int i = 0; i < destinatii.length; ++i) {
		  this.myDestinatii[i] = destinatii[i];
	  }
  }
  

public int getPretPromotional() {
	return pretPromotional;
}

public void setPretPromotional(int pretPromotional) {
	this.pretPromotional = pretPromotional;
}

public String getInformatii() {
	return Informatii;
}

public void setInformatii(String informatii) {
	Informatii = informatii;
}

public String getNumePachet() {
	return numePachet;
}

public void setNumePachet(String numePachet) {
	this.numePachet = numePachet;
}

public String getRecenzii() {
	return recenzii;
}

public void setRecenzii(String recenzii) {
	this.recenzii = recenzii;
}

public String[] getMyDestinatii() {
	return myDestinatii;
}

public void setMyDestinatii(String[] myDestinatii) {
	this.myDestinatii = myDestinatii;
}

	public String afisareDestinatii() {
		String afisare = "";
		for (int i = 0; i < this.myDestinatii.length; ++i) {
			afisare = afisare + myDestinatii[i] + "\n";
		}
		return afisare;
	}

	public String afisareInformatiiPachet() {
		String informatiiPachet = "";
		informatiiPachet = "Numele pachetului este: " + getNumePachet() + "\n";
		informatiiPachet = informatiiPachet + "Pretul pachetului este: " + getPretPromotional() + "\n";
		informatiiPachet = informatiiPachet + "Informatii aditionale despre pachet: " + getInformatii() + "\n";
		informatiiPachet = informatiiPachet + "Recenzii: " + getRecenzii() + "\n";
		informatiiPachet = informatiiPachet + "Destinatiile din pachet sunt: " + afisareInformatiiPachet();
		
		return informatiiPachet;
	}

}