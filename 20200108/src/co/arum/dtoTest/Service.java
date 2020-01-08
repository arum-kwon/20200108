package co.arum.dtoTest;

import java.util.List;

import co.arum.dto.JobDto;

public interface Service {
	public List<?> selectAll() throws Exception;
	public Object select(Object dto) throws Exception; //전체 테이블 목록
	public int update(Object dto) throws Exception; //특정한 레코드
	public int delete(Object dto) throws Exception; //레코드 삭제
	public int insert(Object dto) throws Exception; //레코드 추가
}
