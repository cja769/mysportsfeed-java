package com.mysportsfeed.dto.common;

import lombok.Data;

import java.util.List;

@Data
public class Schedule {

    private String lastUpdatedOn;

    private List<GameEntry> gameentry;
}
