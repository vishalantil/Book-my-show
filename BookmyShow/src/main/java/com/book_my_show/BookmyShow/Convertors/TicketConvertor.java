package com.book_my_show.BookmyShow.Convertors;

import com.book_my_show.BookmyShow.DTOs.Response.TicketBookedResponse;
import com.book_my_show.BookmyShow.Models.Show;
import com.book_my_show.BookmyShow.Models.Ticket;
import com.book_my_show.BookmyShow.Models.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TicketConvertor {

    public static Ticket makeTicket(Show show, User user, int totalBill) {
        Ticket ticket = new Ticket();
        ticket.setMovieName(show.getMovie().getName());
        ticket.setTheatreName(show.getTheatre().getName());
        ticket.setTotalBill(totalBill);
        ticket.setShowDate(show.getShowDate());
        ticket.setShowStartTime(show.getShowStartTime());
        ticket.setShowEndTime(show.getShowEndTime());
        return ticket;
    }

    public static TicketBookedResponse ticketToTicketBookedResponse(Ticket ticket) {
        return TicketBookedResponse.builder()
                .movieName(ticket.getMovieName())
                .theatreName(ticket.getTheatreName())
                .showStartTime(ticket.getShowStartTime())
                .showEndTime(ticket.getShowEndTime())
                .showDate(ticket.getShowDate())
                .totalBill(ticket.getTotalBill())
                .build();
    }
}
