package com.lll.item.web;

import com.lll.common.utils.PageResult;
import com.lll.item.mapper.BrandMapper;
import com.lll.item.pojo.Brand;
import com.lll.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /**
     * 分页查询品牌
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param key
     * @return
     */
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key){
        PageResult<Brand> result = brandService.queryBrandByPageAndSort(page, rows, sortBy, desc, key);
        if (result == null || result.getItems().size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 根据bid进行品牌的删除
     * @param id
     */
    @DeleteMapping("bid/{id}")
    public void deleteBrandByBid(@PathVariable("id") Long id){
            brandService.deleteBrandByBid(id);
    }

    /**
     * 新增用户
     * @param brand
     * @param cids
     */
    @PostMapping
    public void saveBrand(Brand brand,@RequestParam("cids") Long cids){
        brandService.saveBrand(brand);
    }
}
