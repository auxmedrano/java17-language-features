package org.pmedrano.mchuniversity;

import org.pmedrano.mchuniversity.model.Circle;
import org.pmedrano.mchuniversity.model.Figure;
import org.pmedrano.mchuniversity.model.Fractal;
import org.pmedrano.mchuniversity.model.Square;
import org.pmedrano.mchuniversity.model.Triangle;

public class I_PlayWithSealedType {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        Triangle triangle = new Triangle(5, 16); //using record
        Square square = new Square();
        square.setEdge(6);

        System.out.println("using pattern variable");
        System.out.println("Surface of Circle: " + patternVarSurface(circle));
        System.out.println("Surface of Triangle: " + patternVarSurface(triangle));
        System.out.println("Surface of Square: " + patternVarSurface(square));
        System.out.println("--------------------------------------------------");

        System.out.println("using SwitchExpressions");
        System.out.println("Surface of Circle: " + calculateSurface(circle));
        System.out.println("Surface of Triangle: " + calculateSurface(triangle));
        System.out.println("Surface of Square: " + calculateSurface(square));

    }


    public static double patternVarSurface(Figure figure) {
        double surface = 0;
        if (figure instanceof Circle circle) {
            return circle.surface();
        } else if (figure instanceof Triangle triangle) {
            return triangle.surface();
        } else if (figure instanceof Square square) {
            return square.surface();
        } //we forgot Fractal type
        return surface;
    }

    public static double calculateSurface(Figure figure) {
        return switch (figure) {
            case Circle circle -> circle.surface();
            case Triangle triangle -> triangle.surface();
            case Square square -> square.surface();
            case Fractal fractal -> fractal.surface();// if one subclass it's omitted  it will not compile
//            case null  -> -1;
        };
    }

}
