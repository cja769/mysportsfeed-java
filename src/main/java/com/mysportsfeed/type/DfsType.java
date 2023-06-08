package com.mysportsfeed.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum DfsType {
    DRAFT_KINGS("draftkings"),
    FAN_DUEL("fanduel");

    @Getter
    private String friendlyName;

    DfsType(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}
