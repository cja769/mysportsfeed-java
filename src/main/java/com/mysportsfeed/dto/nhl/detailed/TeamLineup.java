package com.mysportsfeed.dto.nhl.detailed;

import lombok.Data;

@Data
public class TeamLineup {

    private Starter expected;

    private Starter actual;

    private String team;

}
