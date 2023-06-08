package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLGameScore;
import lombok.Data;

@Data
public class NHLScoreboard {

    private String lastUpdatedOn;

    private NHLGameScore gameScore;
}
