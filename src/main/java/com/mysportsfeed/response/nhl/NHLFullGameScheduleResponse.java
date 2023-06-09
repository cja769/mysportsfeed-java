package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLSchedule;
import lombok.Data;

@Data
public class NHLFullGameScheduleResponse {

    @JsonProperty("fullgameschedule")
    private NHLSchedule fullGameSchedule;
}
