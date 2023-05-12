////////////////////////////////////////////////////////////////////
// MICHAEL FANTINATO 2043672
// DAVIDE BENEDETTI 2042339
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NegativeException extends Exception {
    public NegativeException() {
        super("I numeri negativi non sono accettati");
    }
}