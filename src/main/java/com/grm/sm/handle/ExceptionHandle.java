package com.grm.sm.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 自定义异常处理,对异常进行简单的几种处理
 *
 * @author grm
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public String handle(Exception e) {
        return "myerror";
    }
}
