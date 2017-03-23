import java.util.Vector;

public class Persoana {

    private String nume;

    private int varsta;

    private String sex;

    private String prenume;

    private int CNP ;

    private Vector  myBD;

    public void getInfo() {
    }

    public void Persoana(int age, String name, String sex, String prenume, int cnp)
    {
        nume = name;
        varsta = age;
        sex = this.sex;
        CNP = cnp;
        prenume = this.prenume;
    }

}