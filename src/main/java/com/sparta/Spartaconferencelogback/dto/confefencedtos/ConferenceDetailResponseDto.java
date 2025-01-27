package com.sparta.Spartaconferencelogback.dto.confefencedtos;

import com.sparta.Spartaconferencelogback.dto.TimeResponseDto;
import com.sparta.Spartaconferencelogback.dto.userdtos.UserInfoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ConferenceDetailResponseDto {
    private Long conferenceId;
    private String title;
    private List<UserInfoDto> actualJoinedPeople;
    private String writer;
    private String date;
    private TimeResponseDto time;
    private String lastModifiedAt;
    private String contents;

}
