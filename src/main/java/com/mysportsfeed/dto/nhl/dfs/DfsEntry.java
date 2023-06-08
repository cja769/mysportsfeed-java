package com.mysportsfeed.dto.nhl.dfs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DfsEntry {

    @JsonProperty("draftkings")
    private List<DfsRow> draftKings;

    @JsonProperty("fanduel")
    private List<DfsRow> fanDuel;
}
