package com.interviewproject.interviewproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class InterviewProjectApplication {

	private static  List<String> devQa;
	private static  Map<String, List> manager2;
	private static  Map<String, Map> manager1;
	private static  Map<String, Map> manager3;
	private static  Map<String, String> manager4;
	private static  Map<String, String> manager5;
	private static  Map<Map, Map> littleKahuna;
	private static  Map<Map, Map> bigKahuna;

	static private int man1=0;
	static private int man2=0;
	static private int man3=0;
	static private int man4=0;
	static private int man5=0;
	static private int dQ1=0;

	/*<Manager, Manager, Developer, QA Tester, Manager, Manager, 0, Manager, Developer*/
	public static void main(String[] args) {
		run(InterviewProjectApplication.class, args);
		//todo: figure out why it doesn't want the lists to populate
			manager1.put("Manager", manager2);
			manager2.put("Manager", devQa);
			devQa.add("Developer");
			devQa.add("QA Tester");
			manager3.put("Manager", manager4);
			manager4.put("Manager", null);
			manager5.put("Manager", "Developer");
			littleKahuna.put(manager3, manager5);
			bigKahuna.put(manager1, littleKahuna);
			for(Map.Entry<Map, Map> zed : bigKahuna.entrySet()){
				for(Map.Entry<String, Map> kay : manager1.entrySet()){
					if(kay.getKey()=="Manager"){
						man2=man2+600;
					}else{
						for(String dee : devQa){
							if(dee=="Developer"){
								dQ1=dQ1+2000;
							}
							if(dee=="QA Tester"){
								dQ1=dQ1+1000;
							}
							man2=man2+dQ1;
							man1=man2+600;
						}
					}
				}
				for(Map.Entry<Map, Map> jay : littleKahuna.entrySet()){
					for(Map.Entry<String, String> el : manager5.entrySet()){
						if(el.getKey()=="Manager") {
							man5 = man5+600;
						}
						if(el.getValue()=="Programmer"){
							man5 = man5+2000;
						}
						if(el.getValue()=="QA Tester"){
							man5 = man5+1000;
						}
					}
					for(Map.Entry<String, Map> em : manager3.entrySet()){
						if(em.getKey()=="Manager"){
							man3 = man3+600;
						}
						for(Map.Entry<String, String> en : manager4.entrySet()){
							if(en.getKey()=="Manager") {
								man4 = man4+600;
								man3=man3+600;
							}
							if(en.getValue()=="Programmer"){
								man4 = man4+2000;
							}
							if(en.getValue()=="QA Tester"){
								man4 = man4+1000;
							}
					}
				}

			}

	}
		System.out.println("Manager1 needs $"+man1);
		System.out.println("Manager2 needs $"+man2);
		System.out.println("Manager3 needs $"+man3);
		System.out.println("Manager4 needs $"+man4);
		System.out.println("Manager5 needs $"+man5);
		System.out.println("The Department needs $"+man1+man3+man5);
}

	public static void setDevQa(List<String> devQa) {
		InterviewProjectApplication.devQa = devQa;
	}

	public static void setManager2(Map<String, List> manager2) {
		InterviewProjectApplication.manager2 = manager2;
	}

	public static void setManager1(Map<String, Map> manager1) {
		InterviewProjectApplication.manager1 = manager1;
	}

	public static void setManager3(Map<String, Map> manager3) {
		InterviewProjectApplication.manager3 = manager3;
	}

	public static void setManager4(Map<String, String> manager4) {
		InterviewProjectApplication.manager4 = manager4;
	}

	public static void setManager5(Map<String, String> manager5) {
		InterviewProjectApplication.manager5 = manager5;
	}

	public static void setLittleKahuna(Map<Map, Map> littleKahuna) {
		InterviewProjectApplication.littleKahuna = littleKahuna;
	}

	public static void setBigKahuna(Map<Map, Map> bigKahuna) {
		InterviewProjectApplication.bigKahuna = bigKahuna;
	}
}

