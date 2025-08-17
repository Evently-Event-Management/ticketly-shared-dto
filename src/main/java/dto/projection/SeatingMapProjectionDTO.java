package dto.projection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.SeatStatus;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatingMapProjectionDTO {
    private String name;
    private LayoutInfo layout;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LayoutInfo {
        private List<BlockInfo> blocks;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BlockInfo {
        private String id;
        private String name;
        private String type;
        private PositionInfo position;
        private List<RowInfo> rows;
        private List<SeatInfo> seats; // For standing capacity blocks
        private Integer capacity;
        private Integer width;
        private Integer height;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RowInfo {
        private String id;
        private String label;
        private List<SeatInfo> seats;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SeatInfo {
        private String id;
        private String label;
        private SeatStatus status;
        private TierInfo tier;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PositionInfo {
        private Double x;
        private Double y;
    }
}
