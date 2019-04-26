package com.lll.item.mapper;

import com.lll.item.pojo.Brand;
import com.lll.item.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandMapperTest {
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private BrandService brandService;

    @Test
    public void test(){
        brandService.queryBrandByPageAndSort(0,10,"name",true,"黑马");
    }
}