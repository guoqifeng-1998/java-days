package com.qfguo.study.day19.test;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String ISBN;
    private String bookName;
    private Integer price;

}
