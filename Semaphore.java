public class Semaphore {
    private int value; 
    private int waiting; 

    public Semaphore(int v){
        value = v;
        waiting = 0; 
    }

    public synchronized void P(){ //lock
        if (value > 0){
            value --; 
        }
        else {
            waiting++;
        }
    }

    public synchronized void signal(){ //unlock
        if (waiting > 0){
            waiting--;
        }
        else {
            value++;
        }
    }
}
