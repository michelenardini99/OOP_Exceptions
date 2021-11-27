package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private final int realId;
    private final int wrongId;
    public WrongAccountHolderException(int realId, int wrongId) {
        super();
        this.realId = realId;
        this.wrongId = wrongId;
    }
    
    /**
     * 
     * @return string representation of this exception
     */
    @Override
    public String toString() {
        return "The userId should be " + this.realId
            + " but it is is " + this.wrongId;
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
