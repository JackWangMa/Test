
public class student {
   String name;
   int age;
   boolean sex;
   int score;
	 public student(String name,int age,String sex,int score) {
		this.name=name;
		this.age=age;
		if("��".equals(sex)){
			this.sex=true;
			
		}
		else if("Ů".equals(sex)){
			this.sex=false;
		}
		else
		{
			System.out.println("�Ա�������������Ĭ��Ϊ��");
			this.sex=true;
		}
      this.score=score;
		
		
		
	}
	 public student() 
	 {
		System.out.println("������޲εĹ��캯��");
	}
	public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}


public String isSex() {
	if(sex)
	{
		return "��";
	}
	
	else
		return "Ů";
	
}




public void setSex(String sex) {
	if("��".equals(sex)){
		this.sex=true;
	}
	else if("Ů".equals(sex)){
		this.sex=false;
	}
	else
	{
		
		System.out.println("�Ա�����������������Ĭ��Ϊ��");
		this.sex=true;
		
	}
}




public int getScore() {
	return score;
}




public void setScore(int score) {
	this.score = score;
}

}
