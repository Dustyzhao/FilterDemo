package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *用户登录安全控制过滤器
 * @author DUSTY
 */
public class SessionFliter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //涉及到很多http的处理，需要对request、response进行转型处理
        //过滤器很多时候都会和http挂钩，这个操作会经常遇到
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        //判断用户是否完成了登录操作，session中是否存储用户名
        String loginUser = (String) httpServletRequest.getSession().getAttribute("loginUser");
        if (loginUser ==null) {
            //传递一个标志位flag，用以前端进行用户登陆状态的判断
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/index.jsp?flag=1");
            return;
        }else {
            filterChain.doFilter(httpServletRequest,httpServletResponse);
            return;
        }
    }

    @Override
    public void destroy() {

    }
}
