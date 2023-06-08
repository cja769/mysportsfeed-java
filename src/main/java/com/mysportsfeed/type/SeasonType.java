package com.mysportsfeed.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum SeasonType {
    PLAYOFF("playoff", true),
    REGULAR("regular", true),
    CURRENT("current", false),
    LATEST("latest", false),
    UPCOMING("upcoming", false);

    @Getter
    private String friendlyName;

    @Getter
    private boolean requiresYear;
    SeasonType(String friendlyName, boolean requiresYear) {
        this.friendlyName = friendlyName;
        this.requiresYear = requiresYear;
    }

    public String buildKey(Integer startYear, Integer endYear) {
        if (startYear != null && endYear != null) {
            return startYear + "-" + endYear + "-" + getFriendlyName();
        }
        if (startYear != null) {
            return startYear + "-" + getFriendlyName();
        }
        if (endYear != null) {
            return endYear + "-" + getFriendlyName();
        }
        return getFriendlyName();
    }
}
