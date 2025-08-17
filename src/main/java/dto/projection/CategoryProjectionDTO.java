package dto.projection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor      // ✅ ADDED: Jackson needs this to create the object
@AllArgsConstructor
public class CategoryProjectionDTO {
    private UUID id;
    private String name;
    private UUID parentId;
    private String parentName;
}

