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
 *	创建时间: 2016年4月8日 - 上午11:04:38
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
public class Testmain {
	public static void main(String[] args) {

		// 以下测试一个类中方法的作用域
		Classpublic cb1 = new Classpublic();
		cb1.funcitionPublic();

		try {
			cb1.functionProtected();
		} catch (Exception e) {
		}

		try {
			cb1.functionDefault();
		} catch (Exception e) {
		}

		try {
			// cb1.functionPrivated();
		} catch (Exception e) {
		}

		cb1.callPrivate();

		
		
		// 以下测试子类对父类方法的override
		ChildClass cc = new ChildClass();
		cc.func1();//使用重写过的func1 
		cc.callFathersFun1();//调用 父类中的func1

		
		//以下测试函数重载
		ClassForOverloadTest co=new ClassForOverloadTest();
		co.func();
		co.func("arg1");
		
		co.func("arg1","arg2");
	}
}
