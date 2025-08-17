package dto.projection;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CategoryProjectionDTO {
    private UUID id;
    private String name;
    private UUID parentId;
    private String parentName;
}

