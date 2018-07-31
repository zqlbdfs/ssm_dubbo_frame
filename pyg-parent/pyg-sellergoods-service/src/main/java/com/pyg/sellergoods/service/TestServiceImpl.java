package com.pyg.sellergoods.service;

import com.pyg.mapper.AddressMapper;
import com.pyg.pojo.Address;
import com.pyg.sellergoods.api.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lf
 * @Title: TestServiceImpl
 * @Description: TODO
 * @date 2018/7/31 11:13
 */
public class TestServiceImpl implements ITestService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public String say() {
        return "this is service";
    }

    @Override
    public Address findById(Long id) {
        return addressMapper.selectByPrimaryKey(id);
    }
}
