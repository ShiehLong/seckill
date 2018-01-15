package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author Xone
 * @Date 15:36 2018/1/4
 **/
@Component
public interface SeckillDao {
    /**
    * @Description:减库存
    * @param  seckillId
    * @param killTime
    **/
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
    * @Description:根据ID查询秒杀对象
    * @param seckillId
    **/
    Seckill queryById(long seckillId);

    /**
    * @Description:根据偏移量查询秒杀商品列表
    * @param offset
    * @param limit
    **/
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
