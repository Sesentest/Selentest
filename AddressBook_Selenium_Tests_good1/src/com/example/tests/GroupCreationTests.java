package com.example.tests;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	
  @Test //повторение теста с заполненными полями
  public void testNonEmptyGroupeCreation() throws Exception {
    openMainPage();   //открытие браузер
    gotoGroupsPage(); //нажатие на верхнюю вкладку группы
    clicNewGroup();   //нажатиe на создание новой группы Newgroupe
    GropeData group = new GropeData(); // (обращение к базе данных Groupdata)
    group.name = "group name 1"; 
    group.header = "header 1"; 
    group.footer = "footer 1"; 
	fillGroupeCreatoin(group); //заполнение всех полей на странице
    submitGroupe(); //нажатие на кнопку Enter infirmation
    returnToGroupe(); //нажатие на ссылку вернуться к группам group page
  }
  
  @Test //повторение теста с пустыми полями
  public void testsEmptysGroupeCreation() throws Exception {
    openMainPage(); 
    gotoGroupsPage();
    clicNewGroup(); 
    fillGroupeCreatoin(new GropeData("", "", "")); 
    submitGroupe(); 
    returnToGroupe();
  }
}
