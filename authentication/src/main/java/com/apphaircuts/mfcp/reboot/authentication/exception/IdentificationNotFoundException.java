package com.apphaircuts.mfcp.reboot.authentication.exception;

import java.text.MessageFormat;

public class IdentificationNotFoundException extends RuntimeException {

    protected String code;
    private Object[] args;


    public IdentificationNotFoundException(String message) {
        super(message);
    }

    public String getCode() {
        return this.code;
    }

    public Object[] getArgs() {
        return args;
    }

    public String getMessage() {
        if (args != null) {
            return MessageFormat.format(super.getMessage(), args);
        }
        return super.getMessage();
    }
}
