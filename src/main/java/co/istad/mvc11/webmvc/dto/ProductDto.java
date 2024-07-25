package co.istad.mvc11.webmvc.dto;

public record ProductDto(
        String code,
        String name,
        Integer qty,
        Integer price
) {

}

