package com.sangoes.boot.uc.modules.admin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Copyright (c) 2018
 *
 * @author jerrychir
 * @date 2018/11/4 12:36 PM
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "登陆对象", description = "登陆对象")
public class SignInDto {
    public interface SignInMobileGroup {

    }

    /**
     * 手机号码
     */
    @NotEmpty(message = "手机号码不能为空", groups = SignInMobileGroup.class)
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\\\d{8}$", message = "不符合手机号码格式", groups = SignUpDto.MobileGroup.class)
    private String mobile;

    /**
     * 验证码
     */
    @NotEmpty(message = "验证码不能为空", groups = SignInMobileGroup.class)
    private String captcha;

    /**
     * 登陆类型
     */
    @NotNull(message = "登陆类型不能为空")
    private Integer signinType;
}
