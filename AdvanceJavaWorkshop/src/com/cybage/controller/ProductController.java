package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher requestdispatch=null;
	ProductService product=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		product =new ProductServiceImpl();
		List<Product> productList=product.displayAll();
		
	
//		out.println("<table border='2'>");
//		out.println("<tr><th>product id</th><th>product name</th><th>price</th></tr>");
//		for(Product p:productList) {
//			out.println("<tr>");
//			out.println("<td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getPrice()+"</td");
//			out.println("</tr>");
//		}
//		out.println("</table>");
		request.setAttribute("list",productList);
		
	requestdispatch=request.getRequestDispatcher("/DisplayProduct.jsp");
		requestdispatch.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
		
		
	}


