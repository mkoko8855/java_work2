package com.kosta.sample.json;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


		/*
		JDBC -> Java Database Connectivity
		
		자바 프로그래밍 언어로 만들어진 데이터베이스 조작 인터페이스.
		다양한 RDB를 위한 일관된 인터페이스를 제공하는 API집합.
		프로그래머가 SQL 요구를 만드는데 사용할,
		일련의 객체지향 프로그램의 클래스들을 정의(묶어놓은)것이다.
		
		
		구글 -> mvnrepository -> 검색창에 ojdbc -> 2페이지에 ojdbc10 클릭 -> 19.18 -> 코드복사후 pom.xml에 붙여넣기
	
		
		이제
		jdbc와 연결을 담당하는 모든 패키지는 java.sql이 가지고 있다.
		임포트에 java.sql을 하면 된다.
		
		
		
		
		classforname으로 드라이버 건들면
		일어난다.
		getConnection()하나가 나온다.
		드라이버 로드가 메모리에 올라와있으면 
		DB와 연결해줘 라고 명령하는게 getConnection이다.
		getConnection()은 Connection을 던져주는데,
		이것을 이용해서 sql문장을 만드는데,
		이것이 바로 Statement이다.
		sql문장 만들었으면 실행해야지
		executeQuery() 는 무조건 select만.
		executeUpdate()는 나머지다.
		Query()는 데이터가 눈앞에 보이는거니
		한건한건 루프돌리며 내용을 볼껀데
		그게 resultSet()이다.
		Update는 close()로 마무리하면된다.
		
		
		
		
		
		
		
		
		
		
		
		JDBC Driver Type
		1. 브릿지
		2. 네이티브
		3. 미들웨어
		4. 퓨어
	
		
		
	
	
		*/
		
		











public class JDBCTest {
	public static void main(String[] args) {
		// 객체사용후 close하기위해 지역변수로 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 오라클 드라이버를 사용하겠다는 의미
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 자신의 주소값에 scott 라는 아이디와 tiger 의 비밀번호로 접속함
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "it", "0000");

			stmt = conn.createStatement(); //conn을 이용해서 sql준비
			// EMP 테이블 전체조회하기위한 쿼리문
			String query = "SELECT * FROM EMP";

			//select문이기때문에 executeQuery으로사용
			rs = stmt.executeQuery(query);

			while(rs.next()) {
				int empNo = rs.getInt("EMPNO");
				System.out.println(empNo);
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 항상 사용후 무조건 닫아주자!
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} 
}
