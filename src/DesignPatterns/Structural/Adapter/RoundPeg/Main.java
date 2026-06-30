package DesignPatterns.Structural.Adapter.RoundPeg;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(8);

        System.out.println(roundHole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(7);
        SquarePeg largeSquarePeg = new SquarePeg(32);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println(roundHole.fits(smallSquarePegAdapter));
        System.out.println(roundHole.fits(largeSquarePegAdapter));
    }
}
