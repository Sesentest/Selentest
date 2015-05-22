package com.example.tests;

import org.testng.annotations.Test;

//----------------------------------------------------------------------------------------------------------------

public class AddNewContact extends TestBase {

  @Test
  public void testsNonEmptyContactCreations() throws Exception {
    openMainPage();
    clicAddNewContact();
    ContactData group = new ContactData();
    group.firstname = "Владимир";
    group.lastname = "Барашкин";
    group.address = "Балахонова 1";
    group.home = "5465456456";
    group.mobile = "465456465";
    group.work = "56465456456";
    group.email = "dfsd@sd.ef";
    group.email2 = "df@df.ef";
    group.bday = "2";
    group.bmonth = "May";
    group.byear = "1989";
    group.new_group = "group 2";
    group.address2 = "Баршкина 22";
    group.homePhone2 = "98989898987";
	fillGroupeCreation(group);
    clicEnter();
    returnToHomePage();
  }
  
  @Test
  public void testEmptyContactCreations() throws Exception {
    openMainPage();
    clicAddNewContact();
    fillGroupeCreation(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    clicEnter();
    returnToHomePage();
  }
  


}
