package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.time.LocalDateTime;

// DTO(Data Transfer Object) 데이터를 전송할 때 사용하는 객체. 파라미터를 따로따로 보내기가 쉽지 않아서
// 하나의 객체에 담아서 쓰자! 해서 만들어진 것.
// VO, Bean 이라고 쓰기도 했다...구체적 차이는 있다.

// 아래는 lombok이다. 이걸 쓰면 다 알아서 만들어줌! 언제가 불편하냐면-> 변수명 하나를 바꾸면 다 바꿔줘야함.
// lombok을 쓰면 필드만 고쳐주면 끝난다. 이름에 따라 Getter, Setter를 알아서 만들어주는 것이기 때문.
@Getter
@Setter
@ToString //필드값 확인할때 사용. 필수적이진 않다.
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}
