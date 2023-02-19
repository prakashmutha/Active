package placement;

public class College
{
private Integer clg_id;
private String  c_name;
private String c_branch;
private String C_dept;
private int c_phno;


public College() 
{
	super();
}
public College(Integer clg_id, String c_name, String c_branch, String c_dept, int c_phno) {
	super();
	this.clg_id = clg_id;
	this.c_name = c_name;
	this.c_branch = c_branch;
	C_dept = c_dept;
	this.c_phno = c_phno;
}
public Integer getClg_id() {
	return clg_id;
}
public void setClg_id(Integer clg_id) {
	this.clg_id = clg_id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public String getC_branch() {
	return c_branch;
}
public void setC_branch(String c_branch) {
	this.c_branch = c_branch;
}
public String getC_dept() {
	return C_dept;
}
public void setC_dept(String c_dept) {
	C_dept = c_dept;
}
public int getC_phno() {
	return c_phno;
}
public void setC_phno(int c_phno) {
	this.c_phno = c_phno;
}
@Override
public String toString() {
	return "College [clg_id=" + clg_id + ", c_name=" + c_name + ", c_branch=" + c_branch + ", C_dept=" + C_dept
			+ ", c_phno=" + c_phno + "]";
}



}
