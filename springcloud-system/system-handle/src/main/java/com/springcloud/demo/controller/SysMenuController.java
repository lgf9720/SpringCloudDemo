package com.springcloud.demo.controller;

import com.springcloud.demo.service.SysPermissionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @auther: lai.guanfu
 * @date: 2019-06-04 23:00
 */
@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/menu")
public class SysMenuController {
    private SysPermissionService sysMenuService;
}
