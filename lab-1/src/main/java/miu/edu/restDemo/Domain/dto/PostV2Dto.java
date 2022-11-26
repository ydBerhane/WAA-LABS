package miu.edu.restDemo.Domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostV2Dto {
    String title;
    String content;
    String author;
}
