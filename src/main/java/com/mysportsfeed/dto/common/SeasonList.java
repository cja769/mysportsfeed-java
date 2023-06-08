package com.mysportsfeed.dto.common;

import lombok.Data;

import java.util.List;

@Data
public class SeasonList {

    private String lastUpdatedOn;

    private List<Season> season;
}
