package cn.freeteam.util;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.freeteam.cms.model.Site;
import cn.freeteam.cms.model.Visit;
import cn.freeteam.cms.service.SiteService;
import cn.freeteam.cms.service.VisitService;
/**
 * 
 * <p>Title: IndexServlet.java</p>
 * 
 * <p>Description: 首页处理</p>
 * 
 * <p>Date: Apr 23, 2013</p>
 * 
 * <p>Time: 8:58:05 PM</p>
 * 
 * <p>Copyright: 2013</p>
 * 
 * <p>Company: freeteam</p>
 * 
 * @author freeteam
 * @version 1.0
 * 
 * <p>============================================</p>
 * <p>Modification History
 * <p>Mender: </p>
 * <p>Date: </p>
 * <p>Reason: </p>
 * <p>============================================</p>
 */
public class IndexServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		pro(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		pro(req, resp);
	}
	public void pro(HttpServletRequest req, HttpServletResponse resp){
		//检查是否有站点符合访问域名
		SiteService siteService=new SiteService();
		Site site=siteService.findByDomain(req.getServerName());
		String url="site/FreeCMS/index.html";
		if(site!=null){
			url="site/"+site.getSourcepath()+"/index.html";
		}else {
			site=siteService.findBySourcepath("FreeCMS");
		}
		if (site!=null) {
			//处理访问记录
			Visit visit=new Visit();
			visit.setSiteid(site.getId());
			visit.setAddtime(new Date());
			visit.setIp(req.getRemoteAddr());
			String uri=req.getRequestURI().replaceFirst(req.getContextPath(), "");
			String queryString=req.getQueryString();
			visit.setUrl(uri+(queryString!=null?"?"+queryString:""));
			new VisitService().add(visit);
		}
		try {
			req.getRequestDispatcher(url).forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}