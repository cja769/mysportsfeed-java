package com.mysportsfeed.dto.common;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class FeedEntry {

    //TODO Need to figure out the actual structure
    private Map<String, Object> feed;

    private String lastUpdatedOn;

    private List<String> forDate;

    private List<ForGame> forGame;
}
