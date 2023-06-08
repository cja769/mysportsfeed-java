package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLPlayerStatEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerStats {

    private String lastUpdatedOn;
    private List<NHLPlayerStatEntry> playerstatsentry;
}
