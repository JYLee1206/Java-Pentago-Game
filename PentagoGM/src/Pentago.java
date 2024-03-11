
import java.util.*;

public class Pentago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[][] Pentago = {       //Pentago 배열 선언  모두 0으로 채워짐
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				};
	int count = 2;    //카운트
	int win = 0;    //승리 
	int g = 1;     //플레이어 
	int k = 0;
	int r = 0;    //판 돌리기
	System.out.println("     게임을 시작합니다\n");
	System.out.println("=====================");
	while(k==0) {       //While문 반복 
		System.out.print("[\\]");  
		
		for (int i = 0; i < 6 ; i++) {
			System.out.print("[" +i + "]");   //가로줄
		}
		System.out.println();
		
		for (int m = 0; m < Pentago.length; m++) {  //펜타고 판 만들기
			System.out.print("["+m+"]");    //세로줄 
			for (int j = 0; j < Pentago.length; j++) {
				if(Pentago[m][j] == 0)  //배열안이 0이라면 []출력
					System.out.print("[" + " " + "]");	
				else if (Pentago[m][j] != 0) {  //배열안이 0이 아니면 [●] 또는 [○] 출력
					System.out.print("[" + Pentago[m][j] + "]");	
				}
			}
			System.out.println();
		}
		System.out.println("=====================");
		while(true) {
		if (r==1) {  //판 돌리기
			System.out.println("어느쪽을 돌리실건가요?");
			System.out.println("구현을 아직 안함");
			r=0;
		}
		else if (g%2==1 ) {  //p1 선택
			System.out.println("p1님 돌을 둘 가로위치를 입력하세요");
			int id1 = scanner.nextInt();  //돌의 가로위치 입력
			System.out.println("p1님 돌을 둘 세로위치를 입력하세요");
			int id2 = scanner.nextInt(); //돌의 세로위치 입력
			if((Pentago[id1][id2]!='●' && (Pentago[id1][id2] != '○')))  //같은 곳을 두는지 확인
			{
				Pentago[id1][id2] = '●';
				r=1;
				g++;  //g를 1증가시켜 다음 플레이어에게 선택권을 주게함
				break; //반복문 탈출
			}
			else {
				System.out.println("다시 선택해주세요\n");
				continue;  //반복문 계속
			}
			}
		else if (g%2==0) {  //p2선택
			System.out.println("p2님 돌을 둘 가로 위치를 입력하세요");
			int id3 = scanner.nextInt();  //돌의 가로 위치 입력
			System.out.println("p2님 돌을 둘 세로 위치를 입력하세요");
			int id4 = scanner.nextInt();  //돌의 세로 위치 입력
			if(Pentago[id3][id4] != '○' && Pentago[id3][id4]!='●')  //같은 곳을 두는지 확인
			{
				Pentago[id3][id4] = '○';
				r=1;
				g++;
				break;
			}
			else {
				System.out.println("다시 선택해주세요\n");
				continue;
			}
			}
		}
		for(int h = 0; h < 6; h++) { //세로승리
			for (int i = 0; i < count; i++) {
				if (Pentago[i][h] == '●' && Pentago[i + 1][h] == '●' && Pentago[i + 2][h] == '●' && Pentago[i + 3][h] == '●' && Pentago[i + 4][h] == '●') 
					{
						win = 1;
					}
				else if (Pentago[i][h] == '○' && Pentago[i + 1][h] == '○' && Pentago[i + 2][h] == '○' && Pentago[i + 3][h] == '○' && Pentago[i + 4][h] == '○') 
					{
						win = 2;
					}
			}
		}
		for(int h = 0; h<count; h++) { //가로승리
			for (int i = 0; i < 6; i++) {
				if (Pentago[i][h] == '●' && Pentago[i][h+1] == '●' && Pentago[i][h+2] == '●' && Pentago[i][h+3] == '●' && Pentago[i][h+4] == '●') 
					{
						win = 1;
					}
				else if (Pentago[i][h] == '○' && Pentago[i][h+1] == '○' && Pentago[i][h+2] == '○' && Pentago[i][h+3] == '○' && Pentago[i][h+4] == '○') 
					{
						win = 2;
					}
			}
		}
		for(int h = 0; h < count; h++) { // \대각선승리
			for (int i = 0; i < count; i++) {
				if (Pentago[i][h] == '●' && Pentago[i+1][h+1] == '●' && Pentago[i+2][h+2] == '●' && Pentago[i+3][h+3] == '●' && Pentago[i+4][h+4] == '●') 
					{
						win = 1;
					}
				else if (Pentago[i][h] == '○' && Pentago[i+1][h+1] == '○' && Pentago[i+2][h+2] == '○' && Pentago[i+3][h+3] == '○' && Pentago[i+4][h+4] == '○') 
					{
						win = 2;
					}
			}
		}
		for(int h = 0; h < count; h++) { // /대각선승리
			for (int i = 0; i < count; i++) {
				if (Pentago[i][h+4] == '●' && Pentago[i+1][h+3] == '●' && Pentago[i+2][h+2] == '●' && Pentago[i+3][h+1] == '●' && Pentago[i+4][h] == '●') 
					{
						win = 1;
					}
				else if (Pentago[i][h+4] == '○' && Pentago[i+1][h+3] == '○' && Pentago[i+2][h+2] == '○' && Pentago[i+3][h+1] == '○' && Pentago[i+4][h] == '○') 
					{
						win = 2;
					}
			}
		}
		if(win==1) {  //플레이어1의 승리
			System.out.println("p1승리");
			break;
		}
		else if(win==2) { //플레이어2의 승리
			System.out.println("p2승리");
			break;
			}
		}
	for (int i = 0; i < Pentago.length; i++) {  //마지막 이긴판 재 출력
		for (int j = 0; j < Pentago.length; j++) {
			System.out.print(Pentago[i][j] + " ");	
		}
		System.out.println();
		}
	}
}
