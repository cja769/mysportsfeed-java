package com.mysportsfeed.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum StatusType {
    UNPLAYED("unplayed"),
    IN_PROGRESS("in-progress"),
    POSTGAME_REVIEWING("postgame-reviewing"),
    FINAL("final");

    @Getter
    private String friendlyName;

    StatusType(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}
