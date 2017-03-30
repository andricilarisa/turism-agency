package pachet1;

import java.util.Vector;

public class MijlocDeTransport {

    private String[] nrMatricol = new String[25];

    private int[] dataPlecare = new int[25];

    private String[] numeDestinatie = new String[25];

    private String[] numeTransport = new String[25];

    private int nrLocuri;
    private int nrPersoane;

    private Vector  myInterfataAplicatie;
    /**
     *
     * @element-type Turist
     */
    private Vector  transport;
    private Vector  myBD;
    /**
     *
     * @element-type Destinatii
     */
    private Vector  myDestinatii;

    public void getDataPlecare() {
    }

    public void getOraPlecare() {
    }

    public void mijlocDeCalatorie() {
        this.dataPlecare[0] = 0;
        this.nrLocuri = 0;
        this.nrPersoane = 0;
        this.nrMatricol[0] = null;
        this.numeDestinatie[0] = null;
        this.numeTransport[0] = null;
    }
    
    public void checkPlace(String nrMatricol, String numeDestinatie, String numeTransport, int dataPlecare)
    {
        for(int i = 0; i < this.dataPlecare.length; ++i)
            if(this.dataPlecare[i] == dataPlecare)
            {
                for(int j = 0; j < this.numeDestinatie.length; ++j)
                     if(this.numeDestinatie[i].equals(numeDestinatie))
                    {
                        for(int k = 0; k < numeTransport.length(); ++k)
                            if(this.numeTransport[j].equals(numeTransport))
                            {
                                if(this.nrLocuri == 0) System.out.println("Nu mai sunt locuri disponibile! Va rugam selectati alta optiune!");
                                else {
                                      this.nrLocuri--;
                                      this.nrMatricol[this.nrPersoane++] = nrMatricol;
                                    }
                            }
                    }   
            }
    }
}