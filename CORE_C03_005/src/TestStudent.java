
public class TestStudent {

	public static void main(String[] args) {
		student st=new student();
		st.setName("������");
		st.setAge(23);
		st.setSex("��");
		//st.setSex("dfsaff");
		st.setScore(23);
		System.out.println("��ѧ������Ϣ��");
		System.out.println("������"+st.getName()+"   "+"��ͣ�"+st.getAge()+"  "+"�Ա�"+st.isSex()+"   "+"������"+st.getScore());
		
		
		
		student st1=new student("������",23,"��",212);		
		System.out.println("��ѧ������Ϣ��");
		System.out.println("������"+st1.getName()+"   "+"��ͣ�"+st1.getAge()+"  "+"�Ա�"+st1.isSex()+"   "+"������"+st1.getScore());
	}

}
