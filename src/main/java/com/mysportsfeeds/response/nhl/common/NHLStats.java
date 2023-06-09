package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class NHLStats {
    @JsonIgnore
    private List<NHLStat> stats = new ArrayList<>();

    @JsonAnySetter
    public void setStats(String key, Object val) {
        Map<String, Object> values = (Map<String, Object>) val;
        if (values.values().stream().anyMatch(v -> v instanceof Map)) {
            Map<String, Map<String, String>> actualValues = (Map<String, Map<String, String>>) val;
            actualValues.entrySet().forEach(entry -> {
                String abbreviation = entry.getValue().get("@abbreviation");
                String value = entry.getValue().get("#text");
                stats.add(new NHLStat(entry.getKey(), abbreviation, Double.parseDouble(value)));
            });
        } else {
            String abbreviation = (String) values.get("@abbreviation");
            String value = (String) values.get("#text");
            stats.add(new NHLStat(key, abbreviation, Double.parseDouble(value)));
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NHLStat {

        @JsonIgnore
        private String statName;
        @JsonProperty("@abbreviation")
        private String abbreviation;
        @JsonProperty("#text")
        private Double value;
    }
}
