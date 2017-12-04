package demo.filter;


import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
	private String encoding = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding=filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
			servletRequest.setCharacterEncoding(encoding);
			servletResponse.setCharacterEncoding(encoding);
			servletResponse.setContentType("text/html;charset="+encoding);
			filterChain.doFilter(servletRequest,servletResponse);
	}

	@Override
	public void destroy() {

	}
}
