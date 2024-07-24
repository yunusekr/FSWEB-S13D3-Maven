package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight (){
        return height;
    }

    public double setWidth(double width){
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
        return  this.width;
    }

    public double setHeight (double height){
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
        return this.height;
    }

    public double getArea(){
        return this.width * this.height;
    }


}
