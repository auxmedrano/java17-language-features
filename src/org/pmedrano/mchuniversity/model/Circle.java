package org.pmedrano.mchuniversity.model;

public final class Circle implements Figure {

    private double radius;

    @Override
    public double surface() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
