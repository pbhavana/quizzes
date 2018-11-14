public class Employee {

	private int id;
	private String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public static Employee search(Employee[] e,int eid)
	{
		int flag = 0;
		for(int i = 0; i<5; i++)
		{
			if(e[i].id == eid)
			{
				flag = 1;
				return e[i];
				
				
			}
			
//			if(flag == 0) return null;
		}
		return null;
		
//		return e;
	}
	
	public static void main(String[] args) {
		Employee m;
		Employee e[] = new Employee[5];
		e[0] = new Employee(1,"Kash");
		e[1] = new Employee(2,"Shik");
		e[2] = new Employee(3,"yoo");
		e[3] = new Employee(4,"Apps");
		e[4] = new Employee(5,"Ishhmart");
		int eid = 7;
		
		for(int i = 0; i<5;i++)
		{
			System.out.println(e[i].id +" " + e[i].name);
		}
		
		m = Employee.search(e,eid);
		try{
		if(m!=null){
		System.out.println("Found \n"+ m.id + " " + m.name);
		}
		else{
	
			
			
			
				System.out.println("EmployeeNotFoundException");
			
				throw new EmployeeNotFoundException("uff!");
			
		}}catch(EmployeeNotFoundException p)
		{
			System.out.println("Caught, no employee found");
			p.printStackTrace();
		}
		}
		
	}
	
	
	
	
	



