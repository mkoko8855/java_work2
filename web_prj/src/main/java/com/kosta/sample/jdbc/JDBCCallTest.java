package com.kosta.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCallTest {
	
	
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
	
	static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	static final String DB_ID = "it";
	static final String DB_PW = "0000";
	
	public static void main(String[] args) {
		//시팔 세게 패네 ( CPR CSP RS
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try { //class.forName은 예외처리로.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			conn = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			if(conn != null) {
				System.out.println("connection OK");
			} else {
				System.out.println("connection fail");
			}
			String sql = "SELECT * FROM emp";
			//이제 execute할준비
			pstmt = conn.prepareStatement(sql); //prepareStatement는 return으로 preparedStatement를 줄 것이다. 즉, pstmt로 주니 받자!
	
			//준비된 객체를 이용하여 execute하자
			//select니까 executeQuery
			pstmt.executeQuery(sql); //얜 리턴으로 resultset. 즉, rs에담자
			rs = pstmt.executeQuery();
			
			
			/*
			  ARrayList에 Map담기
			  
			  ArrayList<HashMap<String, Object> 밥상 = new HashMap<String, Object>();
			  
			  while(rs.netx() == true){
			  	HashMap<String, Object> 식판 = new HashMap<String, Object>();
			  	식판.put("empno", rs.getInt("empno"));
			  	식판.put("ename", rs.getString("ename"));
			 	밥상.add(식판);
			  }
			  System.err.println(밥상);
			  
			 
			  for(int i=0; i<밥상.size(); i++){
			  	int a = (int)밥상.get(i).get("empno"); //get(i)는 한 사람씩 식판이 튀어나옴 
			  	String b = (String)밥상.get(i).get("ename"); //integer로 rapper돼서 나온다. 
			  System.out.println(a + "\t" + b);
			  
			  }
			  
			  
			  } catch (SQLException e) {
			e.printStackTrace();
		}
			  
			 */
			
			
			
			
			
			
			
			
			
			
			
			/*
			  VO로하는 법
			  ArrayList에 VO로.
			  
			  (EmpVO클래스에있는내용으로!)
			  
			  ArrayList<EmpVO> list = new HashMap<EmpVO>();
			  
			  while(rs.netx() == true){
			  EmpVO vo = new EmpVO();
			  	vo.setEmpno(rs.getInt("empno"));
			  	vo.setEname(rs.getString("ename"));
			  	list.add(vo);
			  	
			  
			  }
			  System.err.println("총 :" + list.size());
			  for(int i=0; i<list.size(); i++){
			  
			  int a = list.get(i).getEmpno();
			  String b = list.get(i).getEname(); 
			  System.out.println(a + "\t" + b);
			  }
			  
			  
			  VO가 편함! 이 방식 계속 사용할거임!
			  
			*/
			
			
			
			
			while(rs.next() == true) { //next는 한 줄을 읽음 -> next 다 돌고 읽을게 없으면 false
				int eno = rs.getInt("empno"); //컬럼 이름을 넣자. Int로 꺼내달라 했으니..타입은 int로
				String name = rs.getString("ename"); //이번엔 String
				System.out.println(eno + "\t" + name); 
				//ArrayList에 담아서 출력해도됨 -> 몇명인지 모르니 ArrayList, VO, Map에 담아보자!
				//ArrayList에 담아서 출력해도됨 -> 몇명인지 모르니 ArrayList, VO, Map에 담아보자!
				//ArrayList에 담아서 출력해도됨 -> 몇명인지 모르니 ArrayList, VO, Map에 담아보자!
				//ArrayList에 담아서 출력해도됨 -> 몇명인지 모르니 ArrayList, VO, Map에 담아보자!
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
//		String sql = "SELECT * FROM emp";
//		//이제 execute할준비
//		pstmt = conn.prepareStatement(sql); 여기서 또 예외처리하지말고 위의 예외처리 한 곳으로 올리자
		
		
		
		
		
		
		
		
	}

}
