/**
 * 文件名: LinuxListService.java
 * 版权：Copyright 2017-2022 CMCC All Rights Reserved.
 * 描述:
 */
package com.ch3.conditional;

/**
 * @description:
 * @author: Shenshuaihu
 * @version: 1.0
 * @data: 2019-05-30 23:19
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
