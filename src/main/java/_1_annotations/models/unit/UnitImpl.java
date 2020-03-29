package _1_annotations.models.unit;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class UnitImpl implements Unit {
    private int x;
    private int y;
    private int acceleration;

    @Override
    public Point move(int wx, int wy) {
        x += wx * acceleration;
        y += wy * acceleration;
        return new Point(x, y);
    }

    @Override
    public void speak() {
        System.out.println("unit speaks ");
    }
}
