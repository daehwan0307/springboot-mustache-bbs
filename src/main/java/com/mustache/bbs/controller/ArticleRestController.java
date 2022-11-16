package com.mustache.bbs.controller;

import com.mustache.bbs.domain.dto.ArticleDto;
import com.mustache.bbs.domain.dto.HospitalResponse;
import com.mustache.bbs.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ArticleRestController {
    private final ArticleService articleService;

    public ArticleRestController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> get(@PathVariable Long id) { // ResponseEntity도 DTO타입
        ArticleDto articleDto = articleService.getArticle(id); // DTO
        return ResponseEntity.ok().body(articleDto); // Return은 DTO로
    }
}
