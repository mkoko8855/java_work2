package com.kosta.sample.chart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public EmpServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpVO> list = dao.empSelect();
//		System.out.println("총:" + list.size());
//		for(EmpVO evo  : list) {
//			System.out.println(evo.getSal());
//		}
		
		request.setAttribute("KEY_EMPLIST", list);
		request.getRequestDispatcher("lec_chart.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		---------- 서버로부터의 응답이 str으로 오는 경우
//		response.setContentType("text/html;charset=UTF-8");
//		EmpDAO dao = new EmpDAO();
//		ArrayList<EmpVO> list = dao.empSelect();
//		
//		Gson gson = new Gson();
//		String jsonStr = gson.toJson(list);
//		System.out.println(jsonStr);
//		//[{"empno":7566,"ename":"JONES","sal":2975},{"empno":7654,"ename":"MARTIN","sal":1250}...]
//		
//		PrintWriter out = response.getWriter();
//		//out.print("응답 ok");
//		out.print(jsonStr);
		
		
		//바로아래 한줄만 str으로 오는경우와의 차이점이 있음!!
		//제이슨으로 변환
		response.setContentType("application/json;charset=UTF-8");
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpVO> list = dao.empSelect();
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		System.out.println(jsonStr);
		//[{"empno":7566,"ename":"JONES","sal":2975},{"empno":7654,"ename":"MARTIN","sal":1250}...]
		
		PrintWriter out = response.getWriter();
		//out.print("응답 ok");
		out.print(jsonStr);
		
		
	}

}

