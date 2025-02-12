package com.book_my_show.BookmyShow.Controllers;


import com.book_my_show.BookmyShow.DTOs.Request.BookTicketReqDto;
import com.book_my_show.BookmyShow.DTOs.Request.UserReqDto;
import com.book_my_show.BookmyShow.DTOs.Response.TicketBookedResponse;
import com.book_my_show.BookmyShow.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public String createUser(@RequestBody UserReqDto userReqDto) {
        return userService.createUser(userReqDto);
    }

    @PostMapping("/book-ticket")
    public ResponseEntity bookTicket(@RequestBody BookTicketReqDto bookTicketReqDto) {
        TicketBookedResponse ticketBookedResponse;
        try {
            ticketBookedResponse = userService.bookTicket(bookTicketReqDto);
            return new ResponseEntity<>(ticketBookedResponse, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get-all-tickets/{userId}")
    public ResponseEntity getAllTickets(@PathVariable("userId") Integer userId) {
        try {
            List<TicketBookedResponse> ticketBookedResponseList = userService.getAllTickets(userId);
            return new ResponseEntity<>(ticketBookedResponseList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}