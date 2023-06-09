package com.mysportsfeeds.param.nhl;

import com.mysportsfeeds.param.common.CommonSeasonParams;
import com.mysportsfeeds.type.RosterStatus;
import com.mysportsfeeds.type.SortType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class NHLActivePlayersParams extends CommonSeasonParams {
    private List<String> teams;
    private List<String> players;
    private List<String> positions;
    private List<String> countries;
    private List<RosterStatus> rosterStatuses;
    private Map<String, SortType> sortParams;
    private Integer offset;
    private Integer limit;

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
        addParameter("rosterstatus", sb, getRosterStatuses());
        addSortParameters("sort", sb, getSortParams());
        addParameter("offset", sb, getOffset());
        addParameter("limit", sb, getLimit());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
