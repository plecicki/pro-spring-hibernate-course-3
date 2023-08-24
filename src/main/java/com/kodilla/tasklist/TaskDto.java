package com.kodilla.tasklist;

import lombok.Value;

import java.time.LocalDate;

@Value
public class TaskDto {
    LocalDate when;
    String title;
    int priority;
}
