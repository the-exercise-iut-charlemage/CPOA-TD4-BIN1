package logo;

import java.awt.*;

public abstract class Logo {

    protected String nom;
    protected double prix;

    public abstract MyImage getLogo();

    public abstract double combienCaCoute();
}
