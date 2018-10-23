package com.dudanhua.firstdemo.service;

import com.dudanhua.firstdemo.Constants.Constant;
import com.dudanhua.firstdemo.exception.GirlException;
import com.dudanhua.firstdemo.mapper.Girl;
import com.dudanhua.firstdemo.repository.GirlRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRespository girlRespository;

    @Transactional
    public void insertTwo() {
        Girl girl = new Girl();
        girl.setCupSize("A");
        girl.setAge(18);
        girlRespository.save(girl);
        girl.setCupSize("B");
        girl.setAge(19);
        girlRespository.save(girl);

    }

    public void getAge(Integer id) throws GirlException {
//        Girl girl = girlRespository.findOne(id);
        Girl girl = new Girl();
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(Constant.PRIMARY_SCHOOL);
        } else if (age >= 10 && age < 16) {
            throw new GirlException(Constant.MIDDLE_SCHOOL);
        }
    }

}
