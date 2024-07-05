package com.example.demo.repository;

import com.example.demo.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    // mysql 기준이라고 한다. 현재 가지고 있는 조회수에서 1개 증가시켜서 조회수를 바꾸는 내용
    // update board_table set board_hits=board_hits+1 where id=? <쿼리
    @Modifying //업데이트하거나 할 때는 필수로 붙여야하는 어노테이션!
    @Query(value = "update BoardEntity b set b.boardHits=b.boardHits+1 where b.id=:id")
    // entity를 기준으로 작성한 쿼리입니다. db에 작성하는건 nativeQuery를 쓸 수 있다네요.
    void updateHits(@Param("id") Long id);
}
