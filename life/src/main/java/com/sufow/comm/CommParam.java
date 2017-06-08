package com.sufow.comm;

import java.util.HashMap;
import java.util.Map;

public class CommParam {
	public Map<String ,Object> attr = new HashMap<String, Object>();
	
	public void addAttr(String key,Object val){
		attr.put(key, val);
	}
	
	public String getAttr(String key) {
		
		if(attr.containsKey(key)){
			return (String) attr.get(key);
		}
		
		return "";
	}

}
