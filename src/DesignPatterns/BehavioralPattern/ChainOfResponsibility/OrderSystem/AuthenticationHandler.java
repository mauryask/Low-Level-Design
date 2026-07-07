package DesignPatterns.BehavioralPattern.ChainOfResponsibility.OrderSystem;
/**
 * Note: The private members of the base class are not accessible inside the child class
 * But they are inherited (always present) inside the child class
 * The next object which is private to base class won't be accessible in AuthenticationHandler class
 * but available into it
 * */

public class AuthenticationHandler extends Handler {
    @Override
    void handle(Request request) {
        if (!request.isAuthenticated()) {
            System.out.println("401 Unauthorized: User is not logged in");
            return;
        }
        System.out.println("User is logged in");
        checkNext(request);
    }
}


/*
    public Handler setNext(Handler next){
        this.next = next;
        return next;
    }

    protected void checkNext(Request request){
        if(next != null)
            next.handle(request);
    }
**/

