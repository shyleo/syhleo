import java.io.*;
import java.util.*;
public class Emp implements Serializable{
	private Integer empno;
	private String ename;
	private Double sal;
	private Double comn;
	private Emp mgr;
	private Date date;
	public String toString(){		
		return "一位雇员";
	}
}