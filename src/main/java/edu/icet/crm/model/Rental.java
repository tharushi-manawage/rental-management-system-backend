package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
    private Long id;
    private Date rentalDate;
    private Date dueDate;
    private Date expectedDate;
    private Date returnDate;
    private double totalCost;
    private double fine;
}