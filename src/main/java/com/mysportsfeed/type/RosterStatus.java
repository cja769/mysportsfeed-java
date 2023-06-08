package com.mysportsfeed.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum RosterStatus {
    ASSIGNED_TO_ROSTER("assigned-to-roster"),
    ASSIGNED_TO_INJURY_LIST("assigned-to-injury-list"),
    ASSIGNED_TO_MINORS("assigned-to-minors"),
    ASSIGNED_TO_OTHER("assigned-to-other"),
    UNDRAFTED("undrafted"),
    UFA("ufa");

    @Getter
    private String friendlyName;

    RosterStatus(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}
