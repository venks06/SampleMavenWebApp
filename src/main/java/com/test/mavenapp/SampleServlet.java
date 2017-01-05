package com.test.mavenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

public class SampleServlet extends HttpServlet {
	
	private static final long serialVersionUID = -957173332454658622L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		if(null == session) {
			
		}
		JSONObject jo = new JSONObject();
		jo.put("text", "Hello, World");
		PrintWriter pw = resp.getWriter();
		pw.write(jo.toString());
		pw.close();
	}
}
