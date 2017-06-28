package pneusFactory;

/**
 * Created by melvin on 28/06/17.
 */
public class MichelinFactory implements AbstractFactory {
    @Override
    public AbstractPneuNeige createPneuNeige() {
        return new PneuNeigeTourisme();
    }

    @Override
    public AbstractPneuPluie createPneuPluie() {
        return new PneuPluieTourisme();
    }
}
