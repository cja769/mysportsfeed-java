package com.mysportsfeed.dto.nhl.detailed;

import lombok.Data;

import java.util.List;

@Data
public class PlayerInjuries {

    private String lastUpdatedOn;

    private List<InjuredPlayerEntry> playerentry;
}
