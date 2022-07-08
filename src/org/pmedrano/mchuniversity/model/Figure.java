package org.pmedrano.mchuniversity.model;

public sealed interface Figure permits Circle, Square, Triangle, Fractal {

    double surface();

}
