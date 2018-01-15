package org.seckill.exception;

/**
 * @Description:
 * @Author Xone
 * @Date 15:46 2018/1/12
 **/
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
