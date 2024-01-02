package com.mysportsfeeds.param.nhl;

import com.mysportsfeeds.param.common.CommonSeasonParams;
import com.mysportsfeeds.type.SortType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class NHLTeamGameLogsParams extends CommonSeasonParams {

    private List<String> teams;
    private String date;
    private List<String> games;
    private List<String> teamStats;
    private Map<String, SortType> sortParams;
    private Integer offset;
    private Integer limit;

    public String buildUrlString(String baseUrl, String apiSlug) {
        if (date == null || date.isBlank()) {
            throw new IllegalArgumentException("Date is required");
        }
        StringBuilder sb = new StringBuilder(super.buildUrlString(baseUrl, "/date/" + date + apiSlug));
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        addParameter("team", sb, getTeams());
        addParameter("game", sb, getGames());
        addParameter("stats", sb, getTeamStats());
        addSortParameters("sort", sb, getSortParams());
        addParameter("offset", sb, getOffset());
        addParameter("limit", sb, getLimit());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
