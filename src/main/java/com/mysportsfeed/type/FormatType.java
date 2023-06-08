package com.mysportsfeed.type;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum FormatType {
    CSV("csv"), XML("xml"), JSON("json");

    @Getter
    private String friendlyName;

    FormatType(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}
