package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLConference;
import lombok.Data;

@Data
public class NHLConferenceTeamStandings {

    private String lastUpdatedOn;

    private NHLConference conference;
}
