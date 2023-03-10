package com.luciuswong.renting.model.custom;

import com.luciuswong.renting.model.Rental;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PropertyTypeCount {
    private Rental.PropertyType propertyType;
    private Long count;
}
