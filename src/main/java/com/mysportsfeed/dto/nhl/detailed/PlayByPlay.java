package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Game;
import lombok.Data;

import java.util.List;

@Data
public class PlayByPlay {

    private String lastUpdatedOn;

    private Game game;

    private List<Play> play;
}
