package com.mysportsfeeds.response.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class References {

    private List<TeamReference> teamReferences;
    private List<VenueReference> venueReferences;
    private List<DetailedPlayer> playerReferences;
    private List<StatReference> playerStatReferences;
    private List<StatReference> teamStatReferences;
    private List<GameReference> gameReferences;

    @Data
    public static class TeamReference {
        private Integer id;
        private String city;
        private String name;
        private String abbreviation;
        private Venue homeVenue;
        private List<String> teamColoursHex;
        private List<SocialMedia> socialMediaAccounts;
        private String officialLogoImageSrc;

    }

    @Data
    public static class VenueReference {
        private Integer id;
        private String name;
        private String city;
        private String country;
        private VenueReferenceGeoCoordinates geoCoordinates;
        private List<VenueReferenceCapacity> capacitiesByEventType;
        private String playingSurface;
        private List<VenueReferenceBaseballDimensions> baseballDimensions;
        private Boolean hasRoof;
        private Boolean hasRetractableRoof;

        @Data
        public static class VenueReferenceGeoCoordinates {
            private Double latitude;
            private Double longitude;
        }

        @Data
        public static class VenueReferenceCapacity {
            private String eventType;
            private Integer capacity;
        }

        @Data
        public static class VenueReferenceBaseballDimensions {
            private String dimensionType;
            private Integer distanceFeet;
        }
    }

    @Data
    public static class StatReference {
        private String category;
        private String fullName;
        private String description;
        private String abbreviation;
        private String type;
    }

    @Data
    public static class GameReference {
        private String id;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        private Timestamp startTime;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        private Timestamp endedTime;
        private Team awayTeam;
        private Team homeTeam;
        private Venue venue;
        private String venueAllegiance;
        private String scheduleStatus;
        private String delayedOrPostponedReason;
        private String playedStatus;
        private Integer attendance;
        private List<GameReferenceOfficial> officials;
        private List<String> broadcasters;
        private GameReferenceWeather weather;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        private Timestamp originalStartTime;

        @Data
        public static class GameReferenceOfficial {
            private String id;
            private String title;
            private String firstName;
            private String lastName;
        }

        @Data
        public static class GameReferenceWeather {
            private String type;
            private String description;
            private GameReferenceWeatherWind wind;
            private GameReferenceWeatherTemp temperature;
            private GameReferenceWeatherPrecipitation precipitation;
            private Integer humidityPercent;

            @Data
            public static class GameReferenceWeatherWind {
                private GameReferenceWeatherWindSpeed speed;
                private GameReferenceWindDirection direction;
                @Data
                public static class GameReferenceWeatherWindSpeed {
                    private Integer milesPerHour;
                    private Integer kilometersPerHour;
                }

                @Data
                public static class GameReferenceWindDirection {
                    private Integer degrees;
                    private String label;
                }
            }

            @Data
            public static class GameReferenceWeatherTemp {
                private Double fahrenheit;
                private Double celsius;
            }

            @Data
            public static class GameReferenceWeatherPrecipitation {
                private String type;
                private Integer percent;
                private GameReferenceWeatherPrecipitationAmount amount;

                @Data
                public static class GameReferenceWeatherPrecipitationAmount {
                    private Double millimeters;
                    private Double centimeters;
                    private Double inches;
                    private Double feet;
                }
            }
        }
    }
}
