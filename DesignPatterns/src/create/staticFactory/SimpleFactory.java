package create.staticFactory;

public class SimpleFactory {

	public  static  SchoolUser getSchoolUser(String userName,String passWord){
		if("student".equals(userName) && "123456".equals(passWord)){
			return new Student();
		}
		if("teacher".equals(userName) && "123456".equals(passWord)){
			return new Teacher();
		}
		return null;
	}

}
