package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Product;
import com.cybage.service.ProductService;
import com.cybage.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher requestdispatch=null;
	ProductService product=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		ProductService pservice=new ProductServiceImpl();
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double price=Double.parseDouble(request.getParameter("price"));
		
		
		//Generate Product object
		Product p=new Product(id, name, price);
		pservice.addProduct();	
	
	}

}
