package logo;

import java.awt.*;

public abstract class Decoration extends Logo {

    Logo l;

    public Decoration(String img, double prix, Logo l){
        this.l = l;
        this.nom = img;
        this.prix = prix;
    }

    public MyImage getLogo(){
        return new MyImage(nom);
    }

    public double combienCaCoute(){
        return l.combienCaCoute() + prix;
    }
}
