import lombok.RequiredArgsConstructor;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/company")
@RequiredArgsConstructor
public class CompanyServlet extends HttpServlet {
  //  private CompanyService companyService;

//    @Override
//    public void init() throws ServletException {
//        super.init();
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        CompanyDao companyDao = new CompanyDao();
//        companyService = new CompanyService(companyDao);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Company> subCompanies = companyService.getAllSubCompanies();
//
//
//        response.setContentType("text/html");
//        response.setCharacterEncoding("UTF-8");
//
//        StringBuilder htmlBuilder = new StringBuilder();
//        htmlBuilder.append("<html>");
//        htmlBuilder.append("<head><title>Company List</title></head>");
//        htmlBuilder.append("<body>");
//        htmlBuilder.append("<h1>Company List</h1>");
//        htmlBuilder.append("<ul>");
//
//        for (Company company : subCompanies) {
//            htmlBuilder.append("<li>").append(company.getName()).append("</li>");
//        }
//
//        htmlBuilder.append("</ul>");
//        htmlBuilder.append("</body>");
//        htmlBuilder.append("</html>");
//
//        response.getWriter().write(htmlBuilder.toString());
//    }
//
//    public void destroy() {
//
//    }
}