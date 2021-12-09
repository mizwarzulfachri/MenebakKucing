//  ~~ Adapter pattern ~~

public class AdapterBehavior implements catBehavior {

    wildBehavior cat;

    public AdapterBehavior(wildBehavior inCat) {
        cat = inCat;
    }

    @Override
    public void catSize() {
        cat.catSize();
    }

    @Override
    public void food() {
        cat.food();
    }
    
    @Override
    public void cry() {
        cat.cry();
    }
}
