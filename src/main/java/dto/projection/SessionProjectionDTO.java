package dto.projection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.SessionStatus;
import model.SessionType;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SessionProjectionDTO {
    private UUID id;
    private OffsetDateTime startTime;
    private OffsetDateTime endTime;
    private String status;
    private SessionType sessionType;
    private VenueDetailsInfo venueDetails;
    private SessionStatus sessionStatus;
    private SeatingMapProjectionDTO layoutData;


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VenueDetailsInfo {
        private String name;
        private String address;
        private String onlineLink;
        private GeoJsonPoint location;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GeoJsonPoint {
        private final String type = "Point";
        private double[] coordinates; // [longitude, latitude]
    }
}
