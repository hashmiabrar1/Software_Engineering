Map<String,String> classList = new HashMap<String, String>();

public ClassGrades(){
	classList.put("Bob", "A");
	classList.put("Abrar","B");
}

public void printClassList{
	Iterator<Entry<String,String>> entries= classList.entrySet().iterator();
	while(entries.hasNext()){
		Entry<String, String> entry= entries.next();
		System.out.println("Key= "+ entry.getKey()+", Value=" +entry.getValue());
	}
}


public static void main(String[] args){
	ClassGrades myClassList= new ClassGrades();
	myClassList.printClassList();
}