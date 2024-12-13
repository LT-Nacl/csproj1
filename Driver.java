import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Driver{
	public static void main(String[] args){
		boolean run = false;
		Scanner inp = new Scanner(System.in);
		String ANSI_RED = "\u001B[31m";
		String ANSI_RESET = "\u001B[0m";
		//start
		format();
		System.out.println(ANSI_RED + "Welcome to the O" + ANSI_RESET);
		System.out.println("start? y/n");
		if(inp.nextLine().equals("n")){return;}
		clearScreen();
		format();
		System.out.prinln("Choose: \n 1 - von");
		String selection = inp.nextLine();
		if(selection.equals("1")){
			KingVon player = new KingVon("Von");
		}else{
			Adventurer player = new Adventurer("default");
		}
		arrayList<String> ppl = new ArrayList<String>();
		ppl.add(player);


		while(true){
			if(inp.nextLine().equals("exit")){return;}
			clearScreen();
			System.out.println(player.getName() + 
					" ######## " + 
					player.getHP + 
					" / " + 
					player.getMaxHP() + 
					" ######## " + 
					player.getSpecial() + 
					" / " + 
					player.getSpecialMax());
			System.out.println("action?");
			String acc = inp.nextLine();
		}
	}
	public static void format(){
		for(int i = 0; i<3; i++){
			for(int j = 0; j<10; j++){
				System.out.print('#');
			}
			System.out.println();
		}
	}
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}
	public static ArrayList<String> getppl(){
		return ppl;
	}
}
