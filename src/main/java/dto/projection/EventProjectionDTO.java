package dto.projection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.EventStatus;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventProjectionDTO {
    private UUID id;
    private String title;
    private String description;
    private String overview;
    private EventStatus status;
    private List<String> coverPhotos;
    private OrganizationInfo organization;
    private CategoryInfo category;
    private List<TierInfo> tiers; // Keep this for a summary view of all available tiers
    private List<SessionProjectionDTO> sessions;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class OrganizationInfo {
        private UUID id;
        private String name;
        private String logoUrl;
        private String userId;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CategoryInfo {
        private UUID id;
        private String name;
        private String parentName;
    }
}
