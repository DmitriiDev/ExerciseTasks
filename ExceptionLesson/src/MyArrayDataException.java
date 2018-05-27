import com.oracle.tools.packager.Log;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(String message, int lineCell, int rowCell ){
        super(message  +"[" + lineCell + "]" + "[" + rowCell+"]");

    }
}
