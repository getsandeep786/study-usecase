package org.example;

public class CustomException extends Exception {

    private static final long serialVersionUID = -2428547000355464394L;

    public CustomException(Throwable throwable) {
        super(throwable);
    }

    public CustomException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public CustomException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.statusCode = code;
        this.statusText = message;
    }

    private String statusCode;
    private String statusText;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}

