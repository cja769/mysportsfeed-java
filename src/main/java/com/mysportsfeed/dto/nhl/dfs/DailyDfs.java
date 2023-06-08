package com.mysportsfeed.dto.nhl.dfs;

import lombok.Data;

import java.util.List;

@Data
public class DailyDfs {

    private String lastUpdatedOn;
    private List<DfsEntry> dfsEntries;
    private List<DfsRow> dfsRow;
}
