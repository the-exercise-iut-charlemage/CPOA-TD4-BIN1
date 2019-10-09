package logo;


public class Main {

    public static void main(String args[]) {

        Logo logo = new Chapeau(280, 42, new Lunette(255, 76, new Lunette(100, 150, new Candy(425, 200, new Smiley(255, 225, new ReneLaTaupe())))));
        logo.getLogo().display();


    }

}
