package com.example.demo.exception;

import com.example.demo.util.messages.error.ErrorCodes;

/**
 * @author 
 * @since 
 */
public class CustomException1 extends BaseException {

    public CustomException1() {
        super(ErrorCodes.CUSTOM_EXCEPTION_1);
    }
}
