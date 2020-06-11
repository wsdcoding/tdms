package com.wsd.tdms.vo;

import com.wsd.tdms.entity.SysFrontendMenuTable;

/**
 * po到vo，前端需要显示父级pid、名称
 */
public class SysFrontendVo extends SysFrontendMenuTable {

    String parentName;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
