package com.mysportsfeed.client.nhl.param;

import com.mysportsfeed.client.common.param.CommonSeasonParams;
import com.mysportsfeed.type.SortType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class NHLCumulativePlayerStatsParams extends CommonSeasonParams {
    private List<String> teams;
    private List<String> players;
    private List<String> positions;
    private List<String> countries;
    private List<String> playerStats;
    private Integer offset;
    private Integer limit;
    private Map<String, SortType> sortParams;

    public String buildUrlString(String baseUrl, String apiSlug) {
        StringBuilder sb = new StringBuilder(super.buildUrlString(baseUrl, apiSlug));
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        addParameter("team", sb, getTeams());
        addParameter("player", sb, getPlayers());
        addParameter("position", sb, getPositions());
        addParameter("country", sb, getCountries());
        addParameter("playerstats", sb, getPlayerStats());
        addSortParameters("sort", sb, getSortParams());
        addParameter("offset", sb, getOffset());
        addParameter("limit", sb, getLimit());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
