package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class Faceoff {

    private Player awayPlayer;

    private Player homePlayer;

    private String wonBy;
}
