package dataBase.dao.entity;

import java.sql.Timestamp;
import java.util.Date;

public class EmployeeEntity {
    int eID;
    String userId;
    String password;
    String name;
    String email;
    Date date;
    long mobile;
    double salary;
    long ssn;
    Timestamp createDate;
    Timestamp updateDate;

	
	 public EmployeeEntity() { }
	 
    public EmployeeEntity(int eID, String userId, String password, String name, String email, Date date, long mobile,
			double salary, long ssn, Timestamp createDate, Timestamp updateDate) {
		super();
		this.eID = eID;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
		this.date = date;
		this.mobile = mobile;
		this.salary = salary;
		this.ssn = ssn;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}




	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
	public String toString() {
		return "EmployeeEntity [eID=" + eID + ", userId=" + userId + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", date=" + date + ", mobile=" + mobile + ", salary=" + salary + ", ssn=" + ssn
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
}
