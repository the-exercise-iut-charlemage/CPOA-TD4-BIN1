package logo;


public class ReneLaTaupe extends Logo {
    
    /**
     * Constructeur
     */
    public ReneLaTaupe() {
        nom = "src/img/Taupe.jpg";
        prix=3.65;
    }
    
    /**
     * @return l'objet de MyImage correspondant a nomIm
     */
    @Override
    public MyImage getLogo(){
        return new MyImage(nom);
    }
    
    /**
     * @return le prix du logo
     */
    @Override
    public double combienCaCoute(){
        return prix;
    }
}
