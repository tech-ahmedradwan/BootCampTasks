package main.com.myApp.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	/**
	 * Specify {@code @Configuration} and/or {@code @Component} classes for the
	 * {@linkplain #createRootApplicationContext() root application context}.
	 *
	 * @return the configuration for the root application context, or {@code null}
	 * if creation and registration of a root context is not desired
	 */
	@Nullable
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/**
	 * Specify {@code @Configuration} and/or {@code @Component} classes for the
	 * {@linkplain #createServletApplicationContext() Servlet application context}.
	 *
	 * @return the configuration for the Servlet application context, or
	 * {@code null} if all configuration is specified through root config classes.
	 */
	@Nullable
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebApp.class};
	}

	/**
	 * Specify the servlet mapping(s) for the {@code DispatcherServlet} &mdash;
	 * for example {@code "/"}, {@code "/app"}, etc.
	 *
	 * @see #registerDispatcherServlet(ServletContext)
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}