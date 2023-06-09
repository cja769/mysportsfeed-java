package com.mysportsfeeds.param.common;

import com.mysportsfeeds.type.FormatType;
import com.mysportsfeeds.type.SortType;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@SuperBuilder
public class CommonParams {
    private Boolean force;

    public String buildUrlString(String baseUrl, String apiSlug) {
        StringBuilder sb = new StringBuilder(baseUrl);
        sb.append(apiSlug);
        sb.append(".").append(FormatType.JSON.getFriendlyName()).append("?");
        addParameter("force", sb, getForce());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    protected void addParameter(String key, StringBuilder sb, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String value = String.join(",", list);
            sb.append(key).append("=").append(value).append("&");
        }
    }

    protected void addParameter(String key, StringBuilder sb, Object value) {
        if (value != null) {
            sb.append(key).append("=").append(value).append("&");
        }
    }

    protected void addSortParameters(String key, StringBuilder sb, Map<String, SortType> sortParams) {
        if (sortParams != null) {
            String sortParamsString = sortParams.entrySet().stream()
                .map(entry -> entry.getKey() + "." + entry.getValue().getFriendlyName())
                .collect(Collectors.joining(","));
            if (!sortParamsString.isBlank()) {
                sb.append(key).append("=").append(sortParams).append("&");
            }
        }
    }

}
