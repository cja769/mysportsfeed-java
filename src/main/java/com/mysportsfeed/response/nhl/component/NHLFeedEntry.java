package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NHLFeedEntry {

    // TODO don't know structure
    private Object feed;

    private String lastUpdatedOn;

    private List<String> forDate;

    private List<NHLForGame> forGame;
}
