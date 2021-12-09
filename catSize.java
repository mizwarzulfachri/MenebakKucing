//  ~~ Strategy pattern ~~

public abstract class catSize {

    protected Size getSize;
    public catSize(Size getSize) {this.getSize = getSize;}
    public void cat() { getSize.size(); }

}
