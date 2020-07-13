package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.entity.Result;
import com.itheima.exception.CheckItemDeleteFailException;
import com.itheima.pojo.CheckItem;

public interface CheckItemService {

    public void add(CheckItem checkItem);

    public PageResult pageQuery(QueryPageBean queryPageBean);

    public void delete(Integer id) throws CheckItemDeleteFailException;
}
