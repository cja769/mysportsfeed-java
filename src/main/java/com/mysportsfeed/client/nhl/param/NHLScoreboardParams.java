package com.mysportsfeed.client.nhl.param;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class NHLScoreboardParams extends NHLDailyGameScheduleParams {
}
