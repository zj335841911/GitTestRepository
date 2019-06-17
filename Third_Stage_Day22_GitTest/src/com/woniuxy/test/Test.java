package com.woniuxy.test;
/**
 * 分支管理：
 * 	分支：git在管理项目的时候至少有一个分支master（主干）
 * 		主干的作用：主要是提供公共的代码，一般的程序员不要去对其进行修改
 * 		一般情况下由项目经理、组长配置好环境之后推送到远程仓库，这些代码作为master
 * 		其他的程序员、组员，应该在该分支以外的其他分支进行各自的开发
 * 		宿舍管理模块：张三，张三应该新建一个分支branch-zhangsan，然后在该分支上进行代码编写，
 * 					   新建分支相当于是复制了一份master的代码
 * 		学会管理模块：李四，李四也应该是新建一个分支，然后在该分支上编写代码
 * 
 * 
 * @author Administrator
 *
 */

public class Test {
	public static void main(String[] args) {
		System.out.println("hello world!");
	}
	
	public void fun(){
		System.out.println("hello git!");
		System.out.println("666");
	}
	public void fun1(){
		System.out.println("11111");
	}
	public void fun2(){
		System.out.println("5555");
	}
	public void fun3(){
		System.out.println("222");
	}
	public void fun4(){
		System.out.println("4444444");
	}
	public void fun5(){
		System.out.println(6666);
	}
	
}
