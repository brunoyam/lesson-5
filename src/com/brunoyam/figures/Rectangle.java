package com.brunoyam.figures;

public class Rectangle extends Figure {

    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public double getPerimeter() {
        Point topRight = new Point(this.bottomRight.getX(), this.topLeft.getY());
        Point bottomLeft = new Point(topLeft.getX(), bottomRight.getY()); // т.к. в рамках метода getPerimeter() нет локальной переменной bottomRight и topLeft, this. можно опустить

        return topLeft.dist(topRight) + topRight.dist(bottomRight) + bottomRight.dist(bottomLeft) + bottomLeft.dist(topLeft);
    }

    @Override
    public double getSquare() {
        Point topRight = new Point(this.bottomRight.getX(), this.topLeft.getY());

        // return topLeft.dist(topRight) * topLeft.dist(bottomLeft);
        return topLeft.dist(topRight) * topRight.dist(bottomRight);
    }
}
