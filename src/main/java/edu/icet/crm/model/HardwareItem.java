package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HardwareItem {
    private Long id;
    private String name;
    private double rentalPerDay;
    private double finePerDay;
    private boolean availability;
}