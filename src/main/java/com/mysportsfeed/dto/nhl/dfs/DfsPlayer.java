package com.mysportsfeed.dto.nhl.dfs;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DfsPlayer extends Player {

    private String dfsSourceId;
}
