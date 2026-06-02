package SolidPrinciples.ISP.GoodCode;

public class Developer implements Codable, Testable {
    @Override
    public void writeCode() {
        // Developer can write code
    }

    @Override
    public void testCode() {
      // Developer can text code
    }
}
