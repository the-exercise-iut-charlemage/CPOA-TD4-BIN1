package logo;

public class CrazyFrog extends Logo {

    public CrazyFrog() {
        nom = "src/img/CrazyFrog.jpg";
        prix=3.65;
    }

    @Override
    public MyImage getLogo(){
        return new MyImage(nom);
    }

    @Override
    public double combienCaCoute(){
        return prix;
    }
}
