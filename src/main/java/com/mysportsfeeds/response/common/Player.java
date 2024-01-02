package com.mysportsfeeds.response.common;

import lombok.Data;

@Data
public class Player {

    private String id;
    private String lastName;
    private String firstName;
    private Integer jerseyNumber;
    private String primaryPosition;
    private String dfsSourceId;
}
