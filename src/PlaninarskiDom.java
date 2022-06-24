import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PlaninarskiDom {

    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanoviDoma;

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja, ArrayList<Planinar> clanoviDoma) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanoviDoma = clanoviDoma;}

    public void uclaniPlaninara(Planinar p){
    clanoviDoma.add(p);}
    public int uspesnoPopeli() {
        int brojPlaninara = 0;
        for (Planinar x : clanoviDoma) {
            if (x.getBrojPoena() > 0) {
                brojPlaninara++;}
        }
        return brojPlaninara;}
    public void izbaciPlaninara(int idPlaninara){
        clanoviDoma.remove(idPlaninara);
    }
    public double mesecniPrihod(){
        double prihod = 0;
        for (Planinar x : clanoviDoma){
            prihod += x.clanarina();
        }
        return  prihod;
        }
    public ArrayList<Planinar> sortPlaninari(){
        Collections.sort(clanoviDoma, Collections.reverseOrder());
    return clanoviDoma;
    }}
/* Kreirati klasu PlaninarskiDom koja ima polja:
        ¬String nazivDoma
        ¬int godinaOsnivanja
       ¬ ArrayList<Planinar> clanoviDoma
        Od metoda:
       ¬ konstruktor sa svim poljima (5P)
¬public void uclaniPlaninara(Planinar p)koja dodaje Planinar p u clanoviDoma5(P)
¬public int uspesnoPopeli()koja vraca broj planinara koji su se uspesno popeli na barem jednu planinu 5(P)
¬public void izbaciPlaninara(int idPlaninara)koja izbacuje planinara iz clanoviDoma prema unetom  idPlaninara (5P)
¬public double mesecniPrihod() koja racuna i vraca mesecni prihod od clanarina svih planinara
¬public ArrayList<Planinar> sortPlaninari()koja sortira planinare po brojPoena ostvarenih za svaku savladanu planinu
        od najuspesnijeg do namanje uspesnog planinara (5P)*/