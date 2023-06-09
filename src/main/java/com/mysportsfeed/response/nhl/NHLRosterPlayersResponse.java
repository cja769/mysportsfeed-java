package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLRosterPlayerEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLRosterPlayersResponse {

    @JsonProperty("rosterplayers")
    private NHLRosterPlayers rosterPlayers;

    @Data
    public static class NHLRosterPlayers {
        private String lastUpdatedOn;
        @JsonProperty("playerentry")
        private List<NHLRosterPlayerEntry> playerEntries;

    }
}
