package com.book_my_show.BookmyShow.DTOs.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserReqDto {

    private String name;
    private int age;
    private String mobileNo;
    private String emailId;
}
