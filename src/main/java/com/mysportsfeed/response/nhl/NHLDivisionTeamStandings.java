package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLDivision;
import lombok.Data;

import java.util.List;

@Data
public class NHLDivisionTeamStandings {

    private String lastUpdatedOn;

    private List<NHLDivision> division;
}
