package com.techplus.service;

import com.techplus.model.Datum;
import com.techplus.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class newsService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${news.api.api-key}")
    private String newsApiKey;

    @Value("${news.api.base-url:https://api.newsmesh.co/v1/trending}")
    private String baseUrl;

    @Value("${news.api.limit:2}")
    private int limit;

    public List<Datum> getNews() {
        String url = String.format("%s?apiKey=%s&limit=%d", baseUrl, newsApiKey, limit);

        Root root = restTemplate.exchange(url, HttpMethod.GET, null, Root.class).getBody();

        if (root == null || root.getData() == null) {
            return List.of();
        }

        return root.getData();
    }
}

