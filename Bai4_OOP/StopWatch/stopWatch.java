public class stopWatch {
    private final long startTime;
    private long stopTime;

    public long getStartTime() {
        return startTime;
    }
    public long getStopTime() {
        return stopTime;
    }

    public stopWatch() {
       this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.stopTime = System.currentTimeMillis();
    }
    public void stop(){
        this.stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.stopTime - this.startTime;
    }
}


