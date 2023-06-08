package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLStat {

    private String name;

    private String abbreviation;

    // TODO almost certain this is wrong
    private String value;

    private String category;
}
