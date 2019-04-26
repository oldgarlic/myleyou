package com.lll.item.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lll.common.utils.PageResult;
import com.lll.item.mapper.BrandMapper;
import com.lll.item.pojo.Brand;
import com.netflix.discovery.converters.Auto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy,
                                                     Boolean desc, String key){
        PageHelper.startPage(page,rows);
        Example example = new Example(Brand.class);
        //根据sortBy进行排序
        if(StringUtils.isNotBlank(sortBy)){
            String orderByClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        //根据key进行模糊查询
        if (StringUtils.isNotBlank(key)) {
            example.createCriteria().andLike("name", "%" + key + "%");
        }
        //查询
        Page<Brand> pageInfo = (Page<Brand>)brandMapper.selectByExample(example);

        return new PageResult<>(pageInfo.getTotal(), pageInfo);
    }

    public void deleteBrandByBid(Long id){
        brandMapper.deleteByPrimaryKey(id);
    }

    public void saveBrand(Brand brand){
        int insert = brandMapper.insert(brand);
    }
}
