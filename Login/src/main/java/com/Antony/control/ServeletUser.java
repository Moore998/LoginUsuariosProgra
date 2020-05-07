package com.Antony.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Antony.DAO.UsuarioDao;
import com.Antony.model.Loginusuario;

/**
 * Servlet implementation class ServeletUser
 */
public class ServeletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String usu = request.getParameter("usuario");
		String contra = request.getParameter("contra");
        String cerrarSeccion = request.getParameter("btncerrar");
		
        if(cerrarSeccion!=null) {
        	if(cerrarSeccion.equals("Cerrar")) {
    			
        		HttpSession cerrarSecciones = (HttpSession)request.getSession();
        		cerrarSecciones.invalidate();
        		
        		response.sendRedirect("index.jsp");
        }
	      }else {
			
		
		
		UsuarioDao usuDao = new UsuarioDao();
		Loginusuario usuario = new Loginusuario();
		
		usuario.setUsuario(usu);
		usuario.setContrasena(contra);
		
		  int verificarUsuario = usuDao.ingresoUsuario(usuario).size();
		  
		  if(verificarUsuario==1) {

			  HttpSession seccion = request.getSession(true);
			  seccion.setAttribute("usuario", usu);
			 response.sendRedirect("Principal.jsp");
		  }else {
			  System.out.println("Error al ingresar");
		  }
	}
		  
		  //response.sendRedirect("index.jsp");
		
	}

}
