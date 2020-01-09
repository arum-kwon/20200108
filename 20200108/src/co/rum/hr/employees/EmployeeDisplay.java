package co.rum.hr.employees;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDisplay {
	
	public void allSelectList() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		List<EmployeeDto> list = new ArrayList<EmployeeDto>();
		
		try {
			list = emp.allSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(EmployeeDto dto : list) {
			dto.toString();
		}
	}
	
	public void employeeInsert() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto empDto = new EmployeeDto();
		Date date = Date.valueOf("2020-01-08");
		empDto.setEmployee_id(250);
		empDto.setFirst_name("BAN");
		empDto.setLast_name("TANARACADA");
		empDto.setEmail("BAT");
		empDto.setHire_date(date);
		empDto.setManager_id(100);
		empDto.setJob_id("AD_VP");
		empDto.setPhone_number("011.555.5000");
		empDto.setCommission_pct(0);
		empDto.setDepartment_id(50);
		empDto.setSalary(22222);
		
		try {
			int n = emp.insert(empDto);
			if(n != 0) {
				System.out.println("SUCCESS");
			}else {
				System.out.println("FAIL");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchSelect() {
		EmployeeDto dto = new EmployeeDto();
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Scanner sc = new Scanner (System.in);
		System.out.print("검색할 ID : ");
		int key = sc.nextInt();
		try {
			dto = emp.select(key);
			dto.toString();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void employeeDelete() {
		allSelectList();
		EmployeeDto dto = new EmployeeDto();
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Scanner sc = new Scanner (System.in);
		System.out.print("삭제할 ID : ");
		int key = sc.nextInt();
		dto.setEmployee_id(key);
		try {
			int n = emp.delete(dto);
			if(n != 0) {
				System.out.println("삭제 완료");
			}else {
				System.out.println("do not delete");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		allSelectList();
	}
	
	public void employeeUpdate() {
		EmployeeDto dto = new EmployeeDto();
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Scanner sc = new Scanner (System.in);

		allSelectList();
		System.out.print("변경할 ID : ");
		int key = sc.nextInt(); sc.nextLine();
		try {
			dto = emp.select(key);
			dto.toString();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.print("FirstName : ");
		dto.setFirst_name(sc.nextLine());
		
		try {
			int n = emp.update(dto);
			if(n != 0) {
				System.out.println("변경 완료");
			}else {
				System.out.println("do not Update");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		allSelectList();
	}
}
