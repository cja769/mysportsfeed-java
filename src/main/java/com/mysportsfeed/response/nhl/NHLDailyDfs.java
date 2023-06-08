package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLDfsEntry;
import com.mysportsfeed.response.nhl.component.NHLDfsRow;
import lombok.Data;

import java.util.List;

@Data
public class NHLDailyDfs {

    private String lastUpdatedOn;
    private List<NHLDfsEntry> dfsEntries;
    private List<NHLDfsRow> dfsRow;
}
