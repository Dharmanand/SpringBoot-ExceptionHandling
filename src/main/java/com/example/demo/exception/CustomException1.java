package com.example.demo.exception;

import com.example.demo.util.messages.error.ErrorCodes;

/**
 * @author ekansh
 * @since 19/2/16
 */
public class CustomException1 extends BaseException {

    public CustomException1() {
        super(ErrorCodes.CUSTOM_EXCEPTION_1);
    }
}
