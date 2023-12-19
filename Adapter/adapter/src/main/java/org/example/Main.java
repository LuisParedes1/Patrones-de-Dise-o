package org.example;

import org.example.shapes.RoundHole;
import org.example.shapes.RoundPeg;
import org.example.shapes.SquarePeg;
import org.example.shapes.SquarePegAdapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)){
            System.out.println(String.format("Round peg radius 5 fits round hole radius 5: %b", hole.fits(rpeg)));
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        // The method expects RoundPeg, not SquarePeg: hole.fits(RoundPeg peg)
        //hole.fits(smallSqPeg);

        System.out.println("\nWe try to fit a squarePeg inside a roundHole\n");

        // Adapter solves the problem. Because SquarePegAdapter extends RoundPeg, it works as a RoundPeg
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)){
            System.out.println(String.format("Square peg width 2 fits round hole radius 5: %b", hole.fits(smallSqPegAdapter)));
        }
        if (!hole.fits(largeSqPegAdapter)){
            System.out.println(String.format("Square peg width 20 does not fit into round hole radius 5: %b", !hole.fits(largeSqPegAdapter)));
        }
    }
}