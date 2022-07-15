package org.pmedrano.mchuniversity.model;

public non-sealed class Square implements Figure {
    private double edge;

    @Override
    public double surface() {
        return edge * edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
}
