package co.istad.mvc11.webmvc.controller;
import co.istad.mvc11.webmvc.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
 /*   @GetMapping("/product-list")
    String productList(Model model){
        //need model or not?
        ProductDto productDto = new ProductDto(
                "P001",
                "iphone 15 Max",
                1

        );
        model.addAttribute("product", productDto);
                return "product-list";
    }
}*/

    //for List
    @GetMapping("/product-list")
    List<ProductDto> productDtoList(Model model) {
//        http://localhost:8080/product-list
        List<ProductDto> productDtoList = new ArrayList<>();
        //need model or not?
        ProductDto productDto1 = new ProductDto("P001", "iphone 15 Max", 100,732);
        productDtoList.add(productDto1);

        ProductDto productDto2 = new ProductDto("P002", "Samsung Galaxy S22", 20,356);
        productDtoList.add(productDto2);

        ProductDto productDto3 = new ProductDto("P003", "iPhone 13", 50,346);
        productDtoList.add(productDto3);

        ProductDto productDto4 = new ProductDto("P004", "MacBook Air", 99,632);
        productDtoList.add(productDto4);

        ProductDto productDto5 = new ProductDto("P005", "iPad Mini", 77,86);
        productDtoList.add(productDto5);

        ProductDto productDto6 = new ProductDto("P006", "AirPods Pro", 34,53);
        productDtoList.add(productDto6);

        ProductDto productDto7 = new ProductDto("P007", "Surface Go", 86,754);
        productDtoList.add(productDto7);

        ProductDto productDto8 = new ProductDto("P008", "HP Spectre", 109, 35);
        productDtoList.add(productDto8);

        ProductDto productDto9 = new ProductDto("P009", "Dell XPS", 584, 533);
        productDtoList.add(productDto9);

        ProductDto productDto10 = new ProductDto("P010", "Xiaomi Mi", 23, 123);
        productDtoList.add(productDto10);

        return productDtoList;
    }
}


