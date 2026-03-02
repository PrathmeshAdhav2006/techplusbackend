package com.techplus.controller;

import com.techplus.model.Datum;
import com.techplus.service.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class newsController {

    @Autowired
    private newsService newsService;

    @GetMapping
    public ResponseEntity<List<Datum>> getNews() {
        List<Datum> newsList = newsService.getNews();
        return ResponseEntity.ok(newsList);
    }
}
