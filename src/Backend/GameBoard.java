package Backend;

public class GameBoard {

    public GameBoard() {
        //Brown Sets
        Streets mediterranian = new Streets("Mediterranian Avenue", 1, null, 60,"Brown", 2,10, 30, 90, 160, 250, 0, false, 50);
        Streets baltic = new Streets("Baltic Avenue", 3, null, 60,"Brown", 4, 20, 60, 180, 320, 450, 0, false, 50);

        //Light Blue Sets
        Streets oriental = new Streets("Oreintal Avenue", 6, null, 100, "Light Blue", 6, 30, 90, 270, 400, 550, 0, false, 50);
        Streets vermont = new Streets( "Vermont Avenue", 8, null, 100, "Light Blue", 6, 30, 90, 270, 400, 550, 0, false, 50);
        Streets connecticut = new Streets( "Connecticut Avenue", 9, null, 100,"Light Blue", 6, 30, 90, 270, 400, 550, 0, false, 50);

        //Purple Sets
        Streets stCharles = new Streets("St.Charles Place", 11, null, 140,"Purple", 10, 60, 150, 450, 625, 750, 0, false, 100);
        Streets states = new Streets("States Avenue", 13, null, 140,"Purple", 10, 60, 150, 450, 625, 750, 0, false, 100);
        Streets virginia = new Streets("Virginia Avenue", 14, null, 160,"Purple", 12, 60, 180, 500,700, 900, 0, false, 100);

        //Orange Sets
        Streets stJames = new Streets("St.James Place", 16, null, 180,"Orange", 14, 60, 250, 550, 750, 950, 0, false, 100);
        Streets tennesee = new Streets("St.Charles Place", 18, null, 180,"Orange", 14, 60, 250, 550, 750, 950, 0, false, 100);
        Streets newYork = new Streets("New York Avenue", 19, null, 200,"Orange", 16, 80, 220, 600, 800, 1000, 0, false, 100);

        //Red Sets
        Streets kentucky = new Streets("Kentucky Avenue", 21, null, 220,"Red", 18, 90, 250, 700, 875, 1050, 0, false, 150);
        Streets indiana = new Streets("Indiana Avenue", 23,null, 220,"Red", 18, 90, 250, 700, 875, 1050, 0, false, 150);
        Streets illinois = new Streets("Illinois Avenue", 24, null, 240,"Red", 20, 100, 300, 725, 925, 1100, 0, false, 150);

        //Yellow Sets
        Streets atlantic = new Streets("Atlantic Avenue", 26, null, 260,"Yellow", 22, 110, 330, 800, 975, 1150, 0, false, 150);
        Streets ventnor  = new Streets("Ventnor Avenue", 28, null, 260,"Yellow", 22, 110, 330, 800, 975, 1150, 0, false, 150);
        Streets marvins = new Streets("Marvin's Garden", 29, null, 280,"Yellow", 24, 120, 360, 850, 1025, 1200, 0, false, 150);

        //Green Sets
        Streets pacific = new Streets("Pacific Avenue", 31, null, 300,"Green", 26, 130, 390, 900, 1100, 1275, 0, false, 200);
        Streets northCarolina = new Streets("North Carolina Avenue", 33, null, 300,"Green", 26, 130, 390, 900, 1100, 1275, 0, false, 200);
        Streets pennsylvania = new Streets("Pennsylvania Avenue", 34, null, 320,"Green", 28, 150, 450, 1000, 1200, 1400, 0, false, 200);

        //Dark Blue Sets
        Streets park = new Streets("Park Place", 37, null, 350,"Dark Blue", 35, 175, 500, 1100, 1300, 1500, 0, false, 200);
        Streets boardwalk = new Streets("Boardwalk", 39, null, 400,"Dark Blue", 50, 200, 600, 1400, 1700, 2000, 0, false, 200);

        // All Chances
        Chance chanceOne = new Chance(7);
        Chance chanceTwo = new Chance(22);
        Chance chanceThree = new Chance(36);

        //Community Chest
        CommunityChest ccOne = new CommunityChest(2);
        CommunityChest ccTwo = new CommunityChest(17);
        CommunityChest ccThree = new CommunityChest(33);
    }

}
