package exception;

public class NoMappingParamString extends Exception{
    public NoMappingParamString() {
    }

    public NoMappingParamString(String message) {
        super(message);
    }

    public NoMappingParamString(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMappingParamString(Throwable cause) {
        super(cause);
    }

    public NoMappingParamString(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
