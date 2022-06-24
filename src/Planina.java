import java.util.ArrayList;

public class Planina {
    private String ime;
    private String nazivDrzave;
    private double visina;

    public double getVisina() {
        return visina;
    }

    public Planina(String ime, String nazivDrzave, double visina) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visina = visina;
    }
    public Planina getNajvisaPlanina(ArrayList<Planina>planine){
        Planina NajvisaPlanina = planine.get(0);
        for (int i = 1; i < planine.size(); i++){
            if (NajvisaPlanina.visina < planine.get(i).visina){
                NajvisaPlanina = planine.get(i);}
        }
        return NajvisaPlanina;
    }
}
 /*Kreirati klasu Planina koja od polja ima:
        String ime
        String nazivDrzave
        double visina
        Od metoda:
        konstruktor sa svim poljima (5P)
public double getVisina() getter koji vraca visina (5P)
public Planina getNajvisaPlanina(ArrayList<Planina> planine)metodu koja vraca najvisu planinu u datoj listi (5P)*/
