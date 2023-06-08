package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLSeason;
import lombok.Data;

import java.util.List;

@Data
public class NHLSeasonList {

    private String lastUpdatedOn;

    private List<NHLSeason> season;
}
