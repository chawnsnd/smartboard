package com.anyang.study.board.interfaces.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardDto {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String modifiedAt;
    private String createdAt;
}
