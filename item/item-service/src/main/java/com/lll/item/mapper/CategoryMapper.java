package com.lll.item.mapper;

import com.lll.item.pojo.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Repository
public interface CategoryMapper extends Mapper<Category> {

    @Select(" select * from tb_category where id in (select category_id from tb_category_brand where brand_id = #{bid})")
    List<Category> queryCategoryListByBid(Long bid);
}
