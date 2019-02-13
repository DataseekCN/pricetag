package com.fourbears.mall.service.impl;

import com.fourbears.mall.mapper.OmsCompanyAddressMapper;
import com.fourbears.mall.model.OmsCompanyAddress;
import com.fourbears.mall.model.OmsCompanyAddressExample;
import com.fourbears.mall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by macro on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
