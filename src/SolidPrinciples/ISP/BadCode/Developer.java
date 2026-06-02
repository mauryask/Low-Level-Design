package SolidPrinciples.ISP.BadCode;

public class Developer implements Worker{
    @Override
    public void writeCode() {
        // Developer can write code
    }

    @Override
    public void testCode() {
      // Developer can text code
    }

    @Override
    public void createArchitecture() {
           // ISP violation: as developer can not architect the system
    }
}
