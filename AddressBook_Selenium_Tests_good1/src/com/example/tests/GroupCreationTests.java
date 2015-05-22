package com.example.tests;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	
  @Test //���������� ����� � ������������ ������
  public void testNonEmptyGroupeCreation() throws Exception {
    openMainPage();   //�������� �������
    gotoGroupsPage(); //������� �� ������� ������� ������
    clicNewGroup();   //������e �� �������� ����� ������ Newgroupe
    GropeData group = new GropeData(); // (��������� � ���� ������ Groupdata)
    group.name = "group name 1"; 
    group.header = "header 1"; 
    group.footer = "footer 1"; 
	fillGroupeCreatoin(group); //���������� ���� ����� �� ��������
    submitGroupe(); //������� �� ������ Enter infirmation
    returnToGroupe(); //������� �� ������ ��������� � ������� group page
  }
  
  @Test //���������� ����� � ������� ������
  public void testsEmptysGroupeCreation() throws Exception {
    openMainPage(); 
    gotoGroupsPage();
    clicNewGroup(); 
    fillGroupeCreatoin(new GropeData("", "", "")); 
    submitGroupe(); 
    returnToGroupe();
  }
}
