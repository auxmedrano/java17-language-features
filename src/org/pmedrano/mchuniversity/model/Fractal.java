package org.pmedrano.mchuniversity.model;

public sealed class Fractal implements Figure permits RandomFractal {


    @Override
    public double surface() {
        return 0;
    }
}
