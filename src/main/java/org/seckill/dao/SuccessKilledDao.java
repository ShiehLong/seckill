package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author Xone
 * @Date 16:10 2018/1/4
 **/
@Component
public interface SuccessKilledDao {
    /**
    * @Description:插入购买明细，可过滤重复
    * @param seckillId
    * @param userPhone
    **/
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
    * @Description:根据ID查询SuccessKilled并携带秒杀产品对象实体
    * @param seckillId
    **/
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
