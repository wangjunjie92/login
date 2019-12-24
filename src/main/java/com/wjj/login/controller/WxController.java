package com.wjj.login.controller;

import me.zhyd.oauth.config.AuthConfig;
import me.zhyd.oauth.request.AuthRequest;
import me.zhyd.oauth.request.AuthWeChatRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wangjunjie 2019/12/24 22:11
 * @Description:
 * @Version: 1.0.0
 * @Modified By: xxx 2019/12/24 22:11
 */

@Controller
@RequestMapping("/login")
public class WxController {

    @GetMapping("/wx")
    public void wxLogin(HttpServletResponse response) throws IOException {
        AuthRequest chatRequest = new AuthWeChatRequest(AuthConfig.builder()
                .clientId("wxd99431bbff8305a0")
                .clientSecret("60f78681d063590a469f1b297feff3c4")
                .redirectUri("http://www.pinzhi365.com")
                .build());
        String url = chatRequest.authorize("state");
        response.sendRedirect(url);

    }

    @GetMapping("/wx/callback")
    public void wxCall(HttpServletResponse response) throws IOException {
        /*AuthRequest chatRequest = new AuthWeChatRequest(AuthConfig.builder()
                .clientId("wxd99431bbff8305a0")
                .clientSecret("60f78681d063590a469f1b297feff3c4")
                .redirectUri("http://www.pinzhi365.com")
                .build());
        String url = chatRequest.login();
        response.sendRedirect(url);
*/
    }
}
