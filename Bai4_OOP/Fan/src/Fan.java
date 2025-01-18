public class Fan {
    public final int SLOW =1;
    public final int MEDIUM =2;
    public final int FAST =3;

    private int speed =SLOW;
    private Boolean on = false;
    private double radius =5;
    private String color ="blue";

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public Boolean getOn(){
        return on;
    }
    public void setOn(Boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Fan(){
    }
    @Override
    public String toString(){
        if (on) {
            return "Fan [radius=" + radius + ", color=" + color + ", speed=" + speed  + "]";
        }else {
            return "Fan [radius=" + radius + ", color=" + color + " fan is off ]";
        }
    }
}
