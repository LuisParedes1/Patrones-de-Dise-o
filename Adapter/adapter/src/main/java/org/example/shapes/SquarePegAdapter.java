package org.example.shapes;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    /**
     * A SquarePeg does not have a radius.
     *
     * This is the adapter method that makes the SquarePeg and RoundPeg understand each other.
     *
     * SquarePegAdapter overrides this RoundPeg method and to the outside world it acts as a RoundPeg
     * but behind the scenes it translates it to the SquarePeg interface
     */
    @Override
    public double getRadius() {
        return (Math.sqrt(peg.getSquare() * 2));
    }
}
