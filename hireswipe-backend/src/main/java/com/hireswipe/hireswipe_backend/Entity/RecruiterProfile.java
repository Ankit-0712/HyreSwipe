package com.hireswipe.hireswipe_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="recruiter_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecruiterProfile {


    @Id
    private long id;

    @OneToOne
    @MapsId
    @JoinColumn(name="user_id")
    private User user;

    private String companyName;

    private String companyWebsite;

    private String designation;

    private String companyDescription;

}
