package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLRosterPlayerEntry;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
public class NHLPlayerInjuriesResponse {

    @JsonProperty("playerinjuries")
    private NHLPlayerInjuries playerInjuries;

    @Data
    public static class NHLPlayerInjuries {
        private String lastUpdatedOn;
        @JsonProperty("playerentry")
        private List<NHLInjuredPlayerEntry> playerEntries;

        @EqualsAndHashCode(callSuper = true)
        @Data
        public static class NHLInjuredPlayerEntry extends NHLRosterPlayerEntry {
            private String injury;
        }

    }
}
