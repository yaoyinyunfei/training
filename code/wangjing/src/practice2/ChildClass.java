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
 *	创建时间: 2016年4月8日 - 上午11:36:02
 */
package practice2;

/**
 * <p>
 * @TODO 请“caoqifa” 尽快添加代码注释!（中文表达，简要说明）
 * </p>
 *
 * @author caoqifa
 *
 * @version 1.0.0
 *
 * @since 1.0.0
 *
 */
public class ChildClass extends FatherClass{

	public void func1()
	{
		System.out.println("This is Func1 of ChildClass");
	}
	
	 public void callFathersFun1()
	 {
		 super.func1();
	 }
}
