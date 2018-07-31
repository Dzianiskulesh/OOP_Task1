package com.epam.task01;
// Проектные файлы (.idea) и папку с output (target) обычно не кладут под систему контроля версий.
public class Circle extends Figure {
    private int radius;

    public Circle(int r) {
        radius = r;
    }

    public double findSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

