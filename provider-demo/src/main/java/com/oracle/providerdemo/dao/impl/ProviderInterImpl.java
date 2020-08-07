package com.oracle.providerdemo.dao.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oracle.providerdemo.dao.ProviderInterface;
@Service
public class ProviderInterImpl implements ProviderInterface {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
