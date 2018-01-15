package org.seckill.exception;

/**
 * @Description:
 * @Author Xone
 * @Date 15:44 2018/1/12
 **/
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
