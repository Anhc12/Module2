package bai_tap;

public class Circle {

        private double radius =1.0;
        private String color = "red";

// constructor khong tham so
        public Circle(){

        }
        //contructor co tham so
        public Circle(double radius){
            this.radius= radius;
        }
        private double getRadius(){
            return radius;
        }
        private double getArea(){
            return Math.PI* radius;
        }
    }


