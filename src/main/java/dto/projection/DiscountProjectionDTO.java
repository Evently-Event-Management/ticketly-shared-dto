package dto.projection;

import dto.projection.discount.DiscountParametersDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscountProjectionDTO {
    private UUID id;
    private String code;
    private DiscountParametersDTO parameters;
    private Integer maxUsage;
    private Integer currentUsage;
    private boolean isActive;
    private boolean isPublic;
    private OffsetDateTime activeFrom;
    private OffsetDateTime expiresAt;
    private List<UUID> applicableTierIds;
    private List<UUID> applicableSessionIds;
}
