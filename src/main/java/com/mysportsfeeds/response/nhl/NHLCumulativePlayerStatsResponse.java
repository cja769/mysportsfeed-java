package com.mysportsfeeds.response.nhl;

import com.mysportsfeeds.response.common.DetailedPlayer;
import com.mysportsfeeds.response.common.Stats;
import com.mysportsfeeds.response.common.References;
import com.mysportsfeeds.response.common.Team;
import lombok.Data;

import java.util.List;

@Data
public class NHLCumulativePlayerStatsResponse {
    private String lastUpdatedOn;
    private List<NHLCumulativePlayerStatEntry> playerStatsTotals;
    private References references;

    @Data
    public static class NHLCumulativePlayerStatEntry {

        private DetailedPlayer player;
        private Team team;
        private Stats stats;

    }
}
