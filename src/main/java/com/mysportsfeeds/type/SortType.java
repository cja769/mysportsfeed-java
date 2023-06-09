package com.mysportsfeeds.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum SortType {

    ASCENDING("A"), DESCENDING("D");

    @Getter
    private String friendlyName;

    SortType(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}
