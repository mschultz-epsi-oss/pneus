package pneusFactory;

/**
 * Created by melvin on 28/06/17.
 */
public interface AbstractFactory {
    AbstractPneuNeige createPneuNeige();
    AbstractPneuPluie createPneuPluie();
}
