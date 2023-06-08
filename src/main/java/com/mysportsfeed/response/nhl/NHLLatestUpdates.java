package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLFeedEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLLatestUpdates {

    private String lastUpdatedOn;

    private List<NHLFeedEntry> feedentry;
}
