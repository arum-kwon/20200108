package co.arum.dao;

import java.util.List;

import co.arum.dto.JobDto;

public interface JobService {
	public List<JobDto> selectAll() throws Exception;
	public JobDto select(JobDto dto) throws Exception; //전체 테이블 목록
	public int update(JobDto dto) throws Exception; //특정한 레코드
	public int delete(JobDto dto) throws Exception; //레코드 삭제
	public int insert(JobDto dto) throws Exception; //레코드 추가
}
