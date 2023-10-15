package bestbuy;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class TestingOnRegularBasis {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long delay = 86400000; 

        // Schedule the task to run daily at the specified time
        timer.scheduleAtFixedRate(new TestTask(), new Date(), delay);
    }
}

class TestTask extends TimerTask {
    public void run() {
      
    	
    }
}

