package com.mysportsfeed.dto.common;

import com.mysportsfeed.dto.nhl.common.Stat;
import lombok.Data;

import java.util.List;

@Data
public class Season {

    private Detail details;

    private List<Stat> supportedPlayerStats;

    private List<Stat> supportedTeamStats;
}
