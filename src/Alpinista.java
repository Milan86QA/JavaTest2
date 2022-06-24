import java.util.ArrayList;

public class Alpinista extends Planinar{

    private ArrayList<Alpinista> tim;
    int godineIskustva;

    public Alpinista(int id, int brojPoena, String ime, String prezime, ArrayList<Alpinista> tim, int godineIskustva) {
        super(id, brojPoena, ime, prezime);
        this.tim = tim;
        this.godineIskustva = godineIskustva;
    }

    @Override
    public double clanarina() {
        double clanarina = 1000 - this.getBrojPoena()*0.04;
       if (clanarina >= 0){
           return clanarina;}
       else { return 0;}
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        for (int i = 0; i<tim.size();i++){
            if (tim.get(i).godineIskustva >5){
                return true;}}
        return false;
    }
}
  /*  Kreirati klasu Kreirati klasu Alpinista koja nasledjuje Planinar i ima polja:
   ¬     ArrayList<Alpinista> tim
    ¬    int godineIskustva
        Od metoda:
¬public double clanarina() koja iznosi 1000 - 4% za svaki brojPoena (5P)
¬public boolean uspesanUspon(Planina p) koja racuna da li se objekat tipa Alpinista popeo na Planina p.
 Da li ce se alpinista popeti na planinu zavisi od toga da li ima barem jednog alpinisu u timu koji ima preko 5 ili vise godina iskustva u penjanju.
        konstruktor sa svim poljima (5P)*/