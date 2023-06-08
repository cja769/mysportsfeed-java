package com.mysportsfeed.param.nhl;

import com.mysportsfeed.param.common.CommonSeasonParams;
import com.mysportsfeed.type.StatusType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class NHLDailyGameScheduleParams extends CommonSeasonParams {
    private String date;
    private List<String> teams;
    private StatusType status;

    public String buildUrlString(String baseUrl, String apiSlug) {
        StringBuilder sb = new StringBuilder(super.buildUrlString(baseUrl, apiSlug));
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        addParameter("fordate", sb, getDate());
        addParameter("team", sb, getTeams());
        addParameter("status", sb, getStatus());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
