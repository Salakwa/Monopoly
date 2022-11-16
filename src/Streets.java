import java.util.*;
import java.lang.*;

public class Streets extends Property {
    private String setColor;
    private int baseRent;
    private int rentWithOneHouse;
    private int rentWithTwoHouse;
    private int rentWithThreeHouse;
    private int rentWithFourHouse;
    private int rentWithHotel;
    private int numHouses;
    private boolean hotelOnProperty;
    private int buildingsCost;
    private int houseCost;
    private int hotelCost;

    public Streets(String propertyName, Player owner, int propertyCost, int mortageValue , int rent, String setColor,
                   int baseRent, int rentWithOneHouse, int rentWithTwoHouse , int rentWithThreeHouse , int rentWithFourHouse,
                   int rentWithHotel, int numHouses, boolean hotelOnProperty, int buildingsCost ) {
        super(propertyName, owner, propertyCost,mortageValue, rent, false);
        this.setColor = setColor;
        this.baseRent = baseRent;
        this.rentWithOneHouse = rentWithOneHouse;
        this.rentWithTwoHouse = rentWithTwoHouse;
        this.rentWithThreeHouse = rentWithThreeHouse;
        this.rentWithFourHouse = rentWithFourHouse;
        this.rentWithHotel = rentWithHotel;
        this.numHouses = numHouses;
        this.hotelOnProperty = hotelOnProperty;
        this.buildingsCost = buildingsCost;
    }

    public void setStreetsRent() {
        if (!hotelOnProperty) {
            switch (numHouses) {
                case 0:
                    super.rent = baseRent;
                case 1:
                    super.rent = rentWithOneHouse;
                case 2:
                    super.rent = rentWithTwoHouse;
                case 3:
                    super.rent = rentWithThreeHouse;
                case 4:
                    super.rent = rentWithFourHouse;
            }
        } else {
            super.rent = rentWithHotel;
        }
    }

    public void setNumHouses(int newNumHouses) {
        numHouses = newNumHouses;
    }

    public int getNumHouses() {
        return numHouses;
    }

    public void changeHotelStatus() {
        if (hotelOnProperty) {
            hotelOnProperty = false;
        } else if (!hotelOnProperty) {
            hotelOnProperty = true;
        }
    }

    public boolean getHotelStatus() {
        return hotelOnProperty;
    }

    public int getRentWithOneHouse(){
        return rentWithOneHouse;
    }

    public int getRentWithTwoHouse(){
        return rentWithOneHouse;
    }

    public int getRentWithThreeHouse(){
        return rentWithThreeHouse;
    }

    public int getRentWithFourHouse(){
        return rentWithFourHouse;
    }

    public int getBuildingsCost() {
        return buildingsCost;
    }

    public String getSetColor() {
        return setColor;
    }

    public String toString() {
        return "--------------------------\n"
                + "|" + String.format("%1$"+22+ "s", super.propertyName) + " |\n"
                + "+------------------------+\n"
                + "|" + String.format("%1$"+22+ "s", "Rent: " + super.rent) + " |\n";
    }

    /*
         + String.format( "%-24d%-24d%-24d\n", "|", super.propertyName,"|")+ "+----------------------+"
                + String.format( "%-24d%-24d%-24d\n", "|", super.rent,"|" );
     */
}
