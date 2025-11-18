package com.olehprukhnytskyi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Paginated response wrapper")
public class PagedResponse<T> {
    @Schema(
            description = "List of items for the current page",
            example = "[\n  {\n    \"id\": 1,\n    \"foodName\":"
                    + " \"Chicken Breast\",\n    \"amount\": 200\n  }\n]"
    )
    private List<T> data;

    @Schema(description = "Pagination metadata")
    private Pagination pagination;
}
