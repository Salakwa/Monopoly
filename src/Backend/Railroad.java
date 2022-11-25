package Backend;

import java.lang.*;

public class Railroad extends Property {

    public Railroad(String propertyName, int propertyLocation, Player owner, int propertyCost, int rent ) {
        super(propertyName,propertyLocation,owner, propertyCost, 100, rent, false);
    }

    public void setRailroadRent(int numRailroads) {
        super.rent = (int)(25 * Math.pow(2, numRailroads - 1));
    }

}
