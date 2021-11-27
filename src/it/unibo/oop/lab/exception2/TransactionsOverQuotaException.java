package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private final int maximumTrans;
    
    public TransactionsOverQuotaException(int maximumTrans) {
        super();
        this.maximumTrans = maximumTrans;
    }

    public String toString() {
        return "I have exceeded the max number of transitions which is "
                + this.maximumTrans;
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
