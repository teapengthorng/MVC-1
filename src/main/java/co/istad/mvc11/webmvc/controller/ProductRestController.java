package co.istad.mvc11.webmvc.controller;

import co.istad.mvc11.webmvc.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
    // http://localhost:8080/jsonProduct
    @GetMapping("jsonProduct")
    ProductDto finProduct(){
        return  new ProductDto("P001", "IPhone 16 pro mex",24,390);
    }
}
