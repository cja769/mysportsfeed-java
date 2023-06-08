package com.mysportsfeed.dto.nhl.stats;

import com.mysportsfeed.dto.nhl.common.Stat;
import lombok.Data;

import java.util.List;

@Data
public class Standing {

    private String team;

    private Integer rank;

    private List<Stat> stats;
}
