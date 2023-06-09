package com.mysportsfeeds.param.nhl;

import com.mysportsfeeds.param.common.CommonSeasonParams;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class NHLPlayByPlayParams extends CommonSeasonParams {
    private String gameId;
    private String period;
    private List<String> playTypes;

    public String buildUrlString(String baseUrl, String apiSlug) {
        StringBuilder sb = new StringBuilder(super.buildUrlString(baseUrl, apiSlug));
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        addParameter("gameid", sb, getGameId());
        addParameter("period", sb, getPeriod());
        addParameter("playtype", sb, getPlayTypes());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
