package SolidPrinciples.ISP.BadCode;

public class Tester implements Worker {
    @Override
    public void writeCode() {
        // DISP violation: tester can not write code
    }

    @Override
    public void testCode() {
       // Tester can only test code
    }

    @Override
    public void createArchitecture() {
        // ISP violation: teste can not architect the system
    }
}
