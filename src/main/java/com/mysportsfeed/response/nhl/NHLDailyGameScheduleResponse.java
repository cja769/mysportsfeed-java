package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLSchedule;
import lombok.Data;

@Data
public class NHLDailyGameScheduleResponse {

    @JsonProperty("dailygameschedule")
    private NHLSchedule dailyGameSchedule;
}
