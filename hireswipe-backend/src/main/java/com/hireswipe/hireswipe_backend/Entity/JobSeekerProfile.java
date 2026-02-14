package com.hireswipe.hireswipe_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job_seeker_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobSeekerProfile {

    @Id
    private Long id;

    @OneToOne
    @MapsId //JobSeekerProfile shares the same primary key as User
    @JoinColumn(name= " user_id")
    private User user;

    private String fullName;

    private String skills;

    private Integer experienceYears;

    private String resumeUrl;

    private String bio;


}
