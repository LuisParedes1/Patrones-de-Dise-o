// Example from https://refactoring.guru/design-patterns/adapter/java/example#example-0

package org.example;

import org.example.RoundPeg;
import org.example.SquarePeg;

import static java.lang.Math.sqrt;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
