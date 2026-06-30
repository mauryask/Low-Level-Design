package DesignPatterns.Structural.Adapter.RoundPeg;

public record RoundHole(double holeRadius) {
    public boolean fits(RoundPeg peg) {
        return holeRadius >= peg.getRadius();
    }
}