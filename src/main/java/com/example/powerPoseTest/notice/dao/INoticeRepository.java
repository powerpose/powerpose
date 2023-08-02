package com.example.powerPoseTest.notice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.powerPoseTest.notice.model.Notice;

@Repository
@Mapper
public interface INoticeRepository {
	List<Notice> selectNoticeList();
	Notice selectNotice(int noticeId);
	void insertNotice(Notice notice);
	void updateNotice(Notice notice);
	void deleteNotice(int noticeId);
}
