package com.wsd.tdms.components;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
/*
 * 加密工具组件
 */

@Component
public class BCryptPasswordEncoderUtil extends BCryptPasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        return super.encode(rawPassword);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {

        return super.matches(rawPassword,encodedPassword);
    }

}
