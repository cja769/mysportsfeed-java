package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.GameEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLSchedule {

    private String lastUpdatedOn;

    private List<GameEntry> gameentry;
}
