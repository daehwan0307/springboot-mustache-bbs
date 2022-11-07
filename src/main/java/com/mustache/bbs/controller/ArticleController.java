package com.mustache.bbs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j // 로깅을 위한 어노테이션 log를 사용할 수있다.
public class ArticleController {
    @GetMapping(value = "/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

}

