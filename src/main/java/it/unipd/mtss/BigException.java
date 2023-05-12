////////////////////////////////////////////////////////////////////
// MICHAEL FANTINATO 2043672
// DAVIDE BENEDETTI 2042339
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class BigException extends Exception {
    public BigException() {
        super("I numeri maggiori di 1000 non sono accettati");
    }
}
