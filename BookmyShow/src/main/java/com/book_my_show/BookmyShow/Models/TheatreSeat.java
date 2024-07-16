package com.book_my_show.BookmyShow.Models;

import com.book_my_show.BookmyShow.Enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "theatre_seats")
public class TheatreSeat {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String seatNo;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    @JoinColumn
    @ManyToOne
    private Theatre theatre;
}

