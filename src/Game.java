import java.util.Timer;
import java.util.TimerTask;


public class Game {
    int cookieCounter;
    int cookiesPerClicker;
    int cookiesPerSecond;
    int upgrade1Cost;
    int upgrade2Cost;
    int upgradeCount;


    public Game() {
        cookieCounter = 0;
        cookiesPerClicker = 1;
        cookiesPerSecond = 0;
        upgrade1Cost = 5;
        upgrade2Cost = 25;
        upgradeCount = 0;


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


}
