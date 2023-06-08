package com.mysportsfeed.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum LineupType {
    EXPECTED("expected"),
    ACTUAL("actual");

    @Getter
    private String friendlyName;

    LineupType(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}
