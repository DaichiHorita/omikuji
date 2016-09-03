// UTF-8
public class lesson3{ 
	public static void main(String[] args) {

		System.out.println("[数あてゲーム]");// 数当てゲーム
		int ans = new java.util.Random().nextInt(9);// range(0,9)

		for ( int i = 0; i < 5; i++) {// 5 times roop
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();// please fill a number
			if (num == ans) {
				System.out.println("あたり！！");
				break;
			} else {
				System.out.println("はずれ！！もう一回遊べるドンｗｗ");
			}
		System.out.println("ゲームを終了します");// game end

		}



		}
}
