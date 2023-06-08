package com.mysportsfeed.dto.nhl.stats;

import lombok.Data;

import java.util.List;

@Data
public class Conference {

    private List<Standing> teamentry;
}
