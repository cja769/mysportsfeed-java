package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLTeamLineup {

    private NHLStarter expected;

    private NHLStarter actual;

    private String team;

}
