package pneusFactory;

/**
 * Created by melvin on 28/06/17.
 */
public class GoodyearFactory implements AbstractFactory {
    @Override
    public AbstractPneuNeige createPneuNeige() {
        return new PneuNeigeSport();
    }

    @Override
    public AbstractPneuPluie createPneuPluie() {
        return new PneuPluieSport();
    }
}
