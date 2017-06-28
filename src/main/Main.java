package main;

import pneusFactory.*;

public class Main {

    public static void main(String[] args) {
        AbstractFactory usinePneu = new GoodyearFactory();
        AbstractPneuNeige pneuNeige = usinePneu.createPneuNeige();
        AbstractPneuPluie pneuPluie = usinePneu.createPneuPluie();

        System.out.println("--");

        usinePneu = new MichelinFactory();
        pneuNeige = usinePneu.createPneuNeige();
        pneuPluie = usinePneu.createPneuPluie();
    }
}
