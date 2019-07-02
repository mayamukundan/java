package basics.exceptionhandling.ude;

/**
 * Created by jrout on 7/1/19.
 */
public class WrongValueEnteredException extends Exception {

    private String message;
    public WrongValueEnteredException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
