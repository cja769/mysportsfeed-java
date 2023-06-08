package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLDivision {

    private List<NHLStanding> teamentry;
}
