package com.testNG_YouTube;

import org.testng.annotations.Test;

public class G_Grouping {


@Test (groups = "education")
public void elemendarySchool() {
		System.out.println("i am in 3rd std ");	
}

@Test(groups = "education")
public void highSchool() {
	System.out.println("i am in 8th std");
}

@Test (groups = "education")
public void higherSecSchool() {
	System.out.println("i am in 12 std");
}

@Test (groups = "mobiles")
public void buyAppleMobile() {
	System.out.println("got iphone");
}

@Test (groups = "mobiles")
public void buyVivoMobile() {
	System.out.println("got vivo phone");	
}

@Test (groups = "mobiles")
public void buyMotoMobile() {
	System.out.println("got moto phone");
}

@Test (groups = "subjects")
public void tamilSub() {
	System.out.println("tamil");
}

@Test (groups = "subjects")
public void englishSub() {
	System.out.println("english");
}

@Test (groups = "subjects")
public void mathsSub() {
	System.out.println("maths");
}


}
