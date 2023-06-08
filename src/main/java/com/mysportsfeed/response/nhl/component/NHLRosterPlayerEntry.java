package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLRosterPlayerEntry {

    private NHLPlayer player;

    private String team;
}
