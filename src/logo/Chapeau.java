package logo;

public class Chapeau extends Decoration {

    public Chapeau(int x, int y, Logo l) {
        super("src/img/Chapeau.png", 1d, l, x, y);
    }

    @Override
    public MyImage getLogo() {
        MyImage logo = this.l.getLogo();
        logo.paintOver(this.nom, this.x, this.y);
        return logo;
    }
}
