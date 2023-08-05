
  package com.example.powerPoseTest.notice.service;
  
 import java.util.List;
  
  import com.example.powerPoseTest.notice.model.Notice;
  
  public interface INoticeService { List<Notice> selectNoticeList(); Notice
  selectNotice(int NoticeId); void insertNotice(Notice notice); void
  updtaeNotice(Notice notice); void deleteNotice(int NoticeId); }
