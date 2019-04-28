package com.lll.item.service;

import com.lll.item.mapper.CategoryMapper;
import com.lll.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByBid(Long bid) {
        return categoryMapper.queryCategoryListByBid(bid);
    }

    public List<Category> queryCategoryListByParentId(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        return categoryMapper.select(category);
    }
}
