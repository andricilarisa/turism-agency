/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator6ip;

import pachet1.BD;
import pachet1.MijlocDeTransport;
import pachet1.mijlocDeCalatorie;

/**
 *
 * @author Alex-chan
 */
public class Laborator6IP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MijlocDeTransport test = new MijlocDeTransport();
    test.numeDestinatie[0] = "Malta";
    test.numeTransport[0] = "Alvo SRL";
    test.dataPlecare[0] = 112017;
    test.checkPlace("31414", "Malta", "Alvo SRL", 112017);
    
    }
    
}
