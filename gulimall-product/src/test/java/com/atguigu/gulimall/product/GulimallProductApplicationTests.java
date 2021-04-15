package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        //BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setBrandId(1l);
        //brandEntity.setDescript("小米");
        //brandEntity.setName("小米");
        //  brandEntity.setName("华为");
        //brandService.updateById(brandEntity);

        // brandEntity.setBrandId(1L);
        // brandEntity.setDescript("华为");
        // brandService.save(brandEntity);
        //   System.out.println("保存成功");
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (BrandEntity entity : brand_id) {
            System.out.println(entity);
        }
        brand_id.forEach((item) -> {
            System.out.println(item);
        });

    }

}
