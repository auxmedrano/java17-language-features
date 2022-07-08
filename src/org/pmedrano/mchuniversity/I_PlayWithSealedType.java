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
        Triangle triangle = new Triangle(5, 16);
        Square square = new Square();
        square.setEdge(6);

        System.out.println("Old way");
        System.out.println("Surface of Circle: " + oldCalculateSurface(circle));
        System.out.println("Surface of Triangle: " + oldCalculateSurface(triangle));
        System.out.println("Surface of Square: " + oldCalculateSurface(square));
        System.out.println();

        System.out.println("using pattern variable");
        System.out.println("Surface of Circle: " + patternVarSurface(circle));
        System.out.println("Surface of Triangle: " + patternVarSurface(triangle));
        System.out.println("Surface of Square: " + patternVarSurface(square));
        System.out.println();

        System.out.println("using SwitchExpressions");
        System.out.println("Surface of Circle: " + calculateSurface(circle));
        System.out.println("Surface of Triangle: " + calculateSurface(triangle));
        System.out.println("Surface of Square: " + calculateSurface(square));

    }

    public static double oldCalculateSurface(Figure figure) {
        double surface = 0;
        if (figure instanceof Circle) {
             return Math.PI * Math.pow(((Circle) figure).getRadius(), 2);
            //return figure.surface();
        } else if (figure instanceof Triangle) {
            return ((Triangle) figure).base() * ((Triangle) figure).height() / 2;
            //return figure.surface();
        }
        return surface;
    }

    public static double patternVarSurface(Figure figure) {
        double surface = 0;
        if (figure instanceof Circle circle) {
            return Math.PI * Math.pow(circle.getRadius(), 2);
//            return circle.surface();
        } else if (figure instanceof Triangle triangle) {
            return (triangle.base() * triangle.height()) / 2;
//            return triangle.surface();
        } else if (figure instanceof Square square) {
            return square.getEdge() * square.getEdge();
          //  square.setEdge(8);
            //return square.surface();
        }
        return surface;
    }

    public static double calculateSurface(Figure figure) {
        double surface;
        surface = switch (figure) {
//            case null  -> -1;
            case Circle circle -> circle.surface();
            case Triangle triangle -> triangle.surface();
            case Square square -> square.surface();
            case Fractal fractal -> fractal.surface();// if one subclass it's omitted  it will not compile
        };

        return surface;
    }

}
