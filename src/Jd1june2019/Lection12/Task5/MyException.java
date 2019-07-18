package Jd1june2019.Lection12.Task5;

public class MyException extends Exception {
    private Exception myException;

    public MyException(String error, Exception e) {
        super(error);
        myException = e;
    }

    public MyException(String error) {
        super(error);
    }

    public Exception getHiddenException() {
        return myException;
    }

}