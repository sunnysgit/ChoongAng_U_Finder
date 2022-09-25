package service.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import service.CommandProcess;

public class MainBannerChangeAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		// file upload
		String real = request.getSession().getServletContext().getRealPath("bannerImage");
		int maxSize = 1024 * 1024 * 20;
		
		String realBannerName = request.getParameter("realBannerName");
		String uploadBannerName = null;
		try {
			MultipartRequest mr = new MultipartRequest(request, real, maxSize, "utf-8", new MyFileRenamePolicy(realBannerName));
			uploadBannerName = mr.getFilesystemName("banner");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		request.setAttribute("banner", uploadBannerName);
		
		
		return "mainBannerResult";
		
	}

}
