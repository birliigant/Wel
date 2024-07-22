package com.sipc.welgame.interceptor;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sipc.welgame.handler.token.TokenHandler;
import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.TokenModel;
import com.sipc.welgame.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Component
public class JwtInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle( @NonNull HttpServletRequest request, @NonNull HttpServletResponse response,  @NonNull Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        if (!(handler instanceof HandlerMethod handlerMethod)) {
            return true;
        }
        if (StrUtil.isEmpty(token)  || !JwtUtils.verify(token)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            ObjectMapper objectMapper = new ObjectMapper();
            if (!(StrUtil.isEmpty(token) )) {
                response.getWriter().println(objectMapper.writeValueAsString(CommonResult.fail()));
            }
            return false;
        }
        TokenHandler.setTokenModelThreadLocal(JwtUtils.getTokenModelByToken(token));
        return true;
    }

    @Override
    public void postHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler, Exception ex) throws Exception {
        TokenHandler.remove();
    }

}
