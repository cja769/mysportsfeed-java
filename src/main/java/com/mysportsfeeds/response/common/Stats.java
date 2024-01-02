package com.mysportsfeeds.response.common;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Stats {
    @JsonIgnore
    private List<NHLStat> stats = new ArrayList<>();

    @JsonAnySetter
    public void setStats(String key, Object val) {
        setStats(key, val, "General");
    }

    private void setStats(String key, Object val, String category) {
        if (val instanceof Map) {
            ((Map<String, Object>) val).entrySet().forEach(entry -> setStats(entry.getKey(), entry.getValue(), key));
        } else {
            if (val instanceof Double) {
                stats.add(new NHLStat(key, (Double) val, category));
            } else {
                stats.add(new NHLStat(key, ((Integer) val).doubleValue(), category));
            }
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NHLStat {

        @JsonIgnore
        private String statName;
        @JsonIgnore
        private Double value;
        @JsonIgnore
        private String category;
    }
}
