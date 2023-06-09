package com.mysportsfeeds.param.nhl;

import com.mysportsfeeds.param.common.CommonSeasonParams;
import com.mysportsfeeds.type.LineupType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class NHLGameStartingLineupParams extends CommonSeasonParams {
    private String gameId;
    private List<String> positions;
    private List<LineupType> lineupTypes;

    public String buildUrlString(String baseUrl, String apiSlug) {
        StringBuilder sb = new StringBuilder(super.buildUrlString(baseUrl, apiSlug));
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        addParameter("gameid", sb, getGameId());
        addParameter("position", sb, getPositions());
        addParameter("lineuptype", sb, getLineupTypes());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
