package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLInjuredPlayerEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerInjuries {

    private String lastUpdatedOn;

    private List<NHLInjuredPlayerEntry> playerentry;
}
