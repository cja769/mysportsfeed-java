package com.mysportsfeed.dto.nhl.common;

import lombok.Data;

@Data
public class Stat {

    private String name;

    private String abbreviation;

    // TODO almost certain this is wrong
    private String value;

    private String category;
}
