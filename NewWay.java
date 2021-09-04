package com.company;

import java.awt.*;

public class NewWay {
    public static void main(String[] args) {
        Point[] points = { new Point(-1, -1), new Point(0, -1), new Point(1, -1), new Point(1, 0)};

        for (Point point : points) {
            int x = point.x, y = point.y;
            if (keyEvent.upArrow) {  // TODO Key Event (To go clock wise)
                point.y = -x;
                point.x = y;
            } else if (keyEvent.downArrow) { // TODO Key Event (To go counter clock wise)
                point.y = x;
                point.x = -y;
            }
        }
    }
}
