//  ~~ Adapter pattern ~~

public class WildCat extends catSize implements wildBehavior {

    public WildCat(Size getSize) {
        super(getSize);
    }

    @Override
    public void catSize() {
        getSize.size();
    }

    public void food() {
        System.out.println("Saya suka makan daging.");
    }

    public void cry() {
        System.out.println("Suara saya adalah Roar!");
    }

}
