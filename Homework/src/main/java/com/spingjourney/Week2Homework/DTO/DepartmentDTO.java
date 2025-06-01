package com.spingjourney.Week2Homework.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private int deptId;

    @NotBlank(message = "Title cannot be blank")
    @Size(min = 3, max = 50, message = "Title must be between 3 and 50 characters")
    private String title;

    @NotNull(message = "Status must be provided")
    @JsonProperty("isActive")
    private Boolean isActive;

    @PastOrPresent(message = "Creation date must be in the past or present")
    private Date createdAt;

}
