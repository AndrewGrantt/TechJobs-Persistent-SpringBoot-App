package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Location is needed")
    @Size(min = 3, max = 150, message = "Location must be between 3 and 100 characters")
    private String location;

    public String getLocation() {
        return location;
    }
    public Employer() {}


    public void setLocation(String saint_louis) {
    }
}
