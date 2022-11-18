package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.Article;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
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
