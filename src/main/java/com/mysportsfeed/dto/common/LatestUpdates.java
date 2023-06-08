package com.mysportsfeed.dto.common;

import lombok.Data;

import java.util.List;

@Data
public class LatestUpdates {

    private String lastUpdatedOn;

    private List<FeedEntry> feedentry;
}
