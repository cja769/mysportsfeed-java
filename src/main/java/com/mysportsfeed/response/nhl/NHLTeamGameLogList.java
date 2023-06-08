package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLTeamGameLog;
import lombok.Data;

import java.util.List;

@Data
public class NHLTeamGameLogList {

    private String lastUpdatedOn;

    private List<NHLTeamGameLog> gamelogs;
}
