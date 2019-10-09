package logo;

public class Lunette extends Decoration {

    public Lunette(int x, int y, Logo l) {
        super("src/img/Sunglasses.png", 1d, l, x, y);
    }

    @Override
    public MyImage getLogo() {
        MyImage logo = this.l.getLogo();
        logo.paintOver(this.nom, this.x, this.y);
        return logo;
    }
}
