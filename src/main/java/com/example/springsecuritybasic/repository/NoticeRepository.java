package com.example.springsecuritybasic.repository;

import com.example.springsecuritybasic.model.Notice;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
    List<Notice> findAllByNoticeId(Integer noticeId);

}