package day04;
//switch...case����ʾ
public class SwitchCaseDemo {
	public static void main(String[] args) {
		int num = 4;
		switch(num) { //byte,short,int,char,String(jdk1.7(��)��ʼ֧��)
		case 1: //if(num==1)
			System.out.println(111);
			break;
		case 2: //�Դ�Ϊ���
			System.out.println(222);
			break; //����switch
		case 3:
			System.out.println(333);
			break;
		default: //����case��δƥ��ʱִ��
			System.out.println(666);
		}
	}
}



















