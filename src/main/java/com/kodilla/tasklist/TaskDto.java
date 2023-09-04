package com.kodilla.tasklist;

import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Value
public class TaskDto {

    @NotNull
    @DateMin("2021-01-01")
    LocalDate when;

    @NotNull
    String title;

    @Min(1)
    @Max(5)
    int priority;
}
