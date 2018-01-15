package org.seckill.exception;

/**
 * @Description:
 * @Author Xone
 * @Date 15:43 2018/1/12
 **/
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
