package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKill() {
        long id=1000;
        long phone=18621799709l;
        int insertCount = successKilledDao.insertSuccessKill(id, phone);
        System.out.println("insertCount:"+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() {
        long seckilId = 1000;
        long userPhone = 18621799709l;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckilId,userPhone);
        System.out.println(successKilled.toString());
        System.out.println(successKilled.getSeckill().toString());
    }
}