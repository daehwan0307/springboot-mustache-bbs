package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleAddRequest {
    private String title;
    private String content;

    public Article toEntity(){
        Article article = Article.builder()
                .title(this.title)
                .content(this.title)
                .build();
        return article;
    }
}
