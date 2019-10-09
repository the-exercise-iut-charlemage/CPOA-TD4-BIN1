package logo;

public abstract class Decoration extends Logo {

    protected Logo l;
    protected int x, y;

    public Decoration(String img, double prix, Logo l, int x, int y){
        this.l = l;
        this.nom = img;
        this.prix = prix;
        this.x = x;
        this.y = y;
    }

    public MyImage getLogo() {
        MyImage logo = this.l.getLogo();
        logo.paintOver(this.nom, this.x, this.y);
        return logo;
    }

    public double combienCaCoute() {
        return l.combienCaCoute() + prix;
    }
}
