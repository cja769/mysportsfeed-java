package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLFaceoff {

    private NHLPlayer awayPlayer;

    private NHLPlayer homePlayer;

    private String wonBy;
}
