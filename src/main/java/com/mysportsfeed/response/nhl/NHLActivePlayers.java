package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLPlayerEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLActivePlayers {

    private String lastUpdatedOn;

    private List<NHLPlayerEntry> playerentry;
}
