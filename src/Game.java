import java.util.Timer;
import java.util.TimerTask;


public class Game {
    protected int cookieCounter;
    private int cookiesPerClicker;
    private int cookiesPerSecond;
    protected int upgrade1Cost;
    protected int upgrade2Cost;
    protected int upgrade3Cost;
    protected int upgrade4Cost;
    protected int upgrade5Cost;
    protected int upgrade6Cost;
    protected int upgrade7Cost;
    private int upgradeCount;


    public Game() {
        cookieCounter = 0;
        cookiesPerClicker = 1;
        cookiesPerSecond = 0;
        upgradeCount = 0;

        upgrade1Cost = 5;
        upgrade2Cost = 25;
        upgrade3Cost = 150;
        upgrade4Cost = 550;
        upgrade5Cost = 1500;
        upgrade6Cost = 20;
        upgrade7Cost = 300;


        Timer slowCooker = new Timer();
        TimerTask slow = new TimerTask() {
            @Override
            public void run() {
                cookieCounter+=cookiesPerSecond;

            }
        };
        slowCooker.schedule(slow, 0, 1000);


    }

    public void cookieClick() {
        cookieCounter+=cookiesPerClicker;
    }
    public void upgradeButton1() {
        if (cookieCounter >= upgrade1Cost) {
            cookiesPerClicker++;
            cookieCounter-=upgrade1Cost;
            upgradeCount++;
            upgrade1Cost += upgradeCount;
        }


    }


    public void upgradeButton2() {
        if (cookieCounter >= upgrade2Cost) {
            cookiesPerSecond++;
            cookieCounter -= upgrade2Cost;
            upgradeCount++;
            upgrade2Cost += upgradeCount;

        }

    }
    public void upgradeButton3() {
        if (cookieCounter >= upgrade3Cost) {
            cookiesPerSecond += 2;
            cookieCounter -= upgrade3Cost;
            upgradeCount++;
            upgrade3Cost += upgradeCount*2;
        }
    }
    public void upgradeButton4() {
        if (cookieCounter >= upgrade4Cost) {
            cookiesPerSecond += 8;
            cookieCounter -= upgrade4Cost;
            upgradeCount++;
            upgrade4Cost += upgradeCount * 8;
        }
    }
    public void upgradeButton5() {
        if (cookieCounter >= upgrade5Cost) {
            cookiesPerSecond += 15;
            cookieCounter -= upgrade5Cost;
            upgradeCount++;
            upgrade5Cost += upgradeCount * 15;
        }
    }
    public void upgradeButton6() {
        if (cookieCounter >= upgrade6Cost) {
            cookiesPerClicker += 3;
            cookieCounter -= upgrade6Cost;
            upgradeCount++;
            upgrade6Cost += upgradeCount * 3;
        }
    }
    public void upgradeButton7() {
        if (cookieCounter >= upgrade7Cost) {
            cookiesPerClicker += 5;
            cookieCounter -= upgrade7Cost;
            upgradeCount++;
            upgrade7Cost += upgradeCount * 5;
        }
    }



}
