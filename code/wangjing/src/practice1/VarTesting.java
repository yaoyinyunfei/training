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
 *	创建时间: 2016年4月8日 - 上午9:26:55
 */
package practice1;

/**
 * <p>
 * 
 * @TODO 请“caoqifa” 尽快添加代码注释!（中文表达，简要说明）
 *       </p>
 * @author caoqifa
 * @version 1.0.0
 * @since 1.0.0
 */
public class VarTesting {
	public static void main(String[] args) {

		int varInt;
		Integer objInt;

		try {
			varInt = 100;			
			objInt = 200; //  objInt=new Integer(200);
			System.out.println(varInt);
			System.out.println(objInt);
		} 

		catch (Exception e) {
			System.out.println("obj Integer 不能直接赋值");
		}

		
		
		char varChar;
		Character objChar;
		varChar='A';
		objChar=new Character('B'); //objChar='B';
		
		System.out.println(varChar);
		System.out.println(objChar);
		
	}
}
