
public class AppearTime {
    interface IClear{
    	
    	public  void clear();
    	
    	
    }
    public class MyClear implements IClear{
         public MyClear(){}
    	public  void clear(){
    		System.out.println("��ʲô������������ʵ�ֽӿڵ��࣡����");
    		
    	}
    	
    	
    }	
	
	public static void main(String[] args) {
	 AppearTime.MyClear myclear=new AppearTime().new MyClear();
	 myclear.clear();
		
	
		
	}

}
