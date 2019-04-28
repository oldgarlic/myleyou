package com.lll.item.mapper;

import com.lll.item.pojo.Brand;
import com.lll.item.pojo.Category;
import com.lll.item.service.BrandService;
import com.lll.item.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandMapperTest {
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private BrandService brandService;
    @Autowired
    private CategoryService categoryService;

    @Test
    public void test(){
        List<Category> categories = categoryService.queryCategoryListByBid(1912l);
        for (Category category : categories) {
            System.out.println(category);
        }
    }
}