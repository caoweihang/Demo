package test;

import com.baizhi.Application;
import com.baizhi.entity.Product;
import com.baizhi.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class test {

    @Autowired
    private ProductService productService;

    @Test
    public void test(){

        List<Product> all = productService.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
