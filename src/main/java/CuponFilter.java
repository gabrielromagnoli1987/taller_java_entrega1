import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

@WebFilter(filterName = "cuponFilter", urlPatterns = {"/printCupon"})
public class CuponFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String band = request.getParameter("band");
        HashMap<String, Integer> cupons = (HashMap<String, Integer>) filterConfig.getServletContext().getAttribute("cupons");
        cupons.put(band, cupons.getOrDefault(band, 0) + 1);
        filterConfig.getServletContext().setAttribute("cupons", cupons);
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
