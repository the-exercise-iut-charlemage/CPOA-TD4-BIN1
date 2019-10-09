package logo;

public abstract class Logo {

    protected String nom;
    protected double prix;

    public abstract MyImage getLogo();

    public abstract double combienCaCoute();
}
