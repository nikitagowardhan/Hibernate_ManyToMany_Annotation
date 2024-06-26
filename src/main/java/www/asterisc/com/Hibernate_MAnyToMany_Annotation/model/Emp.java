package www.asterisc.com.Hibernate_MAnyToMany_Annotation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int eid;
	private String ename;
	@ManyToMany
	private List<Project>projects;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String ename, List<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.projects = projects;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
