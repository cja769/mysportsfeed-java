package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NHLLatestUpdatesResponse {
    @JsonProperty("latestupdates")
    private NHLLatestUpdates latestUpdates;

    @Data
    public static class NHLLatestUpdates {

        private String lastUpdatedOn;
        @JsonProperty("feedentry")
        private List<NHLFeedEntry> feedEntries;

        @Data
        public static class NHLFeedEntry {

            private NHLFeed feed;
            private String lastUpdatedOn;
            private Object forDate; // This can be a list or single object. Too complicated to deal with so just leaving it ambiguous
            private Object forGame; // This can be a list or single object. Too complicated to deal with so just leaving it ambiguous

            @Data
            public static class NHLFeed {
                @JsonProperty("Name")
                private String name;
                @JsonProperty("Abbreviation")
                private String abbreviation;
                @JsonProperty("Description")
                private String description;
            }
        }
    }
}
