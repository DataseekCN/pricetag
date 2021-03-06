package com.fourbears.mall.dto;

import com.fourbears.mall.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by macro on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;

	public List<UmsPermissionNode> getChildren() {
		return children;
	}

	public void setChildren(List<UmsPermissionNode> children) {
		this.children = children;
	}
}
