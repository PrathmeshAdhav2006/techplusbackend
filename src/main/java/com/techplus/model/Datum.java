package com.techplus.model;

import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Datum {
    @JsonProperty("article_id")
    private String articleId;

    @JsonProperty("author")
    private ArrayList<String> author;

    @JsonProperty("category")
    private String category;

    @JsonProperty("description")
    private String description;

    @JsonProperty("link")
    private String link;

    @JsonProperty("media_url")
    private String mediaUrl;

    @JsonProperty("people")
    private ArrayList<String> people;

    @JsonProperty("published_date")
    private Date publishedDate;

    @JsonProperty("source")
    private String source;

    @JsonProperty("title")
    private String title;

    @JsonProperty("topics")
    private ArrayList<String> topics;
}

