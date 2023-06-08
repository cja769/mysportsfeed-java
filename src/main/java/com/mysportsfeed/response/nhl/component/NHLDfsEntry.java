package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NHLDfsEntry {

    @JsonProperty("draftkings")
    private List<NHLDfsRow> draftKings;

    @JsonProperty("fanduel")
    private List<NHLDfsRow> fanDuel;
}
