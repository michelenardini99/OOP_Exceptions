package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private final double foundForMove;
    private final double actualFound;
    
    public NotEnoughFoundsException(double foundForMove, double actualFound) {
        super();
        this.foundForMove = foundForMove;
        this.actualFound = actualFound;
    }
    
    public String toString() {
        return "The found i want is " + this.foundForMove
            + " but it is not enaugh cause my found is " + this.actualFound;
    }

    /**
     * 
     * @return string representation of this exception
     */
    @Override
    public String getMessage() {
        return this.toString();
    }

}
