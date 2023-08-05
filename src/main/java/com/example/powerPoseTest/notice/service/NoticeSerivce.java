
  package com.example.powerPoseTest.notice.service;
  
  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.example.powerPoseTest.notice.dao.INoticeRepository; import
  com.example.powerPoseTest.notice.model.Notice;
  
  
  @Service public class NoticeSerivce implements INoticeService {
  
  @Autowired INoticeRepository noticeRepository;
  
  @Override public List<Notice> selectNoticeList() {
	  // TODO Auto-generatedmethod stub 
	  return noticeRepository.selectNoticeList(); }
  
  @Override public Notice selectNotice(int noticeId) { // TODO Auto-generatedmethod stub
	  return noticeRepository.selectNotice(noticeId); }
  
  
  @Override public void insertNotice(Notice notice) { // TODO Auto-generatedmethod stub
	  noticeRepository.insertNotice(notice); }
  
  @Override public void updtaeNotice(Notice notice) { // TODO Auto-generated method stub
	  noticeRepository.updateNotice(notice); }
  
  
  @Override public void deleteNotice(int NoticeId) { // TODO Auto-generated method stub
	  noticeRepository.deleteNotice(NoticeId); } }
  

 