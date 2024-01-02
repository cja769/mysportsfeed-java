package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.common.References;
import com.mysportsfeeds.response.nhl.common.NHLSchedule;
import lombok.Data;

import java.util.List;

@Data
public class NHLDailyGameScheduleResponse {
    private String lastUpdatedOn;
    private List<NHLSchedule> games;
    private References references;
}
