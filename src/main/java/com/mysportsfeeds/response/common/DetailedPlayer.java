package com.mysportsfeeds.response.common;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DetailedPlayer extends Player {

    private Team currentTeam;
    private String currentRosterStatus;
    private String currentInjury;
    private String height;
    private String weight;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    private Integer age;
    private String birthCity;
    private String birthCountry;
    private Boolean rookie;
    private String highSchool;
    private String college;
    private NHLPlayerHandednessList handedness;
    private String officialImageSrc;
    private List<SocialMedia> socialMediaAccounts;
    private NHLDraft draft;
    private NHLContractYear currentContractYear;

    @Data
    public static class NHLPlayerHandednessList {

        @JsonIgnore
        private List<NHLPLayerHandedness> handedness = new ArrayList<>();

        @JsonAnySetter
        public void setHandedness(String key, Object val) {
            handedness.add(new NHLPLayerHandedness(key, (String) val));
        }

        @Data
        @AllArgsConstructor
        public static class NHLPLayerHandedness {
            @JsonIgnore
            private String skill;
            @JsonIgnore
            private String handedness;
        }
    }

    @Data
    public static class NHLDraft {
        @JsonProperty("Year")
        private Integer year;
        private Team team;
        @JsonProperty("Round")
        private Integer round;
        @JsonProperty("RoundPick")
        private Integer roundPick;
        @JsonProperty("OverallPick")
        private Integer overallPick;
    }

    @Data
    public static class NHLContractYear {
        @JsonProperty("SeasonStartYear")
        private Integer seasonStartYear;
        @JsonProperty("BaseSalary")
        private Integer baseSalary;
        @JsonProperty("MinorsSalary")
        private Integer minorsSalary;
        @JsonProperty("SigningBonus")
        private Integer signingBonus;
        @JsonProperty("OtherBonuses")
        private Integer otherBonuses;
        @JsonProperty("CapHit")
        private Integer capHit;
        @JsonProperty("FullNoTradeClause")
        private Boolean fullNoTradeClause;
        @JsonProperty("ModifiedNoTradeClause")
        private Boolean modifiedNoTradeClause;
        @JsonProperty("NoMovementClause")
        private Boolean noMovementClause;
        private NHLContractYearContract overallContract;

        @Data
        public static class NHLContractYearContract {
            private Team signingTeam;
            @JsonProperty("SignedOn")
            @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
            private Date signedOn;
            @JsonProperty("TotalYears")
            private Integer totalYears;
            @JsonProperty("TotalSalary")
            private Integer totalSalary;
            @JsonProperty("TotalBonuses")
            private Integer totalBonuses;
            @JsonProperty("ExpiryStatus")
            private String expiryStatus;
            @JsonProperty("AnnualAverageSalary")
            private Integer annualAverageSalary;
        }
    }

}
