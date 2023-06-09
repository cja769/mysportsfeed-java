package com.mysportsfeeds.param.nhl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class NHLScoreboardParams extends NHLDailyGameScheduleParams {
}
