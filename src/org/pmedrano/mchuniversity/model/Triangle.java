package org.pmedrano.mchuniversity.model;

public record Triangle(double base, double height) implements Figure {


    @Override
    public double surface() {
        return (base * height) / 2;
    }
}
