
import java.util.*;

public class Pentago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[][] Pentago = {       //Pentago �迭 ����  ��� 0���� ä����
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				};
	int count = 2;    //ī��Ʈ
	int win = 0;    //�¸� 
	int g = 1;     //�÷��̾� 
	int k = 0;
	int r = 0;    //�� ������
	System.out.println("     ������ �����մϴ�\n");
	System.out.println("=====================");
	while(k==0) {       //While�� �ݺ� 
		System.out.print("[\\]");  
		
		for (int i = 0; i < 6 ; i++) {
			System.out.print("[" +i + "]");   //������
		}
		System.out.println();
		
		for (int m = 0; m < Pentago.length; m++) {  //��Ÿ�� �� �����
			System.out.print("["+m+"]");    //������ 
			for (int j = 0; j < Pentago.length; j++) {
				if(Pentago[m][j] == 0)  //�迭���� 0�̶�� []���
					System.out.print("[" + " " + "]");	
				else if (Pentago[m][j] != 0) {  //�迭���� 0�� �ƴϸ� [��] �Ǵ� [��] ���
					System.out.print("[" + Pentago[m][j] + "]");	
				}
			}
			System.out.println();
		}
		System.out.println("=====================");
		while(true) {
		if (r==1) {  //�� ������
			System.out.println("������� �����ǰǰ���?");
			System.out.println("������ ���� ����");
			r=0;
		}
		else if (g%2==1 ) {  //p1 ����
			System.out.println("p1�� ���� �� ������ġ�� �Է��ϼ���");
			int id1 = scanner.nextInt();  //���� ������ġ �Է�
			System.out.println("p1�� ���� �� ������ġ�� �Է��ϼ���");
			int id2 = scanner.nextInt(); //���� ������ġ �Է�
			if((Pentago[id1][id2]!='��' && (Pentago[id1][id2] != '��')))  //���� ���� �δ��� Ȯ��
			{
				Pentago[id1][id2] = '��';
				r=1;
				g++;  //g�� 1�������� ���� �÷��̾�� ���ñ��� �ְ���
				break; //�ݺ��� Ż��
			}
			else {
				System.out.println("�ٽ� �������ּ���\n");
				continue;  //�ݺ��� ���
			}
			}
		else if (g%2==0) {  //p2����
			System.out.println("p2�� ���� �� ���� ��ġ�� �Է��ϼ���");
			int id3 = scanner.nextInt();  //���� ���� ��ġ �Է�
			System.out.println("p2�� ���� �� ���� ��ġ�� �Է��ϼ���");
			int id4 = scanner.nextInt();  //���� ���� ��ġ �Է�
			if(Pentago[id3][id4] != '��' && Pentago[id3][id4]!='��')  //���� ���� �δ��� Ȯ��
			{
				Pentago[id3][id4] = '��';
				r=1;
				g++;
				break;
			}
			else {
				System.out.println("�ٽ� �������ּ���\n");
				continue;
			}
			}
		}
		for(int h = 0; h < 6; h++) { //���ν¸�
			for (int i = 0; i < count; i++) {
				if (Pentago[i][h] == '��' && Pentago[i + 1][h] == '��' && Pentago[i + 2][h] == '��' && Pentago[i + 3][h] == '��' && Pentago[i + 4][h] == '��') 
					{
						win = 1;
					}
				else if (Pentago[i][h] == '��' && Pentago[i + 1][h] == '��' && Pentago[i + 2][h] == '��' && Pentago[i + 3][h] == '��' && Pentago[i + 4][h] == '��') 
					{
						win = 2;
					}
			}
		}
		for(int h = 0; h<count; h++) { //���ν¸�
			for (int i = 0; i < 6; i++) {
				if (Pentago[i][h] == '��' && Pentago[i][h+1] == '��' && Pentago[i][h+2] == '��' && Pentago[i][h+3] == '��' && Pentago[i][h+4] == '��') 
					{
						win = 1;
					}
				else if (Pentago[i][h] == '��' && Pentago[i][h+1] == '��' && Pentago[i][h+2] == '��' && Pentago[i][h+3] == '��' && Pentago[i][h+4] == '��') 
					{
						win = 2;
					}
			}
		}
		for(int h = 0; h < count; h++) { // \�밢���¸�
			for (int i = 0; i < count; i++) {
				if (Pentago[i][h] == '��' && Pentago[i+1][h+1] == '��' && Pentago[i+2][h+2] == '��' && Pentago[i+3][h+3] == '��' && Pentago[i+4][h+4] == '��') 
					{
						win = 1;
					}
				else if (Pentago[i][h] == '��' && Pentago[i+1][h+1] == '��' && Pentago[i+2][h+2] == '��' && Pentago[i+3][h+3] == '��' && Pentago[i+4][h+4] == '��') 
					{
						win = 2;
					}
			}
		}
		for(int h = 0; h < count; h++) { // /�밢���¸�
			for (int i = 0; i < count; i++) {
				if (Pentago[i][h+4] == '��' && Pentago[i+1][h+3] == '��' && Pentago[i+2][h+2] == '��' && Pentago[i+3][h+1] == '��' && Pentago[i+4][h] == '��') 
					{
						win = 1;
					}
				else if (Pentago[i][h+4] == '��' && Pentago[i+1][h+3] == '��' && Pentago[i+2][h+2] == '��' && Pentago[i+3][h+1] == '��' && Pentago[i+4][h] == '��') 
					{
						win = 2;
					}
			}
		}
		if(win==1) {  //�÷��̾�1�� �¸�
			System.out.println("p1�¸�");
			break;
		}
		else if(win==2) { //�÷��̾�2�� �¸�
			System.out.println("p2�¸�");
			break;
			}
		}
	for (int i = 0; i < Pentago.length; i++) {  //������ �̱��� �� ���
		for (int j = 0; j < Pentago.length; j++) {
			System.out.print(Pentago[i][j] + " ");	
		}
		System.out.println();
		}
	}
}
