package SolidPrinciples.ISP.BadCode;

public class Architect implements Worker {
    @Override
    public void writeCode() {
        // ISP violation: architect can not write code
    }

    @Override
    public void testCode() {
        // ISP violation: architect ca
    }

    @Override
    public void createArchitecture() {
        // Architect can only architect the system
    }
}
