/*
 * ================================================================
 * Copyright 2008-2015 AMT.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * AMT Corp. Ltd, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with AMT.
 * 
 * 国泰君安Web App移动平台项目	
 *
 * ================================================================
 *  创建人: caoqifa
 *	创建时间: 2016年4月8日 - 上午11:52:07
 */
package practice2;

/**
 * <p>
 * 
 * @TODO 请“caoqifa” 尽快添加代码注释!（中文表达，简要说明）
 *       </p>
 * @author caoqifa
 * @version 1.0.0
 * @since 1.0.0
 */
public class ClassForOverloadTest {

	public void func() {
		System.out.println(" no param");
	}

	public void func(String arg1) {
		System.out.println("   param1:" + arg1);
	}

	public void func(String arg1, String arg2) {
		System.out.println(String.format("param1:%s,param2:%s", arg1, arg2));
	}
}
