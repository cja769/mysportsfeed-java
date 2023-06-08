package com.mysportsfeed.client.nhl.param;

import com.mysportsfeed.client.common.param.CommonSeasonParams;
import com.mysportsfeed.type.RosterStatus;
import com.mysportsfeed.type.SortType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class NHLRosterPlayersParams extends CommonSeasonParams {
    private String date;
    private List<String> teams;
    private List<String> players;
    private List<String> positions;
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
        addParameter("fordate", sb, getDate());
        addParameter("team", sb, getTeams());
        addParameter("player", sb, getPlayers());
        addParameter("position", sb, getPositions());
        addParameter("rosterstatus", sb, getRosterStatuses());
        addSortParameters("sort", sb, getSortParams());
        addParameter("offset", sb, getOffset());
        addParameter("limit", sb, getLimit());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
