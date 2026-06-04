package DesignPatterns.BehavioralPattern.ChainOfResponsibility.GoodExample;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next){
        this.next = next;
        return next;
    }

    protected void checkNext(Request request){
        if(next != null)
            next.handle(request);
    }

    abstract void handle(Request request);
}
