package com.jspxcms.ext.web.fore;


import com.jspxcms.core.constant.Constants;
import com.jspxcms.core.domain.Site;
import com.jspxcms.core.support.Context;
import com.jspxcms.core.support.ForeContext;
import com.jspxcms.core.support.Response;
import com.jspxcms.core.support.SiteResolver;
import com.jspxcms.ext.domain.SiteGuestbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static com.jspxcms.ext.domain.SiteGuestbook.MODE_OFF;

@Controller
public class MyController {

    @Autowired
    private SiteResolver siteResolver;
    public static final String TEMPLATE = "sys_my.html";
//    public static final String TEMPLATE_ITEM = "sys_guestbook_item.html";
//    public static final String TEMPLATE_FORM = "sys_guestbook_form.html";

    @RequestMapping("/mytest")
    public String index(Integer page, HttpServletRequest request,
                        HttpServletResponse response, Model modelMap) {
        return index(null, page, request, response, modelMap);
    }

    @RequestMapping(Constants.SITE_PREFIX_PATH + "/mytest")
    public String index(@PathVariable String siteNumber, Integer page,
                        HttpServletRequest request, HttpServletResponse response,
                        Model modelMap) {
        siteResolver.resolveSite(siteNumber);//获取站点信息
        Response resp = new Response(request, response, modelMap);
        Site site = Context.getCurrentSite();
//        SiteGuestbook sg = new SiteGuestbook(site.getCustoms());
        // 未开启
//        if (sg.getMode() == MODE_OFF) {
//            return resp.warning("guestbook.off");
//        }
        Map<String, Object> data = modelMap.asMap();
        ForeContext.setData(data, request);
        ForeContext.setPage(data, page);
//        return "ext/mytest/mytest";

        return site.getTemplate(TEMPLATE);
    }


}
