package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLConference {

    private List<NHLStanding> teamentry;
}
