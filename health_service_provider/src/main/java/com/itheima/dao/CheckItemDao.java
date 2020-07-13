package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface CheckItemDao {

    public void add(CheckItem checkItem);

    // 分页助手必须返回 Page
    Page<CheckItem> selectByCondition(String queryString);

    long findCountByCheckItemId(@Param("id") Integer id);

    void deleteById( @Param("id") Integer id);
}
