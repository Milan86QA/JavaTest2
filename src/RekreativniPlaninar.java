public class RekreativniPlaninar extends Planinar {
    private double tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(int id, int brojPoena, String ime, String prezime, double tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(id, brojPoena, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;}

    public double clanarina(){
        double clanarina = 1000 - this.getBrojPoena() * 0.01;
        if (clanarina >= 0) {
            return clanarina;
        }else {return 0;}
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        double maxUsponPlaninara = maxUspon - this.tezinaOpreme * 50;
        if (maxUsponPlaninara < p.getVisina()){
        return false;
    } else { int brPoena = getBrojPoena();
            setBrojPoena(brPoena +1);
            return true;}}

    @Override
    public String toString() {
        return super.toString() + "\nTezina opreme: " + this.tezinaOpreme + "\nNaziv okruga: " +
                this.nazivOkruga + "\nMax uspon: " + this.maxUspon;
    }
}
   /* Kreirati klasu RekreativniPlaninar koja nasledjuje Planinar i ima polja:
        double tezinaOpreme¬
        String nazivOkruga¬
        double maxUspon¬
        Od metoda:
¬public double clanarina() koja iznosi 1000 - 1% za svaki brojPoena (5P)
¬public boolean uspon(Planina p) koja racuna da li se objekat tipa RekreativniPlaninar popeo na Planina p.
Da li ce rekreativni planinar uspešno popeti na planinu zavisi od toga da li je njegov najveci uspon manji od visine planine,
s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da prede 50 metara manje. Ukoliko je uspon uspesan, povecaj brojPoena  za 1(5P)

       ¬ konstruktor sa svim poljima (5P)*/