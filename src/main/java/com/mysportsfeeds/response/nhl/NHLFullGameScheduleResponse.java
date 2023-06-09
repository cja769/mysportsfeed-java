package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLSchedule;
import lombok.Data;

@Data
public class NHLFullGameScheduleResponse {

    @JsonProperty("fullgameschedule")
    private NHLSchedule fullGameSchedule;
}
