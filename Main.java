package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Point[] points = { new Point(-1, 1), new Point(-1, 0), new Point(-1, -1), new Point(0, -1)};


        double orientation;
        if (points[0].x == 0) {
            orientation = 135;
        } else {
            orientation = Math.atan(points[0].y / points[0].x) * (180 / Math.PI) + 135;
        }

        int i = 0;
        for (Point point : points) {
            orientation -= 45;
            double hypotenuse = Math.sqrt(point.x * point.x + point.y * point.y);
            point.x = (int) Math.round(Math.sin(orientation / 180 * Math.PI) * hypotenuse);
            point.y = (int) Math.round(Math.cos(orientation / 180 * Math.PI) * hypotenuse);
            System.out.println(point);
        }
    }
}
