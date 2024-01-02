package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NHLLatestUpdatesResponse {
    private String lastUpdatedOn;
    private List<NHLFeedEntry> feedUpdates;

    @Data
    public static class NHLFeedEntry {

        private NHLFeed feed;
        private String lastUpdatedOn;
        private Object forDates; // This can be a list or single object. Too complicated to deal with so just leaving it ambiguous
        private Object forGames; // This can be a list or single object. Too complicated to deal with so just leaving it ambiguous

        @Data
        public static class NHLFeed {
            private String name;
            private String abbreviation;
            private String description;
            private String version;
        }
    }
}
