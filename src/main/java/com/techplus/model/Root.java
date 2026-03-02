package com.techplus.model;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Root {
    @JsonProperty("data")
    private ArrayList<Datum> data;

    @JsonProperty("next_cursor")
    private Object nextCursor;
}

