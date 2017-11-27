import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class userTimer{
    public static int msPassed;
    public static int timeTaken;

    Timer myTimer = new Timer();
    TimerTask task = new TimerTask(){
        @Override
        public void run() {
            msPassed++;
        }
    };

    public void start(){
        msPassed = 0;
        myTimer.scheduleAtFixedRate(task, 1, 1);
    }

    public int cancel(){
        myTimer.cancel();
        myTimer.purge();
        timeTaken = msPassed;
        myTimer = new Timer();
        task = new TimerTask(){
            @Override
            public void run() {
                msPassed++;
            }
        };
        return timeTaken;
    }

    /*
     * EXAMPLE
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        userTimer time = new userTimer();
        System.out.println("ENTER SOMETHING");
        time.start();

        String input = reader.nextLine();
        int passed = time.cancel();
        System.out.println("It took you " + passed + " milliseconds");

        System.out.println("something else");
        time.start();

        input = reader.nextLine();
        passed = time.cancel();
        System.out.println("It took you " + passed + " milliseconds");
        reader.close();
        System.exit(0);
    }*/

}
