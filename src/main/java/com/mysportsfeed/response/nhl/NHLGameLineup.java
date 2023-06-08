package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLGame;
import com.mysportsfeed.response.nhl.component.NHLTeamLineup;
import lombok.Data;

import java.util.List;

@Data
public class NHLGameLineup {

    private String lastUpdatedOn;

    private NHLGame game;

    private List<NHLTeamLineup> teamLineup;
}
