package com.mysportsfeed.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum GameStatus {
    UNPLAYED("unplayed"),
    IN_PROGRESS("in-progress"),
    POSTGAME_REVIEWING("postgame-reviewing"),
    FINAL("final");

    @Getter
    private String friendlyName;

    GameStatus(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}
