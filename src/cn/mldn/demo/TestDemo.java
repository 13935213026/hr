package cn.mldn.demo;

class Dept{
	private int deptno;
	private String dname;
	private String loc;
	private Emp emps[];//多个雇员
	

	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public Emp[] getEmps() {
		return emps;
	}


	public void setEmps(Emp[] emps) {
		this.emps = emps;
	}


	public String getInfo(){
		return "部门编号："+this.deptno+",名称："+this.dname+",位置："+this.loc;
	}
}

class Emp{
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Dept dept;//表示对应的部门信息
	private Emp mgr;//表示雇员对应的领导
	public void setMgr(Emp mgr){
		this.mgr=mgr;
	}
	public Emp getMgr(){
		return this.mgr;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getInfo(){
		return "雇员编号："+this.empno+"，姓名："+this.ename+",职位"+this.job+",工资"+this.sal+",佣金"+this.comm;
	}


	
}


public class TestDemo{
	public static void main(String[] args){
		//第一步：设置数据
		//1.产生各自的独立对象
		Dept dept = new Dept();//部门信息
		Emp ea = new Emp();//雇员信息
		Emp eb = new Emp();//雇员信息
		Emp ec = new Emp();//雇员信息
		eb.setEmpno(12345);
		//2.设置雇员和领导关系
		ea.setMgr(eb);
		System.out.println(ea.getMgr().getEmpno());
		
	}
}
