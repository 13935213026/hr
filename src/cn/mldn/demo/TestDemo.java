package cn.mldn.demo;

class Dept{
	private int deptno;
	private String dname;
	private String loc;
	private Emp emps[];//�����Ա
	

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
		return "���ű�ţ�"+this.deptno+",���ƣ�"+this.dname+",λ�ã�"+this.loc;
	}
}

class Emp{
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Dept dept;//��ʾ��Ӧ�Ĳ�����Ϣ
	private Emp mgr;//��ʾ��Ա��Ӧ���쵼
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
		return "��Ա��ţ�"+this.empno+"��������"+this.ename+",ְλ"+this.job+",����"+this.sal+",Ӷ��"+this.comm;
	}


	
}


public class TestDemo{
	public static void main(String[] args){
		//��һ������������
		//1.�������ԵĶ�������
		Dept dept = new Dept();//������Ϣ
		Emp ea = new Emp();//��Ա��Ϣ
		Emp eb = new Emp();//��Ա��Ϣ
		Emp ec = new Emp();//��Ա��Ϣ
		eb.setEmpno(12345);
		//2.���ù�Ա���쵼��ϵ
		ea.setMgr(eb);
		System.out.println(ea.getMgr().getEmpno());
		
	}
}
