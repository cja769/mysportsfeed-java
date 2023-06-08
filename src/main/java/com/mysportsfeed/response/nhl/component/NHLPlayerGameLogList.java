package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerGameLogList {

    private String lastUpdatedOn;

    private List<NHLPlayerGameLog> gamelogs;
}
