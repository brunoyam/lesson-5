package com.brunoyam.figures;

public class Square extends Rectangle {   // квадрат = прямоугольник, в прицнипе

    public Square(Point x, Point y) {
        super(x, y);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();  // super - вызов метода родителя - мы просто переадресуем все действия нашему предку - прямоугольнику
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }
}
