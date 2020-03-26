package com.starry.gmall.pms;

import com.starry.mall.pms.entity.Brand;
import com.starry.mall.pms.entity.Product;
import com.starry.mall.pms.service.BrandService;
import com.starry.mall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        Product product = productService.getById(1);
        System.out.println(product.getProductCategoryName());

//        Brand object = new Brand();
//        object.setName("hahhaha");
//        brandService.save(object);
//        System.out.println("主库插入成功");

        Brand brand = brandService.getById(53);
        System.out.println(brand.getName());
        System.out.println("从库查询成功");
    }

}
