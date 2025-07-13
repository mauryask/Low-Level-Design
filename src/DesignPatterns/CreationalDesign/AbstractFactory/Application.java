package DesignPatterns.CreationalDesign.AbstractFactory;

public class Application {
    private final Button button;
    private final Scrollbar scrollbar;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.scrollbar = uiFactory.createScrollBar();
    }

    void renderUI() {
        button.render();
        scrollbar.scroll();
    }

    public static void main(String[] args) {
        UIFactory windowsUiFactory = new MacOSFactory();
        Application application = new Application(windowsUiFactory);
        application.renderUI();
    }
}
