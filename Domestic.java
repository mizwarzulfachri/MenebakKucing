import java.util.Random;
//  ~~ Adapter pattern ~~

public class Domestic extends catSize implements catBehavior {
    
    public Domestic(Size getSize) {
        super(getSize);
    }
    
    @Override
    public void catSize() {
        getSize.size();
    }

    public void food() {
        Random rand = new Random();
        int num = rand.nextInt(3);

        //Clue random
        switch (num) {
            case 0:
                System.out.println("Saya makan sisa makanan siang.");
                break;
            case 1:
                System.out.println("Saya bisa makan daging.");
                break;
            case 2:
                System.out.println("Saya suka makan ikan atau tulang.");
                break;
            default:
                System.out.println("Saya minum air");
        }
    }

    public void cry() {
        System.out.println("Suara saya adalah Meow!\n");
    }

}
