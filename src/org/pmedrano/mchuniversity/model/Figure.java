package org.pmedrano.mchuniversity.model;

/*
* Use the keyword: permits to indicate the list of subclasses allowed.
* There are three types of classes that can extend a sealed class: final, non-sealed, and sealed.
* When a derived class is declared as non-sealed,
* it can be further extended by any other class (similar as declaring a class as final)
* Can be used with Pattern Matching and Switch Expression
* */

public sealed interface Figure permits Circle, Square, Triangle, Fractal {

    double surface();

}
