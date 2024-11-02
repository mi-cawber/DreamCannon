//this class will hold methods that give life to my game

public class Animation {

    //"clears" console for fresh screen
    public void consoleClear() {
        for (int i = 0; i < 50; i++) {
            System.out.println(" ");
        }
    }

    //prints out dots after delay 
    public void dotSuspense() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(". ");

                //pauses thread
                Thread.sleep(750);
            }
        
        } catch (InterruptedException e) {
            //reports details of bug
            e.printStackTrace();
        }
    }

    public void lineUp(int num) {
        try {
            for (int i = 0; i < num; i++) {
                System.out.println("");

                //pauses thread
                Thread.sleep(750);
            }

        } catch (InterruptedException e) {
            //reports details of bug
            e.printStackTrace();
        }
    }

    //for pauses at console
    public void pause(int milliseconds) {
        try {
            // Pause execution for the specified amount of time
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
                // Handle any interruption during the pause
                e.printStackTrace();
        }
            
    }
}
