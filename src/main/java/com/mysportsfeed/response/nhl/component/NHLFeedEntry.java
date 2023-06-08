package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NHLFeedEntry {

    //TODO Need to figure out the actual structure
    private Map<String, Object> feed;

    private String lastUpdatedOn;

    private List<String> forDate;

    private List<NHLForGame> forGame;
}
