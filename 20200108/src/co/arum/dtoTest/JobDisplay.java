package co.arum.dtoTest;

import java.util.ArrayList;
import java.util.List;

import co.arum.dto.JobDto;

public class JobDisplay {
//	JobServiceImpl job; //spring framwork 사용 시 interface 객체를 호출해서 사용함
	private List<JobDto> list;

	public void allSelectDisplay() { // 셀렉트 전체 결과를 보여주는 메소드
		JobServiceImpl jobs = new JobServiceImpl();

		list = new ArrayList<JobDto>();
		try {
			list = jobs.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (JobDto dto : list) {
			System.out.print(dto.getJob_id() + " ");
			System.out.print(dto.getJob_title() + " ");
			System.out.print(dto.getMax_salary() + " ");
			System.out.println(dto.getMin_salary());

		}
	}
}
