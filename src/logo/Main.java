package logo;



public class Main
{
   
    public static void main(String args[])
    {
//        ReneLaTaupe l = new ReneLaTaupe();
//        MyImage i = l.getLogo();
//
//        i.paintOver("src/img/Chapeau.png", 280, 42);
//        i.paintOver("src/img/Sunglasses.png", 255, 76);
//
//        i.display();  // Permet l'affichage dans une fenetre de l'image associee

        Logo logo = new Chapeau( 280, 42, new Lunette( 255, 76, new Lunette(100, 150, new ReneLaTaupe())));
        logo.getLogo().display();
        
        
    }
        
}
