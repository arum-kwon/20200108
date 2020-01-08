package co.arum.dtoTest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.arum.dao.DAO;
import co.arum.dto.JobDto;

public class JobServiceImpl extends DAO implements Service {
	private PreparedStatement psmt;
	private ResultSet rs;
	private List<JobDto> list;
	
	private final String ALL_JOBS = "select * from jobs";
	
	@Override
	public List<JobDto> selectAll() throws Exception {
		list = new ArrayList<JobDto>();
		JobDto dto;
		psmt = conn.prepareStatement(ALL_JOBS);
		rs = psmt.executeQuery();
		
		while(rs.next()) { //next 처음 커서는 before File next실행시 1행 행이 비어있으면 false
			dto = new JobDto();
			dto.setJob_id(rs.getString("job_id"));
			dto.setJob_title(rs.getString("job_title"));
			dto.setMax_salary(rs.getInt("max_salary"));
			dto.setMin_salary(rs.getInt("min_salary"));
			list.add(dto);
		}
		return list;
	}

	@Override
	public Object select(Object dto) throws Exception {

		JobDto jobDto = (JobDto)dto;
		String sql = "SELECT * FROM jobs WHERE job_id = " + jobDto.getJob_id();
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		
		JobDto insdto = new JobDto();
		while(rs.next()) { //next 처음 커서는 before File next실행시 1행 행이 비어있으면 false
			insdto.setJob_id(rs.getString("job_id"));
			insdto.setJob_title(rs.getString("job_title"));
			insdto.setMax_salary(rs.getInt("max_salary"));
			insdto.setMin_salary(rs.getInt("min_salary"));
		}
		return insdto;
	}

	@Override
	public int update(Object dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Object dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
