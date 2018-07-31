package com.pyg.sellergoods.api.service;

import com.pyg.pojo.Address;

/**
 * @author lf
 * @Title: ITestService
 * @Description: TODO
 * @date 2018/7/31 11:11
 */
public interface ITestService {
     String say();

    Address findById(Long id);
}
