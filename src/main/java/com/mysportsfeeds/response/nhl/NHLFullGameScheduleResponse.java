package com.mysportsfeeds.response.nhl;

import com.mysportsfeeds.response.common.References;
import com.mysportsfeeds.response.nhl.common.NHLSchedule;
import lombok.Data;

import java.util.List;

@Data
public class NHLFullGameScheduleResponse {
    private String lastUpdatedOn;
    private List<NHLSchedule> games;
    private References references;
}
