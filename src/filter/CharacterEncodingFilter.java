package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 字符集编码过滤器
 * @author DUSTY
 */
public class CharacterEncodingFilter implements Filter {

    private FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        //读取配置文件中的配置参数，避免直接修改类
        request.setCharacterEncoding(filterConfig.getInitParameter("charset"));
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
