import java.util.*;
import java.lang.*;

public class Railroad extends Property {

    public Railroad(String propertyName,Player owner, int propertyCost, int rent ) {
        super(propertyName, owner, propertyCost, 100, rent, false);
    }

    public void setRailroadRent(int numRailroads) {
        super.rent = (int)(25 * Math.pow(2, numRailroads - 1));
    }

}
