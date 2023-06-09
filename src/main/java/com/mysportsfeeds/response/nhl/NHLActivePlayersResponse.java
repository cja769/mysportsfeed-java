package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLRosterPlayerEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLActivePlayersResponse {

    @Data
    public static class NHLActivePlayers {
        private String lastUpdatedOn;
        @JsonProperty("playerentry")
        private List<NHLRosterPlayerEntry> playerEntries;

    }
}
