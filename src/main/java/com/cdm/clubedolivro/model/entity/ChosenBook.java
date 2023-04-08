package com.cdm.clubedolivro.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="chosenBooks")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChosenBook {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String readingMonth;

    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Book book;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private User user;

    @Column(nullable = true)
    private String createUser;

    @Column(nullable = false)
    private String updateUser;

    @Column(nullable = true)
    private String deleteUser;

    @Column(nullable = true)
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate createDate;

    @Column(nullable = false)
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate updateDate;

    @Column(nullable = true)
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate deleteDate;

    @OneToMany(mappedBy = "chosenBook")
    private List<Comment> commentList;

    @OneToOne(mappedBy = "chosenBook")
    private Meeting meeting;
}