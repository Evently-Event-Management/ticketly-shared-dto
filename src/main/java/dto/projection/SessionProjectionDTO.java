package dto.projection;

import lombok.Builder;
import lombok.Data;
import model.SessionType;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
public class SessionProjectionDTO {
    private UUID id;
    private OffsetDateTime startTime;
    private OffsetDateTime endTime;
    private String status;
    private SessionType sessionType;
    private VenueDetailsInfo venueDetails;
    // ✅ Updated to use the new, fully denormalized seating map structure
    private SeatingMapProjectionDTO layoutData;


    @Data
    @Builder
    public static class VenueDetailsInfo {
        private String name;
        private String address;
        private String onlineLink;
        private GeoJsonPoint location;
    }

    @Data
    @Builder
    public static class GeoJsonPoint {
        private final String type = "Point";
        private double[] coordinates; // [longitude, latitude]
    }
}
