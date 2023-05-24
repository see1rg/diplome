package ru.skypro.homework.dto;

import lombok.Data;


@Data

public class CommentDto {

    private Integer id;
    private String createdAt;
    private String text;
    private String ads;
    private Integer authorId;
}