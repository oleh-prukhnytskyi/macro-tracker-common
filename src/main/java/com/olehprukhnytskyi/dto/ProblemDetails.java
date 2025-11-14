package com.olehprukhnytskyi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@Schema(description = "API problem details")
public class ProblemDetails {
    @Schema(description = "Short human-readable error summary",
            example = "User not found")
    private String title;

    @Schema(description = "HTTP status code",
            example = "404")
    private int status;

    @Schema(description = "Detailed human-readable explanation",
            example = "User with id=123 does not exist")
    private String detail;

    @Schema(description = "A unique trace identifier for debugging",
            example = "d7f3aa01b52e4c99")
    private String traceId;

    @Schema(description = "Application-specific error code",
            example = "USER_NOT_FOUND")
    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "Invalid input parameters (for validation errors)")
    private List<InvalidParam> invalidParams;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class InvalidParam {
        @Schema(description = "Parameter name", example = "email")
        private String name;

        @Schema(description = "Description of why it's invalid",
                example = "Email format is invalid")
        private String reason;
    }
}
