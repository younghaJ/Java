package net;

public class ChatProtocol3 {
	
	//IF, CHAT, CHATALL, MAESSAGE, CHATLIST
	
	//(C->S) ID:aaa
	//(S->C) CHATLIST:aaa;bbb;ccc;ȫ�浿
	public static final String ID = "ID";
	
	//(C->S) CHAT:�޴¾��̵�;�޼��� ex)CHAT:bbb;�����
	//(S->C) CHAT:�����¾��̵�;�޼��� ex)CHAT:aaa;�����
	public static final String CHAT = "CHAT";
	
	//(C->S) CHATALL:�޼���
	//(S->C) CHATALL:[�����¾��̵�]�޼���
	public static final String CHATALL = "CHATALL";
	
	//(C->S) MAESSAGE;�޴¾��̵�;��������  ex)MAESSAGE:bbb;�����
	//(S->C) MAESSAGE;�����¾��̵�;�������� ex)MAESSAGE:aaa;�����
	public static final String MESSAGE = "MESSAGE";
	
	//(S->C) CHATLIST:aaa;bbb;ccc;ȫ�浿;
	public static final String CHATLIST = "CHATLIST";
	
	public static final String MODE = ":";
	
	//(C->S) MSGLIST:id
	//(S->C) MSGLIST:fid,tid,msg;fid,tid,msg;...
	//(S->C) MSGLIST:aaa,bbb,�����;bbb,ccc,����...
	public  static final String MSGLIST = "MSGLIST";
	
	public static void main(String[] args) {

	}

}