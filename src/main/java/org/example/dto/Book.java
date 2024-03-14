package org.example.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Valid

    private Long id;
    @NotNull(message = "ISBN is Required")
    @NotBlank(message = "ISBN is Required")
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;
}
