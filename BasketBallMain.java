import java.util.ArrayList;
import java.util.Scanner;

public class BasketBallMain {

	public static int plPoints = 0;
	public static int compPoints = 0;
	public static int plFouls = 0;
	public static int currPlFouls = 0;
	public static int compFouls = 0;
	public static int currCompFouls = 0;
	public static boolean defense = false;
	public static int courtPosition = 3;
	public static int plTactics = 0;
	public static int plBaseOffTactics = 2;
	public static int plBaseDefTactics = 0;
	public static int compTactics = 0;
	public static int compBaseOffTactics = 0;
	public static int compBaseDefTactics = 0;
	public static boolean ballOpen = false;
	public static boolean rebounded = false;
	public static Player plPlayer;
	public static Player compPlayer;
	public static ArrayList <Player> plRoster = new ArrayList <Player> ();
	public static ArrayList <Player> compRoster = new ArrayList <Player> ();
	public static ArrayList <String> playOptions = new ArrayList <String> ();
	public static ArrayList <String> compOptions = new ArrayList <String> ();
	public static ArrayList <String> offTactics = new ArrayList <String> ();
	public static ArrayList <String> defTactics = new ArrayList <String> ();
	
	public static int passer = 0;
	
	public static int pickAndRoll = 0;
	public static int fake = 0;
	public static int pass = 0;
	public static int compPickAndRoll = 0;
	public static int compFake = 0;
	public static int compPass = 0;
	
	public static boolean foul = false;
	
	public static void main(String[] args) {
		
		defense = false; 
		ballOpen = false;
		
		Scanner s1 = new Scanner(System.in);
		
		//PLAYER CREATION
		
		//TEAM HOBBITS
		//TEAM HOBBITS
		//TEAM HOBBITS
		Player easyPlPG = new Player ("Bilbo", "PG", 0, 15, 17, 21);
		Player easyPlSG = new Player ("Frodo", "SG", 1, 13, 16, 28);
		Player easyPlSF = new Player ("Pippin", "SF", 2, 12, 23, 22);
		Player easyPlPF = new Player ("Merry", "PF", 3, 13, 17, 23);
		Player easyPlC = new Player ("Sam", "C", 4, 25, 13, 24);
		
		//PL TEAM
		ArrayList <Player> plTeamEasy = new ArrayList <Player> ();
		plTeamEasy.add(easyPlPG);
		plTeamEasy.add(easyPlSG);
		plTeamEasy.add(easyPlSF);
		plTeamEasy.add(easyPlPF);
		plTeamEasy.add(easyPlC);
		
		//COMP TEAM
		ArrayList <Player> plTeamEasy2 = new ArrayList <Player> ();
		plTeamEasy2.add(new Player ("Bilbo", "PG", 0, 15, 17, 21));
		plTeamEasy2.add(new Player ("Frodo", "SG", 1, 13, 16, 28));
		plTeamEasy2.add(new Player ("Pippin", "SF", 2, 12, 23, 22));
		plTeamEasy2.add(new Player ("Merry", "PF", 3, 13, 17, 23));
		plTeamEasy2.add(new Player ("Sam", "C", 4, 25, 13, 24));
		
		//TEAM DISNEY
		//TEAM DISNEY
		//TEAM DISNEY
		Player plPG = new Player ("Mickey Mouse", "PG", 0, 19, 23, 17);
		Player plSG = new Player ("Minnie Mouse", "SG", 1, 17, 22, 20);
		Player plSF = new Player ("Donald Duck", "SF", 2, 18, 16, 21);
		Player plPF = new Player ("Pluto", "PF", 3, 20, 8, 23);
		Player plC = new Player ("Goofy", "C", 4, 22, 12, 21);
		
		//PL TEAM
		ArrayList <Player> plTeamMedium = new ArrayList <Player> ();
		plTeamMedium.add(plPG);
		plTeamMedium.add(plSG);
		plTeamMedium.add(plSF);
		plTeamMedium.add(plPF);
		plTeamMedium.add(plC);

		//COMP TEAM
		ArrayList <Player> plTeamMedium2 = new ArrayList <Player> ();
		plTeamMedium2.add(new Player ("Mickey Mouse", "PG", 0, 19, 23, 17));
		plTeamMedium2.add(new Player ("Minnie Mouse", "SG", 1, 17, 22, 20));
		plTeamMedium2.add(new Player ("Donald Duck", "SF", 2, 18, 16, 21));
		plTeamMedium2.add(new Player ("Pluto", "PF", 3, 20, 8, 23));
		plTeamMedium2.add(new Player ("Goofy", "C", 4, 22, 12, 21));
		
		//TEAM DC
		//TEAM DC
		//TEAM DC
		Player hardPlPG = new Player ("Flash", "PG", 0, 15, 16, 26);
		Player hardPlSG = new Player ("Green Lantern", "SG", 1, 17, 21, 17);
		Player hardPlSF = new Player ("Wonder Woman", "SF", 2, 21, 20, 16);
		Player hardPlPF = new Player ("Batman", "PF", 3, 22, 21, 18);
		Player hardPlC = new Player ("Superman", "C", 4, 24, 18, 16);

		//PL TEAM
		ArrayList <Player> plTeamHard = new ArrayList <Player> ();
		plTeamHard.add(hardPlPG);
		plTeamHard.add(hardPlSG);
		plTeamHard.add(hardPlSF);
		plTeamHard.add(hardPlPF);
		plTeamHard.add(hardPlC);
		
		//COMP TEAM
		ArrayList <Player> plTeamHard2 = new ArrayList <Player> ();
		plTeamHard2.add(new Player ("Flash", "PG", 0, 15, 16, 26));
		plTeamHard2.add(new Player ("Green Lantern", "SG", 1, 17, 21, 17));
		plTeamHard2.add(new Player ("Wonder Woman", "SF", 2, 21, 20, 16));
		plTeamHard2.add(new Player ("Batman", "PF", 3, 22, 21, 18));
		plTeamHard2.add(new Player ("Superman", "C", 4, 24, 18, 16));

		//TEAM LEBRON
		//TEAM LEBRON
		//TEAM LEBRON
		Player allStarPlPG = new Player ("James", "PG", 0, 20, 22, 20);
		Player allStarPlSG = new Player ("Harden", "SG", 1, 18, 23, 20);
		Player allStarPlSF = new Player ("Doncic", "SF", 2, 18, 23, 18);
		Player allStarPlPF = new Player ("Leonard", "PF", 3, 19, 22, 18);
		Player allStarPlC = new Player ("Davis", "C", 4, 26, 14, 15);
		
		//PL TEAM
		ArrayList <Player> plTeamAllStar = new ArrayList <Player> ();
		plTeamAllStar.add(allStarPlPG);
		plTeamAllStar.add(allStarPlSG);
		plTeamAllStar.add(allStarPlSF);
		plTeamAllStar.add(allStarPlPF);
		plTeamAllStar.add(allStarPlC);

		//COMP TEAM
		ArrayList <Player> plTeamAllStar2 = new ArrayList <Player> ();
		plTeamAllStar2.add(new Player ("James", "PG", 0, 20, 22, 20));
		plTeamAllStar2.add(new Player ("Harden", "SG", 1, 18, 23, 20));
		plTeamAllStar2.add(new Player ("Doncic", "SF", 2, 18, 23, 18));
		plTeamAllStar2.add(new Player ("Leonard", "PF", 3, 19, 22, 18));
		plTeamAllStar2.add(new Player ("Davis", "C", 4, 26, 14, 15));
		
		//OPPONENT CREATION
		
		//TEAM TOY STORY
		//TEAM TOY STORY
		//TEAM TOY STORY
		Player easyCompPG = new Player ("Buzz Lightyear", "PG", 0, 19, 17, 20);
		Player easyCompSG = new Player ("Woody", "SG", 1, 17, 21, 19);
		Player easyCompSF = new Player ("Mr. Potato Head", "SF", 2, 16, 17, 23);
		Player easyCompPF = new Player ("Hamm", "PF", 3, 21, 11, 18);
		Player easyCompC = new Player ("Rex", "C", 4, 28, 10, 12);
		
		//COMP TEAM
		ArrayList <Player> teamEasy = new ArrayList <Player> ();
		teamEasy.add(easyCompPG);
		teamEasy.add(easyCompSG);
		teamEasy.add(easyCompSF);
		teamEasy.add(easyCompPF);
		teamEasy.add(easyCompC);

		//PL TEAM
		ArrayList <Player> teamEasy2 = new ArrayList <Player> ();
		teamEasy2.add(new Player ("Buzz Lightyear", "PG", 0, 19, 17, 20));
		teamEasy2.add(new Player ("Woody", "SG", 1, 17, 21, 19));
		teamEasy2.add(new Player ("Mr. Potato Head", "SF", 2, 16, 17, 23));
		teamEasy2.add(new Player ("Hamm", "PF", 3, 21, 11, 18));
		teamEasy2.add(new Player ("Rex", "C", 4, 28, 10, 12));
		
		//TEAM FROZEN
		//TEAM FROZEN
		//TEAM FROZEN
		Player compPG = new Player ("Elsa", "PG", 0, 15, 22, 19);
		Player compSG = new Player ("Anna", "SG", 1, 14, 24, 19);
		Player compSF = new Player ("Olaf", "SF", 2, 17, 18, 24);
		Player compPF = new Player ("Sven", "PF", 3, 25, 6, 18);
		Player compC = new Player ("Kristoff", "C", 4, 22, 15, 16);
		
		//COMP TEAM
		ArrayList <Player> teamMedium = new ArrayList <Player> ();
		teamMedium.add(compPG);
		teamMedium.add(compSG);
		teamMedium.add(compSF);
		teamMedium.add(compPF);
		teamMedium.add(compC);

		//PL TEAM
		ArrayList <Player> teamMedium2 = new ArrayList <Player> ();
		teamMedium2.add(new Player ("Elsa", "PG", 0, 15, 22, 19));
		teamMedium2.add(new Player ("Anna", "SG", 1, 14, 24, 19));
		teamMedium2.add(new Player ("Olaf", "SF", 2, 17, 18, 24));
		teamMedium2.add(new Player ("Sven", "PF", 3, 25, 6, 18));
		teamMedium2.add(new Player ("Kristoff", "C", 4, 22, 15, 16));
		
		//TEAM MARVEL
		//TEAM MARVEL
		//TEAM MARVEL
		Player hardCompPG = new Player ("Captain America", "PG", 0, 21, 17, 17);
		Player hardCompSG = new Player ("Hawkeye", "SG", 1, 14, 27, 18);
		Player hardCompSF = new Player ("Ironman", "SF", 2, 18, 19, 21);
		Player hardCompPF = new Player ("Thor", "PF", 3, 21, 17, 19);
		Player hardCompC = new Player ("Hulk", "C", 4, 38, 6, 8);
		
		//COMP TEAM
		ArrayList <Player> teamHard = new ArrayList <Player> ();
		teamHard.add(hardCompPG);
		teamHard.add(hardCompSG);
		teamHard.add(hardCompSF);
		teamHard.add(hardCompPF);
		teamHard.add(hardCompC);

		//PL TEAM
		ArrayList <Player> teamHard2 = new ArrayList <Player> ();
		teamHard2.add(new Player ("Captain America", "PG", 0, 21, 17, 17));
		teamHard2.add(new Player ("Hawkeye", "SG", 1, 14, 27, 18));
		teamHard2.add(new Player ("Ironman", "SF", 2, 18, 19, 21));
		teamHard2.add(new Player ("Thor", "PF", 3, 21, 17, 19));
		teamHard2.add(new Player ("Hulk", "C", 4, 38, 6, 8));
		
		//TEAM ANTETOTOUNMPO
		//TEAM ANTETOTOUNMPO
		//TEAM ANTETOTOUNMPO
		Player allStarCompPG = new Player ("Young", "PG", 0, 15, 24, 20);
		Player allStarCompSG = new Player ("Walker", "SG", 1, 17, 23, 18);
		Player allStarCompSF = new Player ("Siakim", "SF", 2, 20, 18, 17);
		Player allStarCompPF = new Player ("Antetokounmpo", "PF", 3, 23, 21, 18);
		Player allStarCompC = new Player ("Embiid", "C", 4, 24, 12, 18);
		
		//COMP TEAM
		ArrayList <Player> teamAllStar = new ArrayList <Player> ();
		teamAllStar.add(allStarCompPG);
		teamAllStar.add(allStarCompSG);
		teamAllStar.add(allStarCompSF);
		teamAllStar.add(allStarCompPF);
		teamAllStar.add(allStarCompC);
		
		//PL TEAM
		ArrayList <Player> teamAllStar2 = new ArrayList <Player> ();
		teamAllStar2.add(new Player ("Young", "PG", 0, 15, 24, 20));
		teamAllStar2.add(new Player ("Walker", "SG", 1, 17, 23, 18));
		teamAllStar2.add(new Player ("Siakim", "SF", 2, 20, 18, 17));
		teamAllStar2.add(new Player ("Antetokounmpo", "PF", 3, 23, 21, 18));
		teamAllStar2.add(new Player ("Embiid", "C", 4, 24, 12, 18));
		
		ArrayList <Player> allPlayers = new ArrayList <Player> ();
		allPlayers.add(new Player ("James", "PG/SF/PF", 0, 20, 22, 20));
		allPlayers.add(new Player ("Antetokounmpo", "SF/PF/C", 3, 23, 21, 18));
		allPlayers.add(new Player ("Leonard", "SF/PF", 3, 19, 22, 18));
		allPlayers.add(new Player ("Harden", "PG/SG", 1, 18, 23, 20));
		allPlayers.add(new Player ("Young", "PG/SG", 0, 15, 24, 20));
		allPlayers.add(new Player ("Davis", "PF/C", 4, 26, 14, 15));
		allPlayers.add(new Player ("Doncic", "SG/SF", 2, 18, 23, 18));
		allPlayers.add(new Player ("Embiid", "PF/C", 4, 24, 12, 18));
		allPlayers.add(new Player ("Walker", "PG/SG", 1, 17, 23, 18));
		allPlayers.add(new Player ("Siakim", "SF/PF", 2, 20, 18, 17));
		allPlayers.add(new Player ("Batman", "SG/SF/PF", 3, 22, 21, 18));
		allPlayers.add(new Player ("Ironman", "SF/PF", 2, 18, 19, 21));
		allPlayers.add(new Player ("Hulk", "C", 4, 38, 6, 8));
		allPlayers.add(new Player ("Thor", "SF/PF", 3, 21, 17, 19));
		allPlayers.add(new Player ("Superman", "PF/C", 4, 24, 18, 16));
		allPlayers.add(new Player ("Captain America", "PG/SF", 0, 21, 17, 17));
		allPlayers.add(new Player ("Wonder Woman", "SG/SF", 2, 21, 20, 16));
		allPlayers.add(new Player ("Green Lantern", "PG/SG", 1, 17, 21, 17));
		allPlayers.add(new Player ("Flash", "PG", 0, 15, 16, 26));
		allPlayers.add(new Player ("Hawkeye", "PG/SG", 1, 14, 27, 18));
		allPlayers.add(new Player ("Olaf", "SG/SF", 2, 17, 18, 24));
		allPlayers.add(new Player ("Donald Duck", "PG/SF", 2, 18, 16, 21));
		allPlayers.add(new Player ("Goofy", "PF/C", 4, 22, 12, 21));
		allPlayers.add(new Player ("Elsa", "PG/SG", 0, 15, 22, 19));
		allPlayers.add(new Player ("Anna", "SG", 1, 14, 24, 19));
		allPlayers.add(new Player ("Pluto", "PF/C", 3, 20, 8, 23));
		allPlayers.add(new Player ("Sven", "PF/C", 3, 25, 6, 18));
		allPlayers.add(new Player ("Mickey Mouse", "PG/SG", 0, 19, 23, 17));
		allPlayers.add(new Player ("Minnie Mouse", "PG/SG", 1, 17, 22, 20));
		allPlayers.add(new Player ("Kristoff", "PF/C", 4, 22, 15, 16));
		allPlayers.add(new Player ("Mr. Potato Head", "SF", 2, 16, 17, 23));
		allPlayers.add(new Player ("Merry", "SF/PF", 3, 13, 17, 23));
		allPlayers.add(new Player ("Frodo", "PG/SG", 1, 13, 16, 28));
		allPlayers.add(new Player ("Buzz Lightyear", "PG", 0, 19, 17, 20));
		allPlayers.add(new Player ("Rex", "PF/C", 4, 28, 10, 12));
		allPlayers.add(new Player ("Woody", "PG/SG", 1, 17, 21, 19));
		allPlayers.add(new Player ("Sam", "PF/C", 4, 25, 13, 24));
		allPlayers.add(new Player ("Hamm", "SF/PF", 3, 21, 11, 18));
		allPlayers.add(new Player ("Bilbo", "PG/SF", 0, 15, 17, 21));
		allPlayers.add(new Player ("Pippin", "SF/PF", 2, 12, 23, 22));

		ArrayList <Player> allPlayers2 = new ArrayList <Player> ();
		allPlayers2.add(new Player ("James", "PG/SF/PF", 0, 20, 22, 20));
		allPlayers2.add(new Player ("Antetokounmpo", "SF/PF/C", 3, 23, 21, 18));
		allPlayers2.add(new Player ("Leonard", "SF/PF", 3, 19, 22, 18));
		allPlayers2.add(new Player ("Harden", "PG/SG", 1, 18, 23, 20));
		allPlayers2.add(new Player ("Young", "PG/SG", 0, 15, 24, 20));
		allPlayers2.add(new Player ("Davis", "PF/C", 4, 26, 14, 15));
		allPlayers2.add(new Player ("Doncic", "SG/SF", 2, 18, 23, 18));
		allPlayers2.add(new Player ("Embiid", "PF/C", 4, 24, 12, 18));
		allPlayers2.add(new Player ("Walker", "PG/SG", 1, 17, 23, 18));
		allPlayers2.add(new Player ("Siakim", "SF/PF", 2, 20, 18, 17));
		allPlayers2.add(new Player ("Batman", "SG/SF/PF", 3, 22, 21, 18));
		allPlayers2.add(new Player ("Ironman", "SF/PF", 2, 18, 19, 21));
		allPlayers2.add(new Player ("Hulk", "C", 4, 38, 6, 8));
		allPlayers2.add(new Player ("Thor", "SF/PF", 3, 21, 17, 19));
		allPlayers2.add(new Player ("Superman", "PF/C", 4, 24, 18, 16));
		allPlayers2.add(new Player ("Captain America", "PG/SF", 0, 21, 17, 17));
		allPlayers2.add(new Player ("Wonder Woman", "SG/SF", 2, 21, 20, 16));
		allPlayers2.add(new Player ("Green Lantern", "PG/SG", 1, 17, 21, 17));
		allPlayers2.add(new Player ("Flash", "PG", 0, 15, 16, 26));
		allPlayers2.add(new Player ("Hawkeye", "PG/SG", 1, 14, 27, 18));
		allPlayers2.add(new Player ("Olaf", "SG/SF", 2, 17, 18, 24));
		allPlayers2.add(new Player ("Donald Duck", "PG/SF", 2, 18, 16, 21));
		allPlayers2.add(new Player ("Goofy", "PF/C", 4, 22, 12, 21));
		allPlayers2.add(new Player ("Elsa", "PG/SG", 0, 15, 22, 19));
		allPlayers2.add(new Player ("Anna", "SG", 1, 14, 24, 19));
		allPlayers2.add(new Player ("Pluto", "PF/C", 3, 20, 8, 23));
		allPlayers2.add(new Player ("Sven", "PF/C", 3, 25, 6, 18));
		allPlayers2.add(new Player ("Mickey Mouse", "PG/SG", 0, 19, 23, 17));
		allPlayers2.add(new Player ("Minnie Mouse", "PG/SG", 1, 17, 22, 20));
		allPlayers2.add(new Player ("Kristoff", "PF/C", 4, 22, 15, 16));
		allPlayers2.add(new Player ("Mr. Potato Head", "SF", 2, 16, 17, 23));
		allPlayers2.add(new Player ("Merry", "SF/PF", 3, 13, 17, 23));
		allPlayers2.add(new Player ("Frodo", "PG/SG", 1, 13, 16, 28));
		allPlayers2.add(new Player ("Buzz Lightyear", "PG", 0, 19, 17, 20));
		allPlayers2.add(new Player ("Rex", "PF/C", 4, 28, 10, 12));
		allPlayers2.add(new Player ("Woody", "PG/SG", 1, 17, 21, 19));
		allPlayers2.add(new Player ("Sam", "PF/C", 4, 25, 13, 24));
		allPlayers2.add(new Player ("Hamm", "SF/PF", 3, 21, 11, 18));
		allPlayers2.add(new Player ("Bilbo", "PG/SF", 0, 15, 17, 21));
		allPlayers2.add(new Player ("Pippin", "SF/PF", 2, 12, 23, 22));
		
		//TACTICS CREATION
		offTactics.add("Isolation");
		offTactics.add("2 Out 3 In");
		offTactics.add("3 Out 2 In");
		offTactics.add("4 Out 1 In");
		offTactics.add("5 Out     ");
		
		defTactics.add("Man-to-Man");
		defTactics.add("1-2-2 Zone");
		defTactics.add("1-3-1 Zone");
		defTactics.add("2-3 Zone");
		defTactics.add("3-2 Zone");
		
		//COMPUTER PLAYSTYLE
		compBaseOffTactics = (int) (Math.random()*4);
		compBaseDefTactics = (int) (Math.random()*5);
		compBaseOffTactics++;
		
		//INTRO
		System.out.println();
		System.out.println("Please enlarge console for best gaming experience");
		System.out.println();
		System.out.println("Press Enter to Continue");
		s1.nextLine();
		int doYouWantTutorial = 1;
		while (doYouWantTutorial == 1) {
			System.out.println("Welcome to Java Basketball!");
			System.out.println();
			
			System.out.println("Do you require a tutorial of the game?");
			System.out.println("    1 - Yes");
			System.out.println("    2 - No");
			
			doYouWantTutorial = s1.nextInt();
			s1.nextLine();
			
			if (doYouWantTutorial == 1) {
				gameTutorial();
			}
		}
		
		//PLAYER TEAM
		int plSelect = 1;
		while (plSelect == 1) {
			plSelect = 1;
			System.out.println();
			System.out.println("Choose your team: ");
			System.out.println("  1 - TEAM HOBBITS");
			System.out.println("  2 - TEAM TOY STORY");
			System.out.println("  3 - TEAM DISNEY");
			System.out.println("  4 - TEAM FROZEN");
			System.out.println("  5 - TEAM DC");
			System.out.println("  6 - TEAM MARVEL");
			System.out.println("  7 - TEAM ALL-STAR");
			System.out.println("  8 - DRAFT YOUR OWN TEAM");
			int oppDiff = s1.nextInt();
			s1.nextLine();
			if (oppDiff == 1) {
				plSelect = 1;
				int easyCon = 1;
				while (easyCon == 1) {
					plSelect = 1;
					System.out.println();
					System.out.println("Are you sure you want to play with TEAM HOBBITS?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your team has been set");
						plSelect = 0;
						easyCon = 0;
						plRoster = plTeamEasy;
					}
					else if (confirmation == 3) {
						plSelect = 1;
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamEasy.get(a).getName() + " (" + teamEasy.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamEasy.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								plSelect = 1;
								lookieHere = 6;
							}
						}
					}
					else {
						plSelect = 1;
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 2) {
				plSelect = 1;
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to play with TEAM TOY STORY?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your team has been set");
						plSelect = 0;
						easyCon = 0;
						plRoster = teamEasy2;
					}
					else if (confirmation == 3) {
						plSelect = 1;
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + teamEasy2.get(a).getName() + " (" + teamEasy2.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(teamEasy2.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
								plSelect = 1;
							}
						}
					}
					else {
						easyCon = 0;
						plSelect = 1;
					}
				}
			}
			else if (oppDiff == 3) {
				plSelect = 1;
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to play with TEAM DISNEY?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your team has been set");
						plSelect = 0;
						easyCon = 0;
						plRoster = plTeamMedium;
					}
					else if (confirmation == 3) {
						plSelect = 1;
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamMedium.get(a).getName() + " (" + teamMedium.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamMedium.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
								plSelect = 1;
							}
						}
					}
					else {
						easyCon = 0;
						plSelect = 1;
					}
				}
			}
			else if (oppDiff == 4) {
				plSelect = 1;
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to play with TEAM FROZEN?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your team has been set");
						plSelect = 0;
						easyCon = 0;
						plRoster = teamMedium2;
					}
					else if (confirmation == 3) {
						plSelect = 1;
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + teamMedium2.get(a).getName() + " (" + teamMedium2.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(teamMedium2.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
								plSelect = 1;
							}
						}
					}
					else {
						easyCon = 0;
						plSelect = 1;
					}
				}
			}
			else if (oppDiff == 5) {
				plSelect = 1;
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to play with TEAM DC?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your team has been set");
						plSelect = 0;
						easyCon = 0;
						plRoster = plTeamHard;
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamHard.get(a).getName() + " (" + plTeamHard.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamHard.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 6) {
				plSelect = 1;
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to play with TEAM MARVEL?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your team has been set");
						plSelect = 0;
						easyCon = 0;
						plRoster = teamHard2;
					}
					else if (confirmation == 3) {
						plSelect = 1;
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + teamHard2.get(a).getName() + " (" + teamMedium.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(teamHard2.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
								plSelect = 1;
							}
						}
					}
					else {
						easyCon = 0;
						plSelect = 1;
					}
				}
			}
			else if (oppDiff == 7){
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to play with TEAM ALL-STAR?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Do you wish to play with TEAM LEBRON or TEAM ANTETOKOUNMPO?");
						System.out.println("  1 - LEBRON");
						System.out.println("  2 - ANTETOKOUNMPO");
						int allStarConf = s1.nextInt();
						s1.nextLine();
						if (allStarConf == 1) {
							System.out.println();
							System.out.println("Your team has been set");
							plSelect = 0;
							easyCon = 0;
							plRoster = plTeamAllStar;
						}
						else {
							System.out.println();
							System.out.println("Your team has been set");
							plSelect = 0;
							easyCon = 0;
							plRoster = teamAllStar2;
						}
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamAllStar.get(a).getName() + " (" + plTeamAllStar.get(a).getPosition() + ")");
							}
							for (int a = 5; a < 10; a++) {
								System.out.println("  " + (a+1) + " - " + teamAllStar.get(a-5).getName() + " (" + plTeamAllStar.get(a-5).getPosition() + ")");
							}
							System.out.println("  11 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamAllStar.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else if (lookAtPl >= 6 && lookAtPl <= 10) {
								System.out.println(teamAllStar.get(lookAtPl-6));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to draft your own team?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					//DRAFT YOUR TEAM
					//DRAFT YOUR TEAM
					//DRAFT YOUR TEAM
					if (confirmation == 1) {
						System.out.println("");
						System.out.println("Which player do you wish to be your PG?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers.get(a).getName() + " (" + allPlayers.get(a).getPosition() + ")	");
							if (!allPlayers.get(a).getName().equals("Antetokounmpo") && !allPlayers.get(a).getName().equals("Batman") && !allPlayers.get(a).getName().equals("Captain America") && !allPlayers.get(a).getName().equals("Wonder Woman") && !allPlayers.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							System.out.println("  " + (a+21) + " - " + allPlayers.get(a+20).getName() + " (" + allPlayers.get(a+20).getPosition() + ")		");
						}
						int yourPG = s1.nextInt();
						s1.nextLine();
						plRoster.add(allPlayers.get(yourPG-1));
						plRoster.get(0).setNum(0);
						plRoster.get(0).setPosition("PG");
						System.out.println();
						System.out.println(plRoster.get(0).getName() + " has been drafted as PG");
						allPlayers.remove(yourPG-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your SG?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers.get(a).getName() + " (" + allPlayers.get(a).getPosition() + ")	");
							if (!allPlayers.get(a).getName().equals("Antetokounmpo") && !allPlayers.get(a).getName().equals("Batman") && !allPlayers.get(a).getName().equals("Captain America") && !allPlayers.get(a).getName().equals("Wonder Woman") && !allPlayers.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 19) {
								System.out.println("  " + (a+21) + " - " + allPlayers.get(a+20).getName() + " (" + allPlayers.get(a+20).getPosition() + ")		");
							}
							if (a >= 19) {
								System.out.println();
							}
						}
						int yourSG = s1.nextInt();
						s1.nextLine();
						plRoster.add(allPlayers.get(yourSG-1));
						plRoster.get(1).setNum(1);
						plRoster.get(1).setPosition("SG");
						System.out.println();
						System.out.println(plRoster.get(1).getName() + " has been drafted as SG");
						allPlayers.remove(yourSG-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your SF?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers.get(a).getName() + " (" + allPlayers.get(a).getPosition() + ")	");
							if (!allPlayers.get(a).getName().equals("Antetokounmpo") && !allPlayers.get(a).getName().equals("Batman") && !allPlayers.get(a).getName().equals("Captain America") && !allPlayers.get(a).getName().equals("Wonder Woman") && !allPlayers.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 18) {
								System.out.println("  " + (a+21) + " - " + allPlayers.get(a+20).getName() + " (" + allPlayers.get(a+20).getPosition() + ")		");
							}
							if (a >= 18) {
								System.out.println();
							}
						}
						int yourSF = s1.nextInt();
						s1.nextLine();
						plRoster.add(allPlayers.get(yourSF-1));
						plRoster.get(2).setNum(2);
						plRoster.get(2).setPosition("SF");
						System.out.println();
						System.out.println(plRoster.get(2).getName() + " has been drafted as SF");
						allPlayers.remove(yourSF-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your PF?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers.get(a).getName() + " (" + allPlayers.get(a).getPosition() + ")	");
							if (!allPlayers.get(a).getName().equals("Antetokounmpo") && !allPlayers.get(a).getName().equals("Batman") && !allPlayers.get(a).getName().equals("Captain America") && !allPlayers.get(a).getName().equals("Wonder Woman") && !allPlayers.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 17) {
								System.out.println("  " + (a+21) + " - " + allPlayers.get(a+20).getName() + " (" + allPlayers.get(a+20).getPosition() + ")		");
							}
							if (a >= 17) {
								System.out.println();
							}
						}
						int yourPF = s1.nextInt();
						s1.nextLine();
						plRoster.add(allPlayers.get(yourPF-1));
						plRoster.get(3).setNum(3);
						plRoster.get(3).setPosition("PF");
						System.out.println();
						System.out.println(plRoster.get(3).getName() + " has been drafted as PF");
						allPlayers.remove(yourPF-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your C?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers.get(a).getName() + " (" + allPlayers.get(a).getPosition() + ")	");
							if (!allPlayers.get(a).getName().equals("Antetokounmpo") && !allPlayers.get(a).getName().equals("Batman") && !allPlayers.get(a).getName().equals("Captain America") && !allPlayers.get(a).getName().equals("Wonder Woman") && !allPlayers.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 16) {
								System.out.println("  " + (a+21) + " - " + allPlayers.get(a+20).getName() + " (" + allPlayers.get(a+20).getPosition() + ")		");
							}
							if (a >= 16) {
								System.out.println();
							}
						}
						int yourC = s1.nextInt();
						s1.nextLine();
						plRoster.add(allPlayers.get(yourC-1));
						plRoster.get(4).setNum(4);
						plRoster.get(4).setPosition("C");
						System.out.println();
						System.out.println(plRoster.get(4).getName() + " has been drafted as C");
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						easyCon = 0;
						plSelect = 0;
					}
					else if (confirmation == 3) {
						int plPosition = 1;
						while (plPosition == 1) {
							System.out.println();
							System.out.println("Which player position do you want to examine?");
							System.out.println("  1 - PG");
							System.out.println("  2 - SG");
							System.out.println("  3 - SF");
							System.out.println("  4 - PF");
							System.out.println("  5 - C");
							System.out.println("  6 - Back");
							int seePlPos = s1.nextInt();
							s1.nextLine();
							if (seePlPos == 6) {
								plPosition = 0;
							}
							while (seePlPos != 6) {
								if (seePlPos == 1) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlPG);
									allPG.add(easyCompPG);
									allPG.add(plPG);
									allPG.add(compPG);
									allPG.add(hardPlPG);
									allPG.add(hardCompPG);
									allPG.add(allStarPlPG);
									allPG.add(allStarCompPG);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 2) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlSG);
									allPG.add(easyCompSG);
									allPG.add(plSG);
									allPG.add(compSG);
									allPG.add(hardPlSG);
									allPG.add(hardCompSG);
									allPG.add(allStarPlSG);
									allPG.add(allStarCompSG);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 3) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlSF);
									allPG.add(easyCompSF);
									allPG.add(plSF);
									allPG.add(compSF);
									allPG.add(hardPlSF);
									allPG.add(hardCompSF);
									allPG.add(allStarPlSF);
									allPG.add(allStarCompSF);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 4) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlPF);
									allPG.add(easyCompPF);
									allPG.add(plPF);
									allPG.add(compPF);
									allPG.add(hardPlPF);
									allPG.add(hardCompPF);
									allPG.add(allStarPlPF);
									allPG.add(allStarCompPF);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 5) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlC);
									allPG.add(easyCompC);
									allPG.add(plC);
									allPG.add(compC);
									allPG.add(hardPlC);
									allPG.add(hardCompC);
									allPG.add(allStarPlC);
									allPG.add(allStarCompC);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else {
									plPosition = 0;
								}
							}
						}
					}
					else {
						easyCon = 0;
					}
			}
			}
		}
		
		//PLAYER ADJUSTMENTS
		int plAdjust = 1;
		while (plAdjust == 1) {
			System.out.println();
			System.out.println("Your Players:");
			for (int a = 0; a < plRoster.size(); a++) 
				System.out.println("  " + (a+1) + " - " + plRoster.get(a).getName() + " (" + plRoster.get(a).getPosition() + ")");
			System.out.println();
			
			System.out.println("Do you wish to make any changes?");
			System.out.println("    1 - Yes");
			System.out.println("    2 - No");
			plAdjust = s1.nextInt();
			s1.nextLine();
			
			if (plAdjust == 1) {
				playerAdjustments();
			}
		}
		
		//OPPONENT SELECTION
		int oppSelect = 1;
		while (oppSelect == 1) {
			System.out.println();
			System.out.println("Choose opponent difficulty: ");
			System.out.println("  1 - TEAM HOBBITS");
			System.out.println("  2 - TEAM TOY STORY");
			System.out.println("  3 - TEAM DISNEY");
			System.out.println("  4 - TEAM FROZEN");
			System.out.println("  5 - TEAM DC");
			System.out.println("  6 - TEAM MARVEL");
			System.out.println("  7 - TEAM ALL-STAR");
			System.out.println("  8 - DRAFT YOUR OPPONENT'S TEAM");
			int oppDiff = s1.nextInt();
			s1.nextLine();
			if (oppDiff == 1) {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to face off against TEAM HOBBITS?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your opponent has been set");
						oppSelect = 0;
						easyCon = 0;
						compRoster = plTeamEasy2;
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamEasy2.get(a).getName() + " (" + teamEasy.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamEasy2.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 2) {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to face off against TEAM TOY STORY?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your opponent has been set");
						oppSelect = 0;
						easyCon = 0;
						compRoster = teamEasy;
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + teamEasy.get(a).getName() + " (" + teamMedium.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(teamEasy.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 3) {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to face off against TEAM DISNEY?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your opponent has been set");
						oppSelect = 0;
						easyCon = 0;
						compRoster = plTeamMedium2;
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamMedium2.get(a).getName() + " (" + teamHard.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamMedium2.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 4) {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to face off against TEAM FROZEN?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your opponent has been set");
						oppSelect = 0;
						easyCon = 0;
						compRoster = teamMedium;
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + teamMedium.get(a).getName() + " (" + teamHard.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(teamMedium.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 5) {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to face off against TEAM DC?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your opponent has been set");
						oppSelect = 0;
						easyCon = 0;
						compRoster = plTeamHard2;
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamHard2.get(a).getName() + " (" + teamHard.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamHard2.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 6) {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to face off against TEAM MARVEL?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Your opponent has been set");
						oppSelect = 0;
						easyCon = 0;
						compRoster = teamHard;
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + teamHard.get(a).getName() + " (" + teamHard.get(a).getPosition() + ")");
							}
							System.out.println("  6 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(teamHard.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else if (oppDiff == 7) {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to face off against TEAM ALL-STAR?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					if (confirmation == 1) {
						System.out.println();
						System.out.println("Do you wish to play against the TEAM LEBRON or TEAM ANTETOKOUMNPO?");
						System.out.println("  1 - LEBRON");
						System.out.println("  2 - ANTETOKOUMNPO");
						int allStarConf = s1.nextInt();
						s1.nextLine();
						if (allStarConf == 1) {
							System.out.println();
							System.out.println("Your opponent has been set");
							oppSelect = 0;
							easyCon = 0;
							compRoster = plTeamAllStar2;
						}
						else {
							System.out.println();
							System.out.println("Your opponent has been set");
							oppSelect = 0;
							easyCon = 0;
							compRoster = teamAllStar;
						}
					}
					else if (confirmation == 3) {
						int lookieHere = 1;
						while (lookieHere != 6) {
							System.out.println();
							System.out.println("Which player would you like to examine?");
							for (int a = 0; a < 5; a++) {
								System.out.println("  " + (a+1) + " - " + plTeamAllStar2.get(a).getName() + " (" + teamAllStar.get(a).getPosition() + ")");
							}
							for (int a = 5; a < 10; a++) {
								System.out.println("  " + (a+1) + " - " + teamAllStar.get(a-5).getName() + " (" + teamAllStar.get(a-5).getPosition() + ")");
							}
							System.out.println("  11 - Back");
							int lookAtPl = s1.nextInt();
							s1.nextLine();
							System.out.println();
							if (lookAtPl >= 1 && lookAtPl <= 5) {
								System.out.println(plTeamAllStar2.get(lookAtPl-1));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else if (lookAtPl >= 6 && lookAtPl <= 10) {
								System.out.println(teamAllStar.get(lookAtPl-6));
								System.out.println();
								System.out.println("Press Enter to Continue");
								s1.nextLine();
							}
							else {
								lookieHere = 6;
							}
						}
					}
					else {
						easyCon = 0;
					}
				}
			}
			else {
				int easyCon = 1;
				while (easyCon == 1) {
					System.out.println();
					System.out.println("Are you sure you want to draft your opponent's team?");
					System.out.println("  1 - Yes");
					System.out.println("  2 - No");
					System.out.println("  3 - Look at players");
					int confirmation = s1.nextInt();
					s1.nextLine();
					//DRAFT YOUR OPP'S TEAM
					//DRAFT YOUR OPP'STEAM
					//DRAFT YOUR OPP'STEAM
					if (confirmation == 1) {
						System.out.println("");
						System.out.println("Which player do you wish to be your opponent's PG?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers2.get(a).getName() + " (" + allPlayers2.get(a).getPosition() + ")	");
							if (!allPlayers2.get(a).getName().equals("Antetokounmpo") && !allPlayers2.get(a).getName().equals("Batman") && !allPlayers2.get(a).getName().equals("Captain America") && !allPlayers2.get(a).getName().equals("Wonder Woman") && !allPlayers2.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers2.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							System.out.println("  " + (a+21) + " - " + allPlayers2.get(a+20).getName() + " (" + allPlayers2.get(a+20).getPosition() + ")");
						}
						int yourPG = s1.nextInt();
						s1.nextLine();
						compRoster.add(allPlayers2.get(yourPG-1));
						compRoster.get(0).setNum(0);
						compRoster.get(0).setPosition("PG");
						System.out.println();
						System.out.println(compRoster.get(0).getName() + " has been drafted as PG");
						allPlayers2.remove(yourPG-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your opponent's SG?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers2.get(a).getName() + " (" + allPlayers2.get(a).getPosition() + ")	");
							if (!allPlayers2.get(a).getName().equals("Antetokounmpo") && !allPlayers2.get(a).getName().equals("Batman") && !allPlayers2.get(a).getName().equals("Captain America") && !allPlayers2.get(a).getName().equals("Wonder Woman") && !allPlayers2.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers2.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 19) {
								System.out.println("  " + (a+21) + " - " + allPlayers2.get(a+20).getName() + " (" + allPlayers2.get(a+20).getPosition() + ")	");
							}
							if (a >= 19) {
								System.out.println();
							}
						}
						int yourSG = s1.nextInt();
						s1.nextLine();
						compRoster.add(allPlayers2.get(yourSG-1));
						compRoster.get(1).setNum(1);
						compRoster.get(1).setPosition("SG");
						System.out.println();
						System.out.println(compRoster.get(1).getName() + " has been drafted as SG");
						allPlayers2.remove(yourSG-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your opponent's SF?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers2.get(a).getName() + " (" + allPlayers2.get(a).getPosition() + ")	");
							if (!allPlayers2.get(a).getName().equals("Antetokounmpo") && !allPlayers2.get(a).getName().equals("Batman") && !allPlayers2.get(a).getName().equals("Captain America") && !allPlayers2.get(a).getName().equals("Wonder Woman") && !allPlayers2.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers2.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 18) {
								System.out.println("  " + (a+21) + " - " + allPlayers2.get(a+20).getName() + " (" + allPlayers2.get(a+20).getPosition() + ")	");
							}
							if (a >= 18) {
								System.out.println();
							}
						}
						int yourSF = s1.nextInt();
						s1.nextLine();
						compRoster.add(allPlayers2.get(yourSF-1));
						compRoster.get(2).setNum(2);
						compRoster.get(2).setPosition("SF");
						System.out.println();
						System.out.println(compRoster.get(2).getName() + " has been drafted as SF");
						allPlayers2.remove(yourSF-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your opponent's PF?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers2.get(a).getName() + " (" + allPlayers2.get(a).getPosition() + ")	");
							if (!allPlayers2.get(a).getName().equals("Antetokounmpo") && !allPlayers2.get(a).getName().equals("Batman") && !allPlayers2.get(a).getName().equals("Captain America") && !allPlayers2.get(a).getName().equals("Wonder Woman") && !allPlayers2.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers2.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 17) {
								System.out.println("  " + (a+21) + " - " + allPlayers2.get(a+20).getName() + " (" + allPlayers2.get(a+20).getPosition() + ")	");
							}
							if (a >= 17) {
								System.out.println();
							}
						}
						int yourPF = s1.nextInt();
						s1.nextLine();
						compRoster.add(allPlayers2.get(yourPF-1));
						compRoster.get(3).setNum(3);
						compRoster.get(3).setPosition("PF");
						System.out.println();
						System.out.println(compRoster.get(3).getName() + " has been drafted as PF");
						allPlayers2.remove(yourPF-1);
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						System.out.println();
						System.out.println("Which player do you wish to be your opponent's C?");
						for (int a = 0; a < 20; a++) {
							System.out.print("  " + (a+1) + " - " + allPlayers2.get(a).getName() + " (" + allPlayers2.get(a).getPosition() + ")	");
							if (!allPlayers2.get(a).getName().equals("Antetokounmpo") && !allPlayers2.get(a).getName().equals("Batman") && !allPlayers2.get(a).getName().equals("Captain America") && !allPlayers2.get(a).getName().equals("Wonder Woman") && !allPlayers2.get(a).getName().equals("Green Lantern")) {
								System.out.print("	");
							}
							if (allPlayers2.get(a).getName().equals("Hulk")) {
								System.out.print("	");
							}
							if (a < 16) {
								System.out.println("  " + (a+21) + " - " + allPlayers2.get(a+20).getName() + " (" + allPlayers2.get(a+20).getPosition() + ")	");
							}
							if (a >= 16) {
								System.out.println();
							}
						}
						int yourC = s1.nextInt();
						s1.nextLine();
						compRoster.add(allPlayers2.get(yourC-1));
						compRoster.get(4).setNum(4);
						compRoster.get(4).setPosition("C");
						System.out.println();
						System.out.println(compRoster.get(4).getName() + " has been drafted as C");
						System.out.println();
						System.out.println("Press Enter to Continue");
						s1.nextLine();
						easyCon = 0;
						oppSelect = 0;
					}
					else if (confirmation == 3) {
						int plPosition = 1;
						while (plPosition == 1) {
							System.out.println();
							System.out.println("Which player position do you want to examine?");
							System.out.println("  1 - PG");
							System.out.println("  2 - SG");
							System.out.println("  3 - SF");
							System.out.println("  4 - PF");
							System.out.println("  5 - C");
							System.out.println("  6 - Back");
							int seePlPos = s1.nextInt();
							s1.nextLine();
							if (seePlPos == 6) {
								plPosition = 0;
							}
							while (seePlPos != 6) {
								if (seePlPos == 1) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlPG);
									allPG.add(easyCompPG);
									allPG.add(plPG);
									allPG.add(compPG);
									allPG.add(hardPlPG);
									allPG.add(hardCompPG);
									allPG.add(allStarPlPG);
									allPG.add(allStarCompPG);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 2) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlSG);
									allPG.add(easyCompSG);
									allPG.add(plSG);
									allPG.add(compSG);
									allPG.add(hardPlSG);
									allPG.add(hardCompSG);
									allPG.add(allStarPlSG);
									allPG.add(allStarCompSG);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 3) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlSF);
									allPG.add(easyCompSF);
									allPG.add(plSF);
									allPG.add(compSF);
									allPG.add(hardPlSF);
									allPG.add(hardCompSF);
									allPG.add(allStarPlSF);
									allPG.add(allStarCompSF);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 4) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlPF);
									allPG.add(easyCompPF);
									allPG.add(plPF);
									allPG.add(compPF);
									allPG.add(hardPlPF);
									allPG.add(hardCompPF);
									allPG.add(allStarPlPF);
									allPG.add(allStarCompPF);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else if (seePlPos == 5) {
									ArrayList <Player> allPG = new ArrayList <Player> ();
									allPG.add(easyPlC);
									allPG.add(easyCompC);
									allPG.add(plC);
									allPG.add(compC);
									allPG.add(hardPlC);
									allPG.add(hardCompC);
									allPG.add(allStarPlC);
									allPG.add(allStarCompC);
									System.out.println();
									System.out.println("Which player do you wish to examine?");
									for (int a = 0; a < 8; a++) {
										System.out.println("  " + (a+1) + " - " + allPG.get(a).getName());
									}
									System.out.println("  9 - Back");
									int getPlPG = s1.nextInt();
									s1.nextLine();
									System.out.println();
									if (getPlPG >= 1 && getPlPG <= 8) {
										System.out.println(allPG.get(getPlPG-1));
										System.out.println();
										System.out.println("Press Enter to Continue");
										s1.nextLine();
									}
									else {
										seePlPos = 6;
									}
								}
								else {
									plPosition = 0;
								}
							}
						}
					}
					else {
						easyCon = 0;
					}
			}
			}
		}
		
		//TACTICS ADJUSTMENTS
		int tacticsAdjust = 1;
		while (tacticsAdjust == 1) {
			System.out.println();
			System.out.println("Offensive Playstyle: " + offTactics.get(plBaseOffTactics));
			System.out.println("Defensive Playstyle: " + defTactics.get(plBaseDefTactics));
			System.out.println();
			
			System.out.println("Do you wish to make any changes?");
			System.out.println("    1 - Yes");
			System.out.println("    2 - No");
			System.out.println("    3 - What are Playstyles?");
			tacticsAdjust = s1.nextInt();
			s1.nextLine();
			
			if (tacticsAdjust == 1) {
				tacticsAdjustment();
			}
			else if (tacticsAdjust == 3) {
				tacticsAdjust = 1;
				playstyleTutorial();
			}
		}
		
		//PLAY TIME
		System.out.println();
		System.out.println("For how many minutes do you wish to play?");
		int playTime = s1.nextInt();
		s1.nextLine();
		playTime *= 10;
		
		//TIP OFF
		System.out.println();
		System.out.println("The players assemble themselves in the middle of");
		System.out.println("the court.");
		System.out.println();
		System.out.println("Who would you like to compete in the tip off?");
		for (int a = 0; a < plRoster.size(); a++) 
			System.out.println("  " + (a+1) + " - " + plRoster.get(a).getName());
		int tipOffMan = s1.nextInt();
		s1.nextLine();
		plPlayer = plRoster.get(tipOffMan-1);
		compPlayer = compRoster.get(4);
		if (compRoster.get(3).getName().equals("Antetokounmpo")) {
			compPlayer = compRoster.get(3);
		}
		System.out.println();
		System.out.println(plPlayer.getName() + " steps up to the middle of the court");
		System.out.println("  1 - Tip Off");
		s1.nextLine();
		int plTip = plPlayer.getAth();
		int compTip = compPlayer.getAth();
		if (plTip >= compTip) {
			System.out.println();
			System.out.println("The referee lobs the ball into the air");
			System.out.println();
			System.out.println(plPlayer.getName() + " gets a hold on the ball before " + compPlayer.getName());
			System.out.println();
			System.out.println("Who would you like to tip the ball to?");
			for (int a = 0; a < plRoster.size(); a++) 
				System.out.println("  " + (a+1) + " - " + plRoster.get(a).getName());
			int tipToMan = s1.nextInt();
			s1.nextLine();
			if (tipToMan == tipOffMan) {
				System.out.println();
				System.out.println(plPlayer.getName() + " grabs onto the ball");
			}
			else {
				System.out.println();
				System.out.println(plPlayer.getName() + " tips the ball to " + plRoster.get(tipToMan-1).getName());
				plPlayer = plRoster.get(tipToMan-1);
			}
			plTactics = plBaseOffTactics;
			compTactics = compBaseDefTactics;
			compPlayer = compRoster.get(tipToMan-1);
			defense = false;
		}
		else {
			System.out.println();
			System.out.println("The referee lobs the ball into the air");
			System.out.println();
			System.out.println(compPlayer.getName() + " grabs the ball before " + plPlayer.getName());
			System.out.println();
			System.out.println(compPlayer.getName() + " tips the ball to " + compRoster.get(0).getName());
			compPlayer = compRoster.get(0);
			plPlayer = plRoster.get(0);
			defense = true;
			plTactics = plBaseDefTactics;
			compTactics = compBaseOffTactics;
		}
		
		System.out.println();
		System.out.println("Press Enter to start");
		s1.nextLine();
		
		
		boolean prevDefense = defense;
		
		
		//GAME STARTS HERE
		//GAME STARTS HERE
		//GAME STARTS HERE
		//GAME STARTS HERE
		//GAME STARTS HERE
		int turnover = 4;
		ballOpen = false;
		for (int a = playTime; a >= 0; a--) {
			//ACTION DECISION
			for (int x = 0; x < playOptions.size(); x++) {
				playOptions.remove(x);
				x--;
			}
			for (int x = 0; x < compOptions.size(); x++) {
				compOptions.remove(x);
				x--;
			}
			
			if (prevDefense != defense) {
				turnover = 4;
				if (defense == false) {
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
				else {
					plTactics = plBaseDefTactics;
					compTactics = compBaseOffTactics;
				}
			}
			if (rebounded == true && defense == prevDefense) {
			}
			
			
			prevDefense = defense;
			rebounded = false;
			
			//DEFENDER
			defender();
			
			System.out.println();
			System.out.println("HOME: " + plPoints + "; AWAY: " + compPoints + "			" + plPlayer.getName());
			
			if (turnover >= a && a != 0) {
				System.out.println("CLOCK: " + a*6 + " seconds" + "			Points: " + plPlayer.getPoints());
				System.out.println("SHOT CLOCK: " + a*6 + " seconds" + "			Assists:" + plPlayer.getAssists());
			}
			else if (a == 0) {
				System.out.println("CLOCK: 2 seconds" + "			Points: " + plPlayer.getPoints());
				System.out.println("SHOT CLOCK: 2 seconds" + "			Assists:" + plPlayer.getAssists());
			}
			else if (turnover >= a) {
				System.out.println("CLOCK: " + (a*6) + " seconds" + "			Points: " + plPlayer.getPoints());
				System.out.println("SHOT CLOCK: " + (a*6) + " seconds" + "			Assists:" + plPlayer.getAssists());
			}
			else if (turnover == -1) {
				System.out.println("CLOCK: " + (a*6) + " seconds" + "			Points: " + plPlayer.getPoints());
				System.out.println("SHOT CLOCK: 0 seconds" + "			Assists:" + plPlayer.getAssists());
			}
			else if (turnover != 0) {
				System.out.println("CLOCK: " + (a*6) + " seconds" + "			Points: " + plPlayer.getPoints());
				System.out.println("SHOT CLOCK: " + turnover*6 + " seconds" + "			Assists:" + plPlayer.getAssists());
			}
			else {
				System.out.println("CLOCK: " + (a*6+2) + " seconds" + "			Points: " + plPlayer.getPoints());
				System.out.println("SHOT CLOCK: 2 seconds" + "			Assists:" + plPlayer.getAssists());
			}

			System.out.println("PL FOULS: " + plFouls + "; COMP FOULS: " + compFouls + "		Blocks: " + plPlayer.getBlocks());
			
			if (defense == false) {
				System.out.println("YOUR PLAYSTYLE: " + offTactics.get(plTactics) + "		Rebounds:" + plPlayer.getRebounds());
				System.out.println("OPPONENT PLAYSTYLE: " + defTactics.get(compTactics) + "		Steals:" + plPlayer.getSteals());
			}
			else {
				System.out.println("YOUR PLAYSTYLE: " + defTactics.get(plTactics) + "		Rebounds:" + plPlayer.getRebounds());
				System.out.println("OPPONENT PLAYSTYLE: " + offTactics.get(compTactics) + "		Steals:" + plPlayer.getSteals());
			}
			
			if (ballOpen == true) {
				playOptions.add("Rebound");
				if (plPlayer.getAth() > 7 && defense == false) {
					playOptions.add("Rebound and Layup");
				}
			}
			else {
				playOptions.add("Change Playstyle");	
				if (defense == false) {
					if (courtPosition == 3) {
						playOptions.add("Drive");
						playOptions.add("Pass");
						playOptions.add("3 Point Shot");
						playOptions.add("Fake");
						playOptions.add("Call Pick & Roll");
						playOptions.add("Alley-Oop");
						playOptions.add("Wait");
						if (turnover <= 0 || a <= 0) {
							playOptions.remove("3 Point Shot");
							playOptions.remove("Alley-Oop");
						}
						if (a <= 0) {
							playOptions.remove("3 Point Shot");
							playOptions.remove("Alley-Oop");
						}
						if (plTactics == 0) {
							playOptions.remove("Call Pick & Roll");
						}
					}
					else if (courtPosition == 2) {
						playOptions.add("Drive");
						playOptions.add("Back Up");
						playOptions.add("Pass");
						playOptions.add("Layup");
						playOptions.add("Dunk");
						playOptions.add("2 Point Shot");
						playOptions.add("Fake");
						playOptions.add("Call Pick & Roll");
						playOptions.add("Alley-Oop");
						playOptions.add("Wait");
						if (turnover <= 0 || a <= 0) {
							playOptions.remove("2 Point Shot");
							playOptions.remove("Alley-Oop");
						}
						if (a <= 0) {
							playOptions.remove("2 Point Shot");
							playOptions.remove("Alley-Oop");
							playOptions.remove("Layup");
						}
						if (plTactics == 0) {
							playOptions.remove("Call Pick & Roll");
						}
					}
					else {
						playOptions.add("Pass");
						playOptions.add("Layup");
						playOptions.add("Dunk");
						playOptions.add("2 Point Shot");
						playOptions.add("Alley-Oop");
						playOptions.add("Back Up");
						if (turnover <= 0 || a <= 0) {
							playOptions.remove("2 Point Shot");
							playOptions.remove("Layup");
							playOptions.remove("Dunk");
							playOptions.remove("Alley-Oop");
						}
					}
					compOptions.add("Change Playstyle");
					compOptions.add("Block");
					compOptions.add("Block");
					compOptions.add("Block");
					compOptions.add("Steal");
					compOptions.add("Block");
					compOptions.add("Steal");
					if (turnover <= 1 || a <= 1) {
						compOptions.remove("Change Playstyle");
						compOptions.remove("Steal");
						compOptions.remove("Steal");
						compOptions.remove("Wait");
					}
					if (turnover <= 0 || a <= 0) {
						playOptions.add("Clutch Shot");
					}
				}
				else {
					playOptions.add("Block");
					playOptions.add("Steal");
					playOptions.add("Wait");
					if (compTactics == 0) {
						playOptions.remove("Switch Defender");
					}
					compOptions.add("Change Playstyle");
					if (turnover <= 2)
						compOptions.remove("Change Playstyle");
					if (compPlayer.getPosition().equals("PG") && turnover >= 2) {
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
					}
					if (courtPosition == 3) {
						compOptions.add("Drive");
						compOptions.add("Drive");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("3 Point Shot");
						compOptions.add("3 Point Shot");
						compOptions.add("3 Point Shot");
						if ((compTactics == 3 || compTactics == 4) && turnover > 0)
							compOptions.add("3 Point Shot");
						compOptions.add("Fake");
						compOptions.add("Fake");
						compOptions.add("Call Pick & Roll");
						compOptions.add("Call Pick & Roll");
						compOptions.add("Alley-Oop");
						if (compTactics == 0) {
							compOptions.remove("Call Pick & Roll");
						}
						if (turnover <= 2 || a <= 2) {
							compOptions.remove("Drive");
							compOptions.remove("Pass");
							compOptions.remove("Fake");
							compOptions.remove("Call Pick & Roll");
						}
						if (turnover <= 1 || a <= 1) {
							compOptions.remove("Pass");
							compOptions.remove("Drive");
							compOptions.remove("3 Point Shot");
							compOptions.remove("Wait");
						}
						if (turnover <= 0 || a <= 0) {
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Fake");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("3 Point Shot");
							compOptions.remove("3 Point Shot");
							compOptions.remove("Alley-Oop");
							compOptions.remove("Call Pick & Roll");
						}
					}
					else if (courtPosition == 2) {
						compOptions.add("Drive");
						compOptions.add("Drive");
						compOptions.add("Back Up");
						compOptions.add("Back Up");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Layup");
						compOptions.add("Layup");
						compOptions.add("Dunk");
						compOptions.add("Dunk");
						compOptions.add("2 Point Shot");
						compOptions.add("2 Point Shot");
						compOptions.add("Fake");
						compOptions.add("Fake");
						compOptions.add("Call Pick & Roll");
						compOptions.add("Call Pick & Roll");
						compOptions.add("Alley-Oop");
						if (compTactics == 0) {
							compOptions.remove("Call Pick & Roll");
						}
						if (turnover <= 2 || a <= 2) {
							compOptions.remove("Fake");
							compOptions.remove("Back Up");
							compOptions.remove("Drive");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Call Pick & Roll");
						}
						if (turnover <= 1 || a <= 1) {
							compOptions.remove("Wait");
							compOptions.remove("Back Up");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
						}
						if (turnover <= 0 || a <= 0) {
							compOptions.remove("Drive");
							compOptions.remove("Fake");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("2 Point Shot");
							compOptions.remove("Alley-Oop");
							compOptions.remove("Layup");
							compOptions.remove("Layup");
							compOptions.remove("Dunk");
							compOptions.remove("Dunk");
							compOptions.remove("Call Pick & Roll");
						}
					}
					else {
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Layup");
						compOptions.add("Layup");
						if ((compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("PG")) && turnover > 0) {
							compOptions.add("Layup");
							compOptions.add("Layup");
							compOptions.add("Layup");
							compOptions.add("Layup");
						}
						compOptions.add("Dunk");
						if ((compPlayer.getPosition().equals("C") || compPlayer.getPosition().equals("PF") || compPlayer.getPosition().equals("SF")) && turnover > 0) {
							compOptions.add("Dunk");
							compOptions.add("Dunk");
							compOptions.add("Dunk");
							compOptions.add("Dunk");
						}
						compOptions.add("2 Point Shot");
						compOptions.add("2 Point Shot");
						compOptions.add("Back Up");
						compOptions.add("Back Up");
						compOptions.add("Back Up");
						if (turnover <= 2 || a <= 2) {
							compOptions.remove("Back Up");
							compOptions.remove("Back Up");
							compOptions.remove("Pass");
						}
						if (turnover <= 1 || a <= 1) {
							compOptions.remove("Pass");
							compOptions.remove("Pass");
						}
						if (turnover <= 0 || a <= 0) {
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Back Up");
							compOptions.remove("2 Point Shot");
							compOptions.remove("2 Point Shot");
							compOptions.remove("Layup");
							compOptions.remove("Layup");
							compOptions.remove("Dunk");
						}
					}
					if (turnover >= 2) {
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
					}
					if (compPlayer.getName().equals("Antetokounmpo")) {
						compOptions.remove("Pass");
						compOptions.remove("Pass");
						compOptions.remove("Pass");
					}
					if (compPlayer.getPosition().equals("PG")) {
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
						compOptions.add("Pass");
					}
					else {
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Change Playstyle");
						compOptions.remove("Steal");
					}
					if (turnover <= 0 || a <= 0) {
						for (int b = 0; b < compOptions.size(); b++) {
							compOptions.remove(b);
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
							compOptions.remove("Pass");
						}
						compOptions.add("Clutch Shot");
					}
				}
			}
			
			System.out.println();
			
			if (defense == false) {
				if (courtPosition == 3) {
					System.out.println(plPlayer.getName() + " is outside the 3pt line");
					System.out.println(compPlayer.getName() + " is guarding " + plPlayer.getName());
				}
				if (courtPosition == 2) {
					System.out.println(plPlayer.getName() + " is inside the perimeter");
					System.out.println(compPlayer.getName() + " is guarding " + plPlayer.getName());
				}
				if (courtPosition == 1) {
					System.out.println(plPlayer.getName() + " is inside the paint");
					System.out.println(compPlayer.getName() + " is guarding " + plPlayer.getName());
				}
			}
			else {
				if (courtPosition == 3) {
					System.out.println(compPlayer.getName() + " is outside the 3pt line");
					System.out.println(plPlayer.getName() + " is guarding " + compPlayer.getName());
				}
				if (courtPosition == 2) {
					System.out.println(compPlayer.getName() + " is inside the perimeter");
					System.out.println(plPlayer.getName() + " is guarding " + compPlayer.getName());
				}
				if (courtPosition == 1) {
					System.out.println(compPlayer.getName() + " is inside the paint");
					System.out.println(plPlayer.getName() + " is guarding " + compPlayer.getName());
				}
			}
			System.out.println();
			if (turnover < 0) {
				System.out.println("SHOT CLOCK VIOLATION");
				System.out.println("The ball is turned over");
				a++;
				turnover = 4;
				turnOver(turnover);
			}
			else {
				System.out.println("What would you like to do?");
				for (int b = 1; b <= playOptions.size(); b++) 
					System.out.println("  " + b + " - " + playOptions.get(b-1));
				int playChoice = s1.nextInt();
				s1.nextLine();
				
				//ACTION ENCONOMY
				//ACTION ENCONOMY
				//ACTION ENCONOMY
				if (playOptions.get(playChoice-1).equals("Rebound")) {
					rebounded = true;
					boolean currPos = false;
					if (defense == false)
						currPos = false;
					else
						currPos = true;
					if (defense == true && compPlayer.getAth() > 7) {
						reboundAndLayup(turnover);
					}
					else {
						rebound(turnover);
					}
					courtPosition = 1;
					if (currPos != defense) {
						resetCourt(turnover);
						turnover = 5;
					}
					else {
					}
				}
				else if (playOptions.get(playChoice-1).equals("Rebound and Layup")) {
					boolean currPos = defense;
					courtPosition = 1;
					reboundAndLayup(turnover);
					if (currPos != defense) {
					}
				}
				else if (playOptions.get(playChoice-1).equals("Change Playstyle")) {
					changeTactics(turnover);
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
						steal = steal(turnover);
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
				}
				else if (playOptions.get(playChoice-1).equals("Drive")) {
					System.out.println(plPlayer.getName() + " drives forward");
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
						steal = steal(turnover);
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (steal == false) {
						drive(turnover);
					}
				}
				else if (playOptions.get(playChoice-1).equals("Back Up")) {
					backUp();
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
						steal = steal(turnover);
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
				}
				else if (playOptions.get(playChoice-1).equals("Pass")) {
					System.out.println(plPlayer.getName() + " starts to pass");
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
						steal = steal(turnover);
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (steal == false) {
						pass(turnover);
					}
				}
				else if (playOptions.get(playChoice-1).equals("3 Point Shot")) {
					System.out.println(plPlayer.getName() + " goes for a 3 pointer");
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
						block = block (turnover);
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (block == false) {
						int plTempPts = plPoints;
						threePtShot(turnover, foul);
						if (plTempPts < plPoints) {
							turnover = 5;
						}
					}
				}
				else if (playOptions.get(playChoice-1).equals("2 Point Shot")) {
					System.out.println(plPlayer.getName() + " goes for a 2 pointer");
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
						block = block (turnover);
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (block == false) {
						int plTempPts = plPoints;
						twoPtShot(turnover, foul);
						if (plTempPts < plPoints) {
							turnover = 5;
						}
					}
				}
				else if (playOptions.get(playChoice-1).equals("Clutch Shot")) {
					System.out.println(plPlayer.getName() + " goes for a clutch shot");
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
						block = block (turnover);
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (block == false) {
						int plTempPts = plPoints;
						clutchShot(turnover, foul);
						if (plTempPts < plPoints) {
							turnover = 5;
						}
					}
				}
				else if (playOptions.get(playChoice-1).equals("Layup")) {
					System.out.println(plPlayer.getName() + " goes for a layup");
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
						block = block (turnover);
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (block == false) {
						int plTempPts = plPoints;
						layup(turnover, foul);
						if (plTempPts < plPoints) {
							turnover = 5;
						}
					}
				}
				else if (playOptions.get(playChoice-1).equals("Dunk")) {
					System.out.println(plPlayer.getName() + " goes for a dunk");
					String compAct = compActions();
					boolean steal = false;
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
						block = block (turnover);
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (block == false) {
						int plTempPts = plPoints;
						dunk(turnover, foul);
						if (plTempPts < plPoints) {
							turnover = 5;
						}
					}
				}
				else if (playOptions.get(playChoice-1).equals("Fake")) {
					System.out.println(plPlayer.getName() + " attempts a fake");
					String compAct = compActions();
					boolean steal = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
						steal(turnover);
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (steal == false) {
						fake ();
					}
				}
				else if (playOptions.get(playChoice-1).equals("Call Pick & Roll")) {
					System.out.println(plPlayer.getName() + " calls for a pick & roll");
					String compAct = compActions();
					boolean steal = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
						steal(turnover);
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (steal == false) {
						callPickAndRoll ();
					}
				}
				else if (playOptions.get(playChoice-1).equals("Alley-Oop")) {
					System.out.println(plPlayer.getName() + " calls for an alley-oop");
					String compAct = compActions();
					boolean block = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
						block = block(turnover);
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
					if (block == false) {
						int plTempPts = plPoints;
						alleyOop(turnover);
						if (plTempPts < plPoints) {
							turnover = 5;
						}
					}
				}
				else if (playOptions.get(playChoice-1).equals("Wait")) {
					System.out.println(plPlayer.getName() + " waits");
					String compAct = compActions();
					boolean steal = false;
					foul = false;
					if (compAct.equals("Steal")) {
						System.out.println(compPlayer.getName() + " reaches for the ball");
						steal = steal(turnover);
					}
					else if (compAct.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics (turnover);
					}
					else if (compAct.equals("Block")) {
						System.out.println(compPlayer.getName() + " prepares for a shot block");
					}
					else if (compAct.equals("Drive")) {
						drive(turnover);
					}
					else if (compAct.equals("Back Up")) {
						backUp();
					}
					else if (compAct.equals("Pass")) {
						System.out.println(compPlayer.getName() + " starts to pass");
						pass(turnover);
					}
					else if (compAct.equals("3 Point Shot")) {
						System.out.println(compPlayer.getName() + " goes for a 3 pointer");
						threePtShot(turnover, foul);
					}
					else if (compAct.equals("2 Point Shot")) {
						System.out.println(compPlayer.getName() + " goes for a 2 pointer");
						twoPtShot(turnover, foul);
					}
					else if (compAct.equals("Clutch Shot")) {
						System.out.println(compPlayer.getName() + " goes for a clutch shot");
						clutchShot(turnover, foul);
					}

					else if (compAct.equals("Layup")) {
						System.out.println(compPlayer.getName() + " goes for a layup");
						layup(turnover, foul);
					}

					else if (compAct.equals("Dunk")) {
						System.out.println(compPlayer.getName() + " goes for a dunk");
						dunk(turnover, foul);
					}
					
					else if (compAct.equals("Alley-Oop")) {
						System.out.println(compPlayer.getName() + " calls for an alley-oop");
						alleyOop(turnover);
					}
					
					else if (compAct.equals("Fake")) {
						System.out.println(compPlayer.getName() + " attempts a fake");
						fake();
					}
					else if (compAct.equals("Call Pick & Roll")) {
						System.out.println(compPlayer.getName() + " calls for a pick & roll");
						callPickAndRoll();
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
				}
				else if (playOptions.get(playChoice-1).equals("Block")) {
					System.out.println();
					System.out.println(plPlayer.getName() + " prepares for a shot block");
					foul = false;
					boolean plBlock = false;
					String compAction = compActions();
					
					if (compAction.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						compChangeTactics(turnover);
					}
					else if (compAction.equals("Drive")) {
						drive(turnover);
					}
					else if (compAction.equals("Back Up")) {
						backUp();
					}
					else if (compAction.equals("Pass")) {
						System.out.println(compPlayer.getName() + " starts to pass");
						pass(turnover);
					}
					else if (compAction.equals("3 Point Shot")) {
						System.out.println(compPlayer.getName() + " goes for a 3 pointer");
						plBlock = block (turnover);
						if (plBlock == false) {
							threePtShot(turnover, foul);
						}
					}
					else if (compAction.equals("2 Point Shot")) {
						System.out.println(compPlayer.getName() + " goes for a 2 pointer");
						plBlock = block (turnover);
						if (plBlock == false) {
							twoPtShot(turnover, foul);
						}
					}
					else if (compAction.equals("Clutch Shot")) {
						System.out.println(compPlayer.getName() + " goes for a clutch shot");
						plBlock = block (turnover);
						if (plBlock == false) {
							clutchShot(turnover, foul);
						}
					}

					else if (compAction.equals("Layup")) {
						System.out.println(compPlayer.getName() + " goes for a layup");
						plBlock = block (turnover);
						if (plBlock == false) {
							layup(turnover, foul);
						}
					}

					else if (compAction.equals("Dunk")) {
						System.out.println(compPlayer.getName() + " goes for a dunk");
						plBlock = block (turnover);
						if (plBlock == false) {
							dunk(turnover, foul);
						}
					}
					
					else if (compAction.equals("Alley-Oop")) {
						System.out.println(compPlayer.getName() + " calls for an alley-oop");
						plBlock = block (turnover);
						if (plBlock == false) {
							alleyOop(turnover);
						}
					}
					
					else if (compAction.equals("Fake")) {
						System.out.println(compPlayer.getName() + " attempts a fake");
						fake();
					}
					else if (compAction.equals("Call Pick & Roll")) {
						System.out.println(compPlayer.getName() + " calls for a pick & roll");
						callPickAndRoll();
					}
					else {
						System.out.println(compPlayer.getName() + " waits");
					}
				}
				else if (playOptions.get(playChoice-1).equals("Steal")) {
					System.out.println();
					System.out.println(plPlayer.getName() + " reaches for the ball");
					foul = false;
					boolean plSteal = false;
					String compAction = compActions();
					
					if (compAction.equals("Change Playstyle")) {
						System.out.println(compPlayer.getName() + " signals for a playstyle change");
						plSteal = steal (turnover);
						if (plSteal == false) {
							compChangeTactics(turnover);
						}
					}
					else if (compAction.equals("Drive")) {
						System.out.println(compPlayer.getName() + " drives forward");
						plSteal = steal (turnover);
						if (plSteal == false) {
							System.out.println();
							drive(turnover);
						}
					}
					else if (compAction.equals("Back Up")) {
						System.out.println(compPlayer.getName() + " steps away");
						plSteal = steal (turnover);
						if (plSteal == false) {
							backUp();
						}
					}
					else if (compAction.equals("Pass")) {
						System.out.println(compPlayer.getName() + " starts to pass");
						plSteal = steal (turnover);
						if (plSteal == false) {
							pass(turnover);
						}
					}
					else if (compAction.equals("3 Point Shot")) {
						System.out.println(compPlayer.getName() + " goes for a 3 pointer");
						threePtShot(turnover, foul);
					}
					else if (compAction.equals("2 Point Shot")) {
						System.out.println(compPlayer.getName() + " goes for a 2 pointer");
						twoPtShot(turnover, foul);
					}
					else if (compAction.equals("Clutch Shot")) {
						System.out.println(compPlayer.getName() + " goes for a clutch shot");
						clutchShot(turnover, foul);
					}

					else if (compAction.equals("Layup")) {
						System.out.println(compPlayer.getName() + " goes for a layup");
						layup(turnover, foul);
					}

					else if (compAction.equals("Dunk")) {
						System.out.println(compPlayer.getName() + " goes for a dunk");
						dunk(turnover, foul);
					}
					else if (compAction.equals("Fake")) {
						System.out.println(compPlayer.getName() + " attempts a fake");
						plSteal = steal (turnover);
						if (plSteal == false) {
							fake();
						}
					}
					else if (compAction.equals("Call Pick & Roll")) {
						System.out.println(compPlayer.getName() + " calls for a pick & roll");
						plSteal = steal (turnover);
						if (plSteal == false) {
							callPickAndRoll();
						}
					}
					
					else if (compAction.equals("Alley-Oop")) {
						System.out.println(compPlayer.getName() + " calls for an alley-oop");
						plSteal = steal (turnover);
						if (plSteal == false) {
							alleyOop(turnover);
						}
					}
					
					else {
						System.out.println(compPlayer.getName() + " waits");
						plSteal = steal (turnover);
					}
				}
				else {
					System.out.println(plPlayer.getName() + " waits.");
				}
				if (ballOpen == false) {
					turnover--;
				}
				if (turnover < 0) {
					a++;
				}
			}
			//FOULS
			if (foul == true) {
				if (currPlFouls < plFouls) {
					currPlFouls++;
					System.out.println();
					defense = true;
					courtPosition = 3;
					if (currPlFouls < 5) {
						defense = true;
						if (prevCompPoints < compPoints) {
							System.out.println("The referee calls a foul on " + plPlayer.getName());
							System.out.println();
							System.out.println(compPlayer.getName() + " gets an and-one");
							freeThrow (1, turnover);
						}
						else {
							System.out.println("The referee calls a foul on " + plPlayer.getName());
							System.out.println();
							System.out.println("The referee gives the ball to " + compPlayer.getName());
							pass(turnover);
						}
					}
					else if (currPlFouls >= 5) {
						System.out.println("The referee calls a foul on " + plPlayer.getName());
						System.out.println();
						System.out.println("You have reached 5 or more team fouls");
						defense = true;
						plTactics = plBaseDefTactics;
						compTactics = compBaseOffTactics;
						turnover = 5;
						currPlFouls--;
						freeThrow(2, turnover);
					}
				}
				else if (currPlFouls < plFouls) {
					currPlFouls++;
					System.out.println();
					defense = true;
					if (currPlFouls < 5) {
						defense = true;
						if (prevCompPoints < compPoints) {
							System.out.println("The referee calls a foul on " + plPlayer.getName());
							System.out.println();
							System.out.println(compPlayer.getName() + " gets an and-one");
							freeThrow (1, turnover);
						}
						else {
							System.out.println("The referee calls a foul on " + plPlayer.getName());
							System.out.println();
							System.out.println("The referee gives the ball to " + compPlayer.getName());
							pass(turnover);
						}
					}
					else if (currPlFouls >= 5) {
						System.out.println();
						System.out.println("You have reached 5 or more team fouls");
						defense = true;
						plTactics = plBaseDefTactics;
						compTactics = compBaseOffTactics;
						turnover = 5;
						currPlFouls--;
						if (prevCompPoints < compPoints) {
							System.out.println();
							System.out.println(compPlayer.getName() + " gets an and-one");
							freeThrow (1, turnover);
						}
						else {
							System.out.println();
							freeThrow(2, turnover);
						}
					}
				}
				else if (currCompFouls < compFouls) {
					currCompFouls++;
					defense = false;
					System.out.println();
					System.out.println("The referee calls a foul on " + compPlayer.getName());
					if (currCompFouls < 5) {
						defense = false;
						if (prevPlPoints < plPoints) {
							System.out.println();
							System.out.println(plPlayer.getName() + " gets an and-one");
							freeThrow (1, turnover);
						}
						else {
							System.out.println();
							System.out.println("The referee gives the ball to " + plPlayer.getName());
							pass(turnover);
						}
					}
					else if (currCompFouls >= 5) {
						System.out.println();
						System.out.println("Your opponent have reached 5 or more team fouls");
						defense = false;
						plTactics = plBaseDefTactics;
						compTactics = compBaseOffTactics;
						turnover = 5;
						currCompFouls--;
						if (prevPlPoints < plPoints) {
							System.out.println();
							System.out.println(plPlayer.getName() + " gets an and-one");
							freeThrow (1, turnover);
						}
						else {
							System.out.println();
							freeThrow(2, turnover);
						}
					}
				}
				else if (currCompFouls < compFouls) {
					currCompFouls++;
					defense = false;
					System.out.println();
					System.out.println("The referee calls a foul on " + compPlayer.getName());
					if (currCompFouls < 5) {
						defense = false;
						System.out.println();
						System.out.println("The referee gives the ball to " + plPlayer.getName());
						pass(turnover);
					}
					else if (currCompFouls >= 5) {
						System.out.println();
						System.out.println("Your opponent has reached 5 or more team fouls");
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
						turnover = 5;
						currCompFouls--;
						if (prevPlPoints < plPoints) {
							System.out.println();
							System.out.println(plPlayer.getName() + " gets an and-one");
							freeThrow (1, turnover);
						}
						else {
							System.out.println();
							freeThrow(2, turnover);
						}
					}
				}
			}
			pickAndRoll--;
			fake--;
			pass--;
			compFake--;
			compPickAndRoll--;
			compPass--;
			prevPlPoints = plPoints;
			prevCompPoints = compPoints;
			currPlFouls = plFouls;
			currCompFouls = compFouls;
			foul = false;
			System.out.println();
			System.out.println("Press Enter to Continue");
			s1.nextLine();
			if (a <= 0 && plPoints == compPoints) {
				a += 20;
				System.out.println();
				System.out.println("!!!!!!!!!!!!!!!!!! OVERTIME !!!!!!!!!!!!!!!!!!");
			}
		}
		System.out.println();
		System.out.println("----------------- GAME OVER -----------------");
		System.out.println("FINAL SCORE:");
		System.out.println("HOME: " + plPoints);
		System.out.println("AWAY: " + compPoints);
		System.out.println();
		
		double mvpScore = 0;
		Player mvp = plRoster.get(0);
		for (int a = 0; a < 5; a++) {
			double temp = 0;
			temp += plRoster.get(a).getPoints()/2.0;
			temp += plRoster.get(a).getBlocks();
			temp += plRoster.get(a).getAssists();
			temp += plRoster.get(a).getSteals();
			temp += plRoster.get(a).getRebounds();
			if (temp > mvpScore) {
				mvpScore = temp;
				mvp = plRoster.get(a);
			}
		}
		for (int a = 0; a < 5; a++) {
			double temp = 0;
			temp += compRoster.get(a).getPoints()/2.0;
			temp += compRoster.get(a).getBlocks();
			temp += compRoster.get(a).getAssists();
			temp += compRoster.get(a).getSteals();
			temp += compRoster.get(a).getRebounds();
			if (temp > mvpScore) {
				mvpScore = temp;
				mvp = compRoster.get(a);
			}
		}
		
		if (plPoints > compPoints) {
			System.out.println("!!!!!!!!!!!!!!!!!! YOU WIN !!!!!!!!!!!!!!!!!!");
		}
		else {
			System.out.println("                  YOU LOST");
			System.out.println("             BETTER LUCK NEXT TIME");
		}
		System.out.println();
		System.out.println("Press Enter to Continue");
		s1.nextLine();
		System.out.println();
		System.out.println("The MVP of the Game is.....");
		System.out.println();
		System.out.println("Press Enter to Continue");
		s1.nextLine();
		System.out.println();
		System.out.println(mvp.getName());
		System.out.println("Points: " + mvp.getPoints());
		System.out.println("Rebounds: " + mvp.getRebounds());
		System.out.println("Steals: " + mvp.getSteals());
		System.out.println("Assists: " + mvp.getAssists());
		System.out.println("Blocks: " + mvp.getBlocks());
		System.out.println();
		System.out.println("Press Enter to Continue");
		s1.nextLine();
		System.out.println();
		System.out.println("Team Statistics:");
		for (Player temp : plRoster) {
			System.out.println();
			System.out.println(temp.getName() + " (" + temp.getPosition() + ")");
			System.out.println("Points: " + temp.getPoints());
			System.out.println("Rebounds: " + temp.getRebounds());
			System.out.println("Steals: " + temp.getSteals());
			System.out.println("Assists: " + temp.getAssists());
			System.out.println("Blocks: " + temp.getBlocks());
		}
		System.out.println();
		System.out.println("Press Enter to Continue");
		s1.nextLine();
		System.out.println();
		System.out.println("Opponent Statistics:");
		for (Player temp : compRoster) {
			System.out.println();
			System.out.println(temp.getName() + " (" + temp.getPosition() + ")");
			System.out.println("Points: " + temp.getPoints());
			System.out.println("Rebounds: " + temp.getRebounds());
			System.out.println("Steals: " + temp.getSteals());
			System.out.println("Assists: " + temp.getAssists());
			System.out.println("Blocks: " + temp.getBlocks());
		}
	}
	
	public static int prevPlPoints = 0;
	public static int prevCompPoints = 0;
	
	//RESET COURT
	public static void resetCourt (int turnover) {
		courtPosition = 3;
		turnover = 4;
		plPlayer = plRoster.get(0);
		compPlayer = compRoster.get(0);
		if (defense == false) {
			plTactics = plBaseOffTactics;
			compTactics = compBaseDefTactics;
		}
		else {
			plTactics = plBaseDefTactics;
			compTactics = compBaseOffTactics;
		}
	}
	
	//COMPUTER ACTIONS
	//COMPUTER ACTIONS
	//COMPUTER ACTIONS
	//COMPUTER ACTIONS
	//COMPUTER ACTIONS
	public static String compActions () {
		int compChoice = (int) (Math.random()*compOptions.size());
		System.out.println();
		return compOptions.get(compChoice);
		
	}
	
	//PL CHANGE PLAYSTYLE
	//PL CHANGE PLAYSTYLE
	//PL CHANGE PLAYSTYLE
	//PL CHANGE PLAYSTYLE
	//PL CHANGE PLAYSTYLE
	public static void changeTactics (int turnover) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("What playstyle would you like change to?");
		if (defense == false) {
			for (int a = 1; a <= offTactics.size(); a++) 
				System.out.println("  " + (a) + " - " + offTactics.get(a-1));
		}
		else {
			for (int a = 1; a <= defTactics.size(); a++) 
				System.out.println("  " + (a) + " - " + defTactics.get(a-1));
		}
		
		int newTactic = s1.nextInt() - 1;
		s1.nextLine();
		System.out.println();
		
		if (defense == false) {
			System.out.println(offTactics.get(plBaseOffTactics) + " has been changed to " + offTactics.get(newTactic));
			plBaseOffTactics = newTactic;
			plTactics = newTactic;
		}
		else {
			System.out.println(defTactics.get(plBaseDefTactics) + " has been changed to " + defTactics.get(newTactic));
			plBaseDefTactics = newTactic;
			plTactics = newTactic;
		}
	}
	
	//COMP CHANGE PLAYSTYLE
	//COMP CHANGE PLAYSTYLE
	//COMP CHANGE PLAYSTYLE
	//COMP CHANGE PLAYSTYLE
	//COMP CHANGE PLAYSTYLE
	public static void compChangeTactics (int turnover) {
		System.out.println();
		if (defense == false) {
			if (plTactics == 1) {
				int newTactic = (int) (Math.random()*2);
				if (newTactic == 0) {
					compBaseDefTactics = 2;
					compTactics = 2;
				}
				else {
					compBaseDefTactics = 3;
					compTactics = 3;
				}
			}
			else if (plTactics == 2) {
				int newTactic = (int) (Math.random()*4);
				if (newTactic == 0) {
					compBaseDefTactics = 0;
					compTactics = 0;
				}
				else if (newTactic == 1) {
					compBaseDefTactics = 1;
					compTactics = 1;
				}
				else if (newTactic == 2) {
					compBaseDefTactics = 2;
					compTactics = 2;
				}
				else {
					compBaseDefTactics = 3;
					compTactics = 3;
				}
			}
			else if (plTactics == 3) {
				int newTactic = (int) (Math.random()*4);
				if (newTactic == 0) {
					compBaseDefTactics = 0;
					compTactics = 0;
				}
				else if (newTactic == 1) {
					compBaseDefTactics = 1;
					compTactics = 1;
				}
				else if (newTactic == 2) {
					compBaseDefTactics = 2;
					compTactics = 2;
				}
				else {
					compBaseDefTactics = 4;
					compTactics = 4;
				}
			}
			else if (plTactics == 4) {
				int newTactic = (int) (Math.random()*3);
				if (newTactic == 0) {
					compBaseDefTactics = 0;
					compTactics = 0;
				}
				else if (newTactic == 1) {
					compBaseDefTactics = 1;
					compTactics = 1;
				}
				else {
					compBaseDefTactics = 4;
					compTactics = 4;
				}
			}
		}
		else {
			if (plTactics == 0) {
				int newTactic = (int) (Math.random()*5);
				compBaseOffTactics = newTactic;
				compTactics = newTactic;
			}
			else if (plTactics == 1) {
				int newTactic = (int) (Math.random()*4);
				compBaseOffTactics = newTactic;
				compTactics = newTactic;
			}
			else if (plTactics == 2) {
				int newTactic = (int) (Math.random()*4 + 1);
				compBaseOffTactics = newTactic;
				compTactics = newTactic;
			}
			else if (plTactics == 3) {
				int newTactic = (int) (Math.random()*2 + 3);
				compBaseOffTactics = newTactic;
				compTactics = newTactic;
			}
			else {
				int newTactic = (int) (Math.random()*4);
				compBaseOffTactics = newTactic;
				compTactics = newTactic;
			}
			
		}
		System.out.println("The opponent has switched a playstyle");
	}
	
	//REBOUND
	//REBOUND
	//REBOUND
	//REBOUND
	//REBOUND
	public static void rebound (int turnover) {
		int plRebound = 0;
		int compRebound = 0;
		
		rebounded = true;
		
		plPlayer = plRoster.get((int) (Math.random()*5));
		compPlayer = compRoster.get((int) (Math.random()*5));
		
		if (plPlayer.getPosition().equals("C"))
			plRebound = plPlayer.getAth() + 1;
		else 
			plRebound = plPlayer.getAth();
		if (compPlayer.getPosition().equals("C"))
			compRebound = compPlayer.getAth() + 1;
		else 
			compRebound = compPlayer.getAth();
		
		courtPosition = 1;
		
		if (plTactics == 2 && defense == true)
			plRebound -= 2;
		if (plTactics == 4 && defense == true)
			plRebound -= 1;
		if (plTactics == 4 && defense == false)
			plRebound -= 2;
		if (plTactics == 3 && defense == false)
			plRebound -= 1;
		
		if (compTactics == 2 && defense == false)
			compRebound -= 2;
		if (compTactics == 4 && defense == false)
			compRebound -= 1;
		if (compTactics == 4 && defense == true)
			compRebound -= 2;
		if (compTactics == 3 && defense == true)
			compRebound -= 1;
		
		System.out.println();
		if (defense == true) {
			if (plRebound >= compRebound) {
				plPlayer.addRebound();
				System.out.println(plPlayer.getName() + " gets a hold on the ball before " + compPlayer.getName());
				defense = false;
				turnover = 4;
				plTactics = plBaseOffTactics;
				compTactics = compBaseDefTactics;
				courtPosition = 3;
			}
			else {
				compPlayer.addRebound();
				System.out.println(compPlayer.getName() + " grabs the ball before " + plPlayer.getName());
				courtPosition = 1;
			}
		}
		else {
			if (plRebound > compRebound) {
				plPlayer.addRebound();
				System.out.println(plPlayer.getName() + " gets a hold on the ball before " + compPlayer.getName());
				courtPosition = 1;
			}
			else {
				compPlayer.addRebound();
				System.out.println(compPlayer.getName() + " grabs the ball before " + plPlayer.getName());
				System.out.println();
				defense = true;
				turnover = 4;
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
				courtPosition = 3;
			}
		}
		ballOpen = false;
	}
	
	//REBOUND & LAYUP
	//REBOUND & LAYUP
	//REBOUND & LAYUP
	//REBOUND & LAYUP
	//REBOUND & LAYUP
	public static void reboundAndLayup (int turnover) {
		int plRebound = 0;
		int compRebound = 0;
		
		rebounded = true;
		
		plPlayer = plRoster.get((int) (Math.random()*5));
		compPlayer = compRoster.get((int) (Math.random()*5));
		
		if (plPlayer.getPosition().equals("C"))
			plRebound = plPlayer.getAth() + 1;
		else 
			plRebound = plPlayer.getAth();
		if (compPlayer.getPosition().equals("C"))
			compRebound = compPlayer.getAth() + 1;
		else 
			compRebound = compPlayer.getAth();
		
		courtPosition = 1;
		
		if (plTactics == 2 && defense == true)
			plRebound -= 2;
		if (plTactics == 4 && defense == true)
			plRebound -= 1;
		if (plTactics == 4 && defense == false)
			plRebound -= 2;
		if (plTactics == 3 && defense == false)
			plRebound -= 1;
		
		if (compTactics == 2 && defense == false)
			compRebound -= 2;
		if (compTactics == 4 && defense == false)
			compRebound -= 1;
		if (compTactics == 4 && defense == true)
			compRebound -= 2;
		if (compTactics == 3 && defense == true)
			compRebound -= 1;
		
		System.out.println();
		if (defense == true) {
			if (plRebound >= compRebound) {
				plPlayer.addRebound();
				System.out.println(plPlayer.getName() + " gets a hold on the ball before " + compPlayer.getName());
				System.out.println();
				defense = false;
				turnover = 4;
				plTactics = plBaseOffTactics;
				compTactics = compBaseDefTactics;
				courtPosition = 3;
			}
			else {
				compPlayer.addRebound();
				System.out.println(compPlayer.getName() + " grabs the ball before " + plPlayer.getName());
				courtPosition = 1;
				if (compPlayer.getAth() >= plPlayer.getAth()) {
					if (compPlayer.getAth() > 7) {
						System.out.println();
						System.out.println(compPlayer.getName() + " jumps up again and slams the ball into the basket");
					}
					else {
						System.out.println();
						System.out.println(compPlayer.getName() + " twists and hooks the ball into the basket");
					}
					defense = false;
					turnover = 4;
					compPoints += 2;
					compPlayer.addPoints(2);
					plTactics = plBaseOffTactics;
					courtPosition = 3;
					compTactics = compBaseDefTactics;
					if (compRebound - plRebound > 15) {
						foul = true;
						defense = true;
						plTactics = plBaseDefTactics;
						compTactics = compBaseOffTactics;
						plFouls++;
					}
				}
				else {
					plPlayer.addBlock();
					System.out.println();
					System.out.println(compPlayer.getName() + " attempts to put the ball into the basket, but is rejected by " + plPlayer.getName());
					grabBall(turnover);
				}
			}
		}
		else {
			if (plRebound > compRebound) {
				plPlayer.addRebound();
				System.out.println(plPlayer.getName() + " gets a hold on the ball before " + compPlayer.getName());
				System.out.println();
				courtPosition = 1;
				if (plPlayer.getAth() >= compPlayer.getAth()) {
					if (plPlayer.getAth() > 7) {
						System.out.println(plPlayer.getName() + " jumps up again and slams the ball into the basket");
					}
					else {
						System.out.println(plPlayer.getName() + " twists and hooks the ball into the basket");
					}
					defense = true;
					turnover = 4;
					courtPosition = 3;
					plPlayer.addPoints(2);
					plPoints += 2;
					courtPosition = 3;
					plTactics = plBaseDefTactics;
					compTactics = compBaseOffTactics;
					if (plRebound - compRebound > 15) {
						foul = true;
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
						compFouls++;
					}
				}
				else {
					compPlayer.addBlock();
					System.out.println(plPlayer.getName() + " attempts to put the ball into the basket, but is rejected by " + compPlayer.getName());
					grabBall(turnover);
				}
			}
			else {
				compPlayer.addRebound();
				System.out.println(compPlayer.getName() + " grabs the ball before " + plPlayer.getName());
				System.out.println();
				defense = true;
				turnover = 4;
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
				courtPosition = 3;
			}
		}
		ballOpen = false;
	}
	
	//DRIVE
	//DRIVE
	//DRIVE
	//DRIVE
	//DRIVE
	public static void drive (int turnover) {
		int plStat = 0;
		int plAth = 0;
		int compStat = 0;
		int compAth = 0;
		if (plPlayer.getPosition().equals("PG") || plPlayer.getPosition().equals("SG")) {
			plStat = plPlayer.getAgl();
			plAth = plPlayer.getAth();
		}
		else {
			plStat = plPlayer.getAth();
			plAth = plPlayer.getAthAdv();
		}
		if (compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("SG")) {
			compStat = compPlayer.getAgl();
			compAth = compPlayer.getAth();
		}
		else {
			compStat = compPlayer.getAth();
			compAth = compPlayer.getAthAdv();
		}
		
		if (plTactics == 4 && courtPosition == 3 && defense == true) 
			plAth++;
		if (compTactics == 4 && courtPosition == 3 && defense == false) 
			compAth++;
		
		if (fake == 1) {
			compStat -= 2;
			compAth -= 2;
		}
		
		if (compFake == 1) {
			plStat -= 2;
			plAth -= 2;
		}
		
		if (pickAndRoll == 1) {
			compStat -= 2;
			compAth -= 2;
		}
		
		if (compPickAndRoll == 1) {
			plStat -= 2;
			plAth -= 2;
		}
		
		if (defense == true) {
			if (courtPosition == 3) {
				if (plTactics == 1 || plTactics == 2 || plTactics == 4) {
					if (compStat >= plAth) {
						courtPosition--;
						System.out.println(compPlayer.getName() + " drives past " + plPlayer.getName() + " into the perimeter");
						if (plAth - compStat > 15) {
							foul = true;
							compFouls++;
						}
					}
					else {
						System.out.println(compPlayer.getName() + " tries to drive, but " + plPlayer.getName() + " pushes them back");
						if (plAth - compStat > 15) {
							foul = true;
							compFouls++;
						}
					}
				}
				else {
					courtPosition--;
					System.out.println(compPlayer.getName() + " drives past " + plPlayer.getName() + " into the perimeter");
				}
			}
			else {
				if (plTactics == 1 || plTactics == 2 || plTactics == 4) {
					if (compStat >= plAth) {
						courtPosition--;
						System.out.println(compPlayer.getName() + " drives past " + plPlayer.getName() + " into the paint");
						if (plAth - compStat > 15) {
							foul = true;
							compFouls++;
						}
					}
					else {
						System.out.println(compPlayer.getName() + " tries to drive, but " + plPlayer.getName() + " pushes them back");
						if (plAth - compStat > 15) {
							foul = true;
							compFouls++;
						}
					}
				}
				else {
					courtPosition--;
					System.out.println(compPlayer.getName() + " drives past " + plPlayer.getName() + " into the paint");
				}
			}
		}
		else {
			if (courtPosition == 3) {
				if (compTactics == 1 || compTactics == 2 || compTactics == 4) {
					if (plStat >= compAth) {
						courtPosition--;
						System.out.println();
						System.out.println(plPlayer.getName() + " drives past " + compPlayer.getName() + " into the perimeter");
						if (compAth - plStat > 15) {
							foul = true;
							plFouls++;
						}
					}
					else {
						System.out.println();
						System.out.println(plPlayer.getName() + " tries to drive, but " + compPlayer.getName() + " pushes them back");
						if (compAth - plStat > 15) {
							foul = true;
							plFouls++;
						}
					}
				}
				else {
					courtPosition--;
					System.out.println();
					System.out.println(plPlayer.getName() + " drives past " + compPlayer.getName() + " into the perimeter");
				}
			}
			else {
				if (compTactics == 1 || compTactics == 2 || compTactics == 4) {
					if (plStat >= compAth) {
						courtPosition--;
						System.out.println();
						System.out.println(plPlayer.getName() + " drives past " + compPlayer.getName() + " into the paint");
						if (compAth - plStat > 15) {
							foul = true;
							plFouls++;
						}
					}
					else {
						System.out.println();
						System.out.println(plPlayer.getName() + " tries to drive, but " + compPlayer.getName() + " pushes them back");
						if (compAth - plStat > 15) {
							foul = true;
							plFouls++;
						}
					}
				}
				else {
					courtPosition--;
					System.out.println();
					System.out.println(plPlayer.getName() + " drives past " + compPlayer.getName() + " into the paint");
				}
			}
		}
	}
	
	//BACK UP
	//BACK UP
	//BACK UP
	//BACK UP
	//BACK UP
	public static void backUp () {
		if (defense == false) {
			System.out.println();
			courtPosition++;
			System.out.println(plPlayer.getName() + " backs up");
		}
		else {
			courtPosition++;
			System.out.println();
			System.out.println(compPlayer.getName() + " backs up");
		}
	}
	
	//PASS
	//PASS
	//PASS
	//PASS
	//PASS
	public static void pass (int turnover) {
		Scanner s1 = new Scanner(System.in);
		
		if (defense == false) {
			System.out.println();
			
			pass = 2;
			passer = plPlayer.getNum();
			
			System.out.println("Who would you like to pass to?");
			ArrayList <Player> passingPPL = new ArrayList <Player> ();
			for (int a = 0; a < plRoster.size(); a++) {
				passingPPL.add(plRoster.get(a));
			}
			for (int a = 0; a < passingPPL.size(); a++) {
				if (passingPPL.get(a).getPosition().equals(plPlayer.getPosition()))
					passingPPL.remove(a);
			}
			for (int a = 1; a <= passingPPL.size(); a++) 
				System.out.println("  " + a + " - " + passingPPL.get(a-1).getName());
			int passReceiver = s1.nextInt();
			s1.nextLine();
			System.out.println();
			System.out.println(plPlayer.getName() + " passes the ball to " + passingPPL.get(passReceiver-1).getName());
			plPlayer = passingPPL.get(passReceiver-1);
			
			if (plPlayer.getPosition().equals("PG") || plPlayer.getPosition().equals("SG")) {
				courtPosition = 3;
				if (compTactics == 0) {
					int PorSG = (int) (Math.random()*2);
					if (PorSG == 0)
						compPlayer = compRoster.get(0);
					else
						compPlayer = compRoster.get(1);
				}
			}
			else if (plPlayer.getPosition().equals("SF")) {
				if (plTactics == 1) {
					courtPosition = 2;
				}
				else {
					courtPosition = 3;
				}
				if (compTactics == 0) {
					compPlayer = compRoster.get(2);
				}
			}
			else if (plPlayer.getPosition().equals("PF")) {
				if (plTactics == 1) {
					courtPosition = 1;
				}
				else if (plTactics == 2 || plTactics == 0) {
					courtPosition = 2;
				}
				else {
					courtPosition = 3;
				}
				if (compTactics == 0) {
					compPlayer = compRoster.get(3);
				}
			}
			else {
				if (plTactics == 1 || plTactics == 0) {
					courtPosition = 1;
				}
				else if (plTactics == 4) {
					courtPosition = 3;
				}
				else {
					courtPosition = 2;
				}
				if (compTactics == 0) {
					compPlayer = compRoster.get(4);
				}
			}
		}
		else {
			
			compPass = 2;
			passer = plPlayer.getNum();
			
			ArrayList <Player> passingPPL = new ArrayList <Player> ();
			for (int a = 0; a < compRoster.size(); a++) {
				passingPPL.add(compRoster.get(a));
			}
			for (int a = 0; a < passingPPL.size(); a++) {
				if (passingPPL.get(a).getPosition().equals(compPlayer.getPosition()))
					passingPPL.remove(a);
			}
			int passReceiver = (int) (Math.random()*4);
			System.out.println();
			System.out.println(compPlayer.getName() + " passes the ball to " + passingPPL.get(passReceiver).getName());
			compPlayer = passingPPL.get(passReceiver);
			if (compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("SG")) {
				courtPosition = 3;
				if (plTactics == 0) {
					int PorSG = (int) (Math.random()*2);
					if (PorSG == 0)
						plPlayer = plRoster.get(0);
					else
						plPlayer = plRoster.get(1);
				}
			}
			else if (compPlayer.getPosition().equals("SF")) {
				if (compTactics == 1) {
					courtPosition = 2;
				}
				else {
					courtPosition = 3;
				}
				if (plTactics == 0) {
					plPlayer = plRoster.get(2);
				}
			}
			else if (compPlayer.getPosition().equals("PF")) {
				if (compTactics == 1) {
					courtPosition = 1;
				}
				else if (compTactics == 2 || compTactics == 0) {
					courtPosition = 2;
				}
				else {
					courtPosition = 3;
				}
				if (plTactics == 0) {
					plPlayer = plRoster.get(3);
				}
			}
			else {
				if (compTactics == 1 || compTactics == 0) {
					courtPosition = 1;
				}
				else if (compTactics == 4) {
					courtPosition = 3;
				}
				else {
					courtPosition = 2;
				}
				if (plTactics == 0) {
					plPlayer = plRoster.get(4);
				}
			}
		}
	}
	
	//3PT SHOT
	//3PT SHOT
	//3PT SHOT
	//3PT SHOT
	//3PT SHOT
	public static void threePtShot (int turnover, boolean foul) {
		System.out.println();
		
		if (defense == false) {
			int plAcc = 0;
			if (plPlayer.getPosition().equals("SG")) {
				plAcc = plPlayer.getAcc() + 1;
			}
			else {
				plAcc = plPlayer.getAcc();
			}
			
			if (plAcc >= 10) {
				plPlayer.addPoints(3);
				plPoints += 3;
				if (pass == 1) {
					plRoster.get(passer).addAssist();
				}
				System.out.println(plPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball swishes through the net");
				turnOver(turnover);
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
				if (foul == true) {
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
			else {
				System.out.println(plPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball bounces off the rim");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
		}
		else {
			int compAcc = 0;
			if (compPlayer.getPosition().equals("SG")) {
				compAcc = plPlayer.getAcc() + 1;
			}
			else {
				compAcc = plPlayer.getAcc();
			}
			
			if (compAcc >= 10) {
				compPlayer.addPoints(3);
				compPoints += 3;
				if (compPass == 1) {
					compRoster.get(passer).addAssist();
				}
				System.out.println(compPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball swishes through the net");
				turnOver(turnover);
				compTactics = compBaseDefTactics;
				plTactics = plBaseOffTactics;
				if (foul == true) {
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
			else {
				System.out.println(compPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball bounces off the rim");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
		}
	}
	
	//2PT SHOT
	//2PT SHOT
	//2PT SHOT
	//2PT SHOT
	//2PT SHOT
	public static void twoPtShot (int turnover, boolean foul) {
		System.out.println();
		
		if (defense == false) {
			int plAcc = 0;
			if (plPlayer.getPosition().equals("SF")) {
				plAcc = plPlayer.getAcc() + 1;
			}
			else {
				plAcc = plPlayer.getAcc();
			}
			
			if (plAcc >= 6) {
				plPlayer.addPoints(2);
				plPoints += 2;
				if (pass == 1) {
					plRoster.get(passer).addAssist();
				}
				System.out.println(plPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball swishes through the net");
				turnOver(turnover);
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
				if (foul == true) {
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
			else {
				System.out.println(plPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball bounces off the rim");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
		}
		else {
			int compAcc = 0;
			if (compPlayer.getPosition().equals("SF")) {
				compAcc = plPlayer.getAcc() + 1;
			}
			else {
				compAcc = plPlayer.getAcc();
			}
			
			if (compAcc >= 6) {
				compPlayer.addPoints(2);
				compPoints += 2;
				if (compPass == 1) {
					compRoster.get(passer).addAssist();
				}
				System.out.println(compPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball swishes through the net");
				turnOver(turnover);
				compTactics = compBaseDefTactics;
				plTactics = plBaseOffTactics;
				if (foul == true) {
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
			else {
				System.out.println(compPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball bounces off the rim");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
		}
	}
	
	//CLUTCH SHOT
	//CLUTCH SHOT
	//CLUTCH SHOT
	//CLUTCH SHOT
	//CLUTCH SHOT
	public static void clutchShot (int turnover, boolean foul) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println();
		if (courtPosition == 3) {
			if (defense == false) {
				int plAcc = 0;
				if (plPlayer.getPosition().equals("SG")) {
					plAcc = plPlayer.getAcc() + 1;
				}
				else {
					plAcc = plPlayer.getAcc();
				}
				
				if (plAcc >= 12) {
					plPlayer.addPoints(3);
					plPoints += 3;
					if (pass == 1) {
						plRoster.get(passer).addAssist();
					}
					System.out.println(plPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball forms a beautiful arc towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And swishes through");
					turnOver(turnover);
					plTactics = plBaseDefTactics;
					compTactics = compBaseOffTactics;
					if (foul == true) {
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
					}
				}
				else {
					System.out.println(plPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball forms a beautiful arc towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And bounces off the rim");
					ballOpen = true;
					
					if (foul == true) {
						ballOpen = false;
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
					}
				}
			}
			else {
				int compAcc = 0;
				if (compPlayer.getPosition().equals("SG")) {
					compAcc = plPlayer.getAcc() + 1;
				}
				else {
					compAcc = plPlayer.getAcc();
				}
				
				if (compAcc >= 12) {
					compPlayer.addPoints(3);
					compPoints += 3;
					if (compPass == 1) {
						compRoster.get(passer).addAssist();
					}
					System.out.println(compPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball forms a beautiful arc towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And swishes through");
					turnOver(turnover);
					compTactics = compBaseDefTactics;
					plTactics = plBaseOffTactics;
					if (foul == true) {
						defense = true;
						compTactics = compBaseOffTactics;
						plTactics = plBaseDefTactics;
					}
				}
				else {
					System.out.println(compPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball forms a beautiful arc towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And bounces off the rim");
					ballOpen = true;
					
					if (foul == true) {
						ballOpen = false;
						defense = true;
						compTactics = compBaseOffTactics;
						plTactics = plBaseDefTactics;
					}
				}
			}
		}
		
		else if (courtPosition == 2) {
			if (defense == false) {
				int plAcc = 0;
				if (plPlayer.getPosition().equals("SF")) {
					plAcc = plPlayer.getAcc() + 1;
				}
				else {
					plAcc = plPlayer.getAcc();
				}
				
				if (plAcc >= 10) {
					plPlayer.addPoints(2);
					plPoints += 2;
					if (pass == 1) {
						plRoster.get(passer).addAssist();
					}
					System.out.println(plPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("As " + plPlayer.getName() + " lands, the ball flies towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And swishes through the net");
					turnOver(turnover);
					plTactics = plBaseDefTactics;
					compTactics = compBaseOffTactics;
					if (foul == true) {
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
					}
				}
				else {
					System.out.println(plPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("As " + plPlayer.getName() + " lands, the ball flies towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And bounces off the rim");
					ballOpen = true;
					
					if (foul == true) {
						ballOpen = false;
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
					}
				}
			}
			else {
				int compAcc = 0;
				if (compPlayer.getPosition().equals("SF")) {
					compAcc = plPlayer.getAcc() + 1;
				}
				else {
					compAcc = plPlayer.getAcc();
				}
				
				if (compAcc >= 10) {
					compPlayer.addPoints(2);
					compPoints += 2;
					if (compPass == 1) {
						compRoster.get(passer).addAssist();
					}
					System.out.println(compPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("As " + compPlayer.getName() + " lands, the ball flies towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And swishes through the net");
					turnOver(turnover);
					compTactics = compBaseDefTactics;
					plTactics = plBaseOffTactics;
					if (foul == true) {
						defense = true;
						compTactics = compBaseOffTactics;
						plTactics = plBaseDefTactics;
					}
				}
				else {
					System.out.println(compPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("As " + compPlayer.getName() + " lands, the ball flies towards the net");
					System.out.println();
					s1.nextLine();
					System.out.println("And bounces off the rim");
					ballOpen = true;
					
					if (foul == true) {
						ballOpen = false;
						defense = true;
						compTactics = compBaseOffTactics;
						plTactics = plBaseDefTactics;
					}
				}
			}
		}
		else {
			if (defense == false) {
				int plAcc = 0;
				if (plPlayer.getPosition().equals("C")) {
					plAcc = plPlayer.getAth() - 5;
				}
				else {
					plAcc = plPlayer.getAgl();
				}
				
				if (plAcc >= 7) {
					plPlayer.addPoints(2);
					plPoints += 2;
					if (pass == 1) {
						plRoster.get(passer).addAssist();
					}
					System.out.println(plPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball bounces off the backboard");
					System.out.println();
					s1.nextLine();
					System.out.println("And into the net");
					turnOver(turnover);
					plTactics = plBaseDefTactics;
					compTactics = compBaseOffTactics;
					if (foul == true) {
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
					}
				}
				else {
					System.out.println(plPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball bounces off the backboard");
					System.out.println();
					s1.nextLine();
					System.out.println("And bounces off the rim");
					ballOpen = true;
					
					if (foul == true) {
						ballOpen = false;
						defense = false;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
					}
				}
			}
			else {
				int compAcc = 0;
				if (compPlayer.getPosition().equals("C")) {
					compAcc = plPlayer.getAth() - 5;
				}
				else {
					compAcc = plPlayer.getAgl();
				}
				
				if (compAcc >= 7) {
					compPlayer.addPoints(2);
					compPoints += 2;
					if (compPass == 1) {
						compRoster.get(passer).addAssist();
					}
					System.out.println(compPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball bounces off the backboard");
					System.out.println();
					s1.nextLine();
					System.out.println("And into the net");
					turnOver(turnover);
					compTactics = compBaseDefTactics;
					plTactics = plBaseOffTactics;
					if (foul == true) {
						defense = true;
						compTactics = compBaseOffTactics;
						plTactics = plBaseDefTactics;
					}
				}
				else {
					System.out.println(compPlayer.getName() + " releases the ball");
					System.out.println();
					s1.nextLine();
					System.out.println("The ball bounces off the backboard");
					System.out.println();
					s1.nextLine();
					System.out.println("And bounces off the rim");
					ballOpen = true;
					
					if (foul == true) {
						ballOpen = false;
						defense = true;
						compTactics = compBaseOffTactics;
						plTactics = plBaseDefTactics;
					}
				}
			}
		}
	}
	
	//LAYUP
	//LAYUP
	//LAYUP
	//LAYUP
	//LAYUP
	public static void layup (int turnover, boolean foul) {
		System.out.println();
		
		if (defense == false) {
			int plAcc = 0;
			if (plPlayer.getPosition().equals("C")) {
				plAcc = plPlayer.getAth() - 5;
			}
			else {
				plAcc = plPlayer.getAgl();
			}
			
			if (plAcc >= 4) {
				plPlayer.addPoints(2);
				plPoints += 2;
				if (pass == 1) {
					plRoster.get(passer).addAssist();
				}
				System.out.println(plPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball swishes through the net");
				turnOver(turnover);
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
				if (foul == true) {
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
			else {
				System.out.println(plPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball bounces off the rim");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
		}
		else {
			int compAcc = 0;
			if (compPlayer.getPosition().equals("C")) {
				compAcc = plPlayer.getAth() - 5;
			}
			else {
				compAcc = plPlayer.getAgl();
			}
			
			if (compAcc >= 4) {
				compPlayer.addPoints(2);
				compPoints += 2;
				if (compPass == 1) {
					compRoster.get(passer).addAssist();
				}
				System.out.println(compPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball swishes through the net");
				turnOver(turnover);
				compTactics = compBaseDefTactics;
				plTactics = plBaseOffTactics;
				if (foul == true) {
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
			else {
				System.out.println(compPlayer.getName() + " releases the ball");
				System.out.println();
				System.out.println("The ball bounces off the rim");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
		}
	}
	
	//DUNK
	//DUNK
	//DUNK
	//DUNK
	//DUNK
	public static void dunk (int turnover, boolean foul) {
		System.out.println();
		
		if (defense == false) {
			int plAcc = 0;
			if (plPlayer.getPosition().equals("C") || plPlayer.getPosition().equals("PF") || plPlayer.getPosition().equals("SF")) {
				plAcc = plPlayer.getAth() + 2;
			}
			else {
				plAcc = plPlayer.getAth();
			}
			
			if (plAcc >= 5) {
				plPlayer.addPoints(2);
				plPoints += 2;
				if (pass == 1) {
					plRoster.get(passer).addAssist();
				}
				System.out.println(plPlayer.getName() + " soars through the air");
				System.out.println();
				System.out.println(plPlayer.getName() + " slams the ball into the net");
				turnOver(turnover);
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
				if (foul == true) {
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
			else {
				System.out.println(plPlayer.getName() + " soars through the air");
				System.out.println();
				System.out.println("The ball is jammed onto the rim and bounces off");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = false;
					plTactics = plBaseOffTactics;
					compTactics = compBaseDefTactics;
				}
			}
		}
		else {
			int compAcc = 0;
			if (compPlayer.getPosition().equals("C") || compPlayer.getPosition().equals("PF") || compPlayer.getPosition().equals("SF")) {
				compAcc = plPlayer.getAth() + 2;
			}
			else {
				compAcc = plPlayer.getAth();
			}
			
			if (compAcc >= 5) {
				compPlayer.addPoints(2);
				compPoints += 2;
				if (compPass == 1) {
					compRoster.get(passer).addAssist();
				}
				System.out.println(compPlayer.getName() + " soars through the air");
				System.out.println();
				System.out.println(compPlayer.getName() + " slams the ball into the net");
				turnOver(turnover);
				compTactics = compBaseDefTactics;
				plTactics = plBaseOffTactics;
				if (foul == true) {
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
			else {
				System.out.println(compPlayer.getName() + " soars through the air");
				System.out.println();
				System.out.println("The ball is jammed onto the rim and bounces off");
				ballOpen = true;
				
				if (foul == true) {
					ballOpen = false;
					defense = true;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
				}
			}
		}
	}
	
	//FAKE
	//FAKE
	//FAKE
	//FAKE
	//FAKE
	public static void fake () {
		int plAgl = 0;
		int compAgl = 0;
		
		if (fake == 1) {
			compAgl -= 2;
		}
		
		if (compFake == 1) {
			plAgl -= 2;
		}
		
		if (pickAndRoll == 1) {
			compAgl -= 2;
		}
		
		if (compPickAndRoll == 1) {
			plAgl -= 2;
		}
		
		System.out.println();
		if (plPlayer.getPosition().equals("PG")) {
			plAgl = plPlayer.getAgl() + 2;
		}
		else {
			plAgl = plPlayer.getAgl();
		}
		
		if (compPlayer.getPosition().equals("PG")) {
			compAgl = compPlayer.getAgl() + 2;
		}
		else {
			compAgl = compPlayer.getAgl();
		}
		
		if (defense == false) {
			if (plAgl > compAgl + 4) {
				fake = 2;
				System.out.println(plPlayer.getName() + " shakes off " + compPlayer.getName());
			}
			else {
				System.out.println(plPlayer.getName() + " tries to shake off " + compPlayer.getName() + ", but " + compPlayer.getName() + " locks down on " + plPlayer.getName());
			}
		}
		else {
			if (compAgl > plAgl + 4) {
				compFake = 2;
				System.out.println(compPlayer.getName() + " shakes off " + plPlayer.getName());
			}
			else {
				System.out.println(compPlayer.getName() + " tries to shake off " + plPlayer.getName() + ", but " + plPlayer.getName() + " locks down on " + compPlayer.getName());
			}
		}
	}
	
	//PICK&ROLL
	//PICK&ROLL
	//PICK&ROLL
	//PICK&ROLL
	//PICK&ROLL
	public static void callPickAndRoll () {
		Scanner s1 = new Scanner(System.in);
		System.out.println();
		
		int plAth = 0;
		int compAth = 0;
		
		ArrayList <Player> pickToRoll = new ArrayList <Player> ();
		
		for (int a = 0; a < plRoster.size(); a++) {
			if (defense == false && plRoster.get(a).getNum() != plPlayer.getNum()) {
				pickToRoll.add(plRoster.get(a));
			}
			else if (defense == true && compRoster.get(a).getNum() != compPlayer.getNum()){
				pickToRoll.add(compRoster.get(a));
			}
		}
		
		int picker = 0;
		
		if (defense == false) {
			System.out.println("Who do you call up to set the screen?");
			for (int a = 1; a <= pickToRoll.size(); a++) {
				System.out.println("  " + a + " - " + pickToRoll.get(a-1).getName());
			}
			picker = s1.nextInt() - 1;
			s1.nextLine();
		}
		else {
			picker = (int) (Math.random()*4);
		}
		
		Player helperPlayer = pickToRoll.get(picker);
		
		if (defense == false) {
			if (helperPlayer.getPosition().equals("C") || helperPlayer.getPosition().equals("PF")) {
				plAth = helperPlayer.getAth() + 2;
			}
			else {
				plAth = helperPlayer.getAth();
			}
			compAth = compPlayer.getAgl();
		}
		else {
			if (helperPlayer.getPosition().equals("C") || helperPlayer.getPosition().equals("PF")) {
				compAth = helperPlayer.getAth() + 2;
			}
			else {
				compAth = helperPlayer.getAth();
			}
			plAth = plPlayer.getAgl();
		}
		
		if (fake == 1) {
			compAth -= 2;
		}
		
		if (compFake == 1) {
			plAth -= 2;
		}
		
		if (pickAndRoll == 1) {
			compAth -= 2;
		}
		
		if (compPickAndRoll == 1) {
			plAth -= 2;
		}
		
		if (defense == false) {
			if (plAth > compAth + 2) {
				pickAndRoll = 2;
				System.out.println(compPlayer.getName() + " is blocked by " + helperPlayer.getName() + "'s screen");
			}
			else {
				System.out.println(compPlayer.getName() + " goes around " + helperPlayer.getName() + "'s screen ");
			}
		}
		else {
			if (compAth > plAth + 2) {
				compPickAndRoll = 2;
				System.out.println(plPlayer.getName() + " is blocked by " + helperPlayer.getName() + "'s screen");
			}
			else {
				System.out.println(plPlayer.getName() + " goes around " + helperPlayer.getName() + "'s screen ");
			}
		}
	}
	
	//ALLEYOOP
	//ALLEYOOP
	//ALLEYOOP
	//ALLEYOOP
	//ALLEYOOP
	public static void alleyOop (int turnover) {
		Scanner s1 = new Scanner(System.in);
		System.out.println();
		
		int plAcc = 0;
		int plAth = 0;
		int plDC = 17;
		int compAcc = 0;
		int compAth = 0;
		int compDC = 17;
		
		ArrayList <Player> alleyOopers = new ArrayList <Player> ();
		
		for (int a = 0; a < plRoster.size(); a++) {
			if (defense == false && plRoster.get(a).getNum() != plPlayer.getNum()) {
				alleyOopers.add(plRoster.get(a));
			}
			else if (defense == true && compRoster.get(a).getNum() != compPlayer.getNum()){
				alleyOopers.add(compRoster.get(a));
			}
		}
		
		int ooper = 0;
		
		if (defense == false) {
			System.out.println("Who do you pass the ball to?");
			for (int a = 1; a <= alleyOopers.size(); a++) {
				System.out.println("  " + a + " - " + alleyOopers.get(a-1).getName());
			}
			ooper = s1.nextInt() - 1;
			s1.nextLine();
		}
		else {
			ooper = (int) (Math.random()*4);
		}
		
		Player helperPlayer = alleyOopers.get(ooper);
		
		System.out.println();
		if (defense == false) {
			if (plPlayer.getPosition().equals("PG")) {
				plAcc = plPlayer.getAcc() + 2;
			}
			else {
				plAcc = plPlayer.getAcc();
			}
		}
		else {
			if (helperPlayer.getPosition().equals("PG")) {
				compAcc = compPlayer.getAcc() + 2;
			}
			else {
				compAcc = plPlayer.getAcc();
			}
			plAcc = plPlayer.getAcc();
		}
		
		plDC -= plAcc;
		compDC -= compAcc;
		
		plAth = helperPlayer.getAth();
		compAth = helperPlayer.getAth();
		
		if (defense == false) {
			System.out.println(plPlayer.getName() + " lobs the ball towards " + helperPlayer.getName());
			System.out.println();
			if (plAth >= plDC) {
				plPlayer.addAssist();
				helperPlayer.addPoints(2);
				plPoints += 2;
				System.out.println(helperPlayer.getName() + " catches it, and slams it into the net");
				turnOver(turnover);
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
			}
			else {
				System.out.println(helperPlayer.getName() + " misses the pass, and the ball bounces off of the backboard");
				ballOpen = true;
				if (foul == true) {
					ballOpen = false;
				}
			}
		}
		else {
			System.out.println(compPlayer.getName() + " lobs the ball towards " + helperPlayer.getName());
			System.out.println();
			if (compAth >= compDC) {
				compPlayer.addAssist();
				helperPlayer.addPoints(2);
				compPoints += 2;
				System.out.println(helperPlayer.getName() + " catches it, and slams it into the net");
				turnOver(turnover);
				plTactics = plBaseOffTactics;
				compTactics = compBaseDefTactics;
			}
			else {
				System.out.println(helperPlayer.getName() + " misses the pass, and the ball bounces off of the backboard");
				ballOpen = true;
				if (foul == true) {
					ballOpen = false;
				}
			}
		}
	}
	
	//BLOCK
	//BLOCK
	//BLOCK
	//BLOCK
	//BLOCK
	public static boolean block (int turnover) {
		Scanner s1 = new Scanner(System.in);
		
		boolean shotblock = false;
		int plAth = 0;
		int compAth = 0;
		
		System.out.println();
		
		if (plPlayer.getPosition().equals("C")) {
			plAth = plPlayer.getAth() + 1;
		}
		else {
			plAth = plPlayer.getAth();
		}
		if (compPlayer.getPosition().equals("C")) {
			compAth = compPlayer.getAth() + 1;
		}
		else {
			compAth = compPlayer.getAth();
		}
		
		if (fake == 1) {
			compAth -= 2;
		}
		
		if (compFake == 1) {
			plAth -= 2;
		}
		
		if (pickAndRoll == 1) {
			compAth -= 2;
		}
		
		if (compPickAndRoll == 1) {
			plAth -= 2;
		}
		
		System.out.println("Type anything to continue");
		s1.nextLine();
		System.out.println();
		
		if (defense == false) {
			if (compAth > plAth + 2) {
				shotblock = true;
				compPlayer.addBlock();
				System.out.println(compPlayer.getName() + " leaps up and deflects the shot");
				if (compAth - plAth <= 2) {
					foul = true;
					defense = false;
					courtPosition = 3;
					compTactics = compBaseDefTactics;
					plTactics = plBaseOffTactics;
					compFouls++;
				}
				if (foul == false) {
					grabBall(turnover);
				}
			}
			else {
				System.out.println(compPlayer.getName() + " is unable to stop the shot");
				if (plAth - compAth > 12) {
					foul = true;
					defense = false;
					courtPosition = 3;
					compTactics = compBaseDefTactics;
					plTactics = plBaseOffTactics;
					compFouls++;
				}
			}
		}
		else {
			if (plAth > compAth + 2) {
				shotblock = true;
				plPlayer.addBlock();
				System.out.println(plPlayer.getName() + " leaps up and deflects the shot");
				if (plAth - compAth <= 2) {
					foul = true;
					defense = true;
					courtPosition = 3;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
					plFouls++;
				}
				if (foul == false) {
					grabBall(turnover);
				}
			}
			else {
				System.out.println(plPlayer.getName() + " is unable to stop the shot");
				if (compAth - plAth > 12) {
					foul = true;
					defense = true;
					courtPosition = 3;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
					plFouls++;
				}
			}
		}
		
		return shotblock;
	}
	
	//STEAL
	//STEAL
	//STEAL
	//STEAL
	//STEAL
	public static boolean steal (int turnover) {
		Scanner s1 = new Scanner(System.in);
		
		boolean stealBall = false;
		int plAth = 0;
		int compAth = 0;
		
		System.out.println();
		
		if (plPlayer.getPosition().equals("PG")) {
			plAth = plPlayer.getAgl() + 1;
		}
		else {
			plAth = plPlayer.getAgl();
		}
		if (compPlayer.getPosition().equals("PG")) {
			compAth = compPlayer.getAgl() + 1;
		}
		else {
			compAth = compPlayer.getAgl();
		}
		
		if (fake == 1) {
			compAth -= 2;
		}
		
		if (compFake == 1) {
			plAth -= 2;
		}
		
		if (pickAndRoll == 1) {
			compAth -= 2;
		}
		
		if (compPickAndRoll == 1) {
			plAth -= 2;
		}
		
		System.out.println("Type anything to continue");
		s1.nextLine();
		System.out.println();
		
		if (defense == false) {
			if (compAth > plAth + 8) {
				stealBall = true;
				System.out.println(compPlayer.getName() + " slaps the ball out of " + plPlayer.getName() + "'s hands");
				if (plAth - compAth <= 2) {
					foul = true;
					defense = false;
					courtPosition = 3;
					compTactics = compBaseDefTactics;
					plTactics = plBaseOffTactics;
					compFouls++;
				}
				if (foul == false) {
					grabBall(turnover);
					if (defense == true) {
						compPlayer.addSteal();
					}
				}
			}
			else {
				System.out.println(compPlayer.getName() + " misses the steal");
				if (plAth - compAth > 12) {
					foul = true;
					defense = false;
					courtPosition = 3;
					compTactics = compBaseDefTactics;
					plTactics = plBaseOffTactics;
					compFouls++;
				}
			}
		}
		else {
			if (plAth > compAth + 8) {
				stealBall = true;
				System.out.println(plPlayer.getName() + " slaps the ball out of " + compPlayer.getName() + "'s hands");
				if (plAth - compAth <= 2) {
					foul = true;
					defense = true;
					courtPosition = 3;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
					plFouls++;
				}
				if (foul == false) {
					grabBall(turnover);
					if (defense == false) {
						plPlayer.addSteal();
					}
				}
			}
			else {
				System.out.println(plPlayer.getName() + " misses the steal");
				if (compAth - plAth > 12) {
					foul = true;
					defense = true;
					courtPosition = 3;
					compTactics = compBaseOffTactics;
					plTactics = plBaseDefTactics;
					plFouls++;
				}
			}
		}
		
		return stealBall;
	}
	
	//FREE THROW
	//FREE THROW
	//FREE THROW
	//FREE THROW
	//FREE THROW
	public static void freeThrow (int num, int turnover) {
		Scanner s1 = new Scanner(System.in);
		
		ballOpen = false;
		System.out.println(); 
		if (defense == false) {
			System.out.println(plPlayer.getName() + " walks up to the free throw line");
			for (int a = 0; a < num; a++) {
				System.out.println();
				System.out.println("The referee passes " + plPlayer.getName() + " the ball");
				System.out.println("  1 - FreeThrow");
				s1.nextLine();
				if (plPlayer.getAcc() >= 4) {
					plPlayer.addPoints(1);
					plPoints++;
					System.out.println();
					System.out.println("The ball swishes through the net");
					if (a == num-1) {
						defense = true;
						courtPosition = 3;
						turnover = 4;
						plTactics = plBaseDefTactics;
						compTactics = compBaseOffTactics;
					}
				}
				else {
					System.out.println();
					System.out.println("The ball bounces off the rim");
					if (a == num-1) {
						ballOpen = true;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
						
					}
				}
			}
		}
		else {
			System.out.println(compPlayer.getName() + " walks up to the free throw line");
			for (int a = 0; a < num; a++) {
				System.out.println();
				System.out.println("The referee passes " + compPlayer.getName() + " the ball");
				System.out.println();
				System.out.println("Type enter to continue");
				s1.nextLine();
				if (compPlayer.getAcc() >= 4) {
					compPlayer.addPoints(1);
					compPoints++;
					System.out.println();
					System.out.println("The ball swishes through the net");
					if (a == num-1) {
						defense = false;
						courtPosition = 3;
						turnover = 4;
						plTactics = plBaseOffTactics;
						compTactics = compBaseDefTactics;
					}
				}
				else {
					System.out.println();
					System.out.println("The ball bounces off the rim");
					if (a == num-1) {
						ballOpen = true;
						plTactics = plBaseDefTactics;
						compTactics = compBaseOffTactics;
					}
				}
			}
		}
	}
	
	//TURNOVER
	//TURNOVER
	//TURNOVER
	//TURNOVER
	//TURNOVER
	public static void turnOver (int turnover) {
		if (defense == true) {
			defense = false;
			turnover = 4;
			plTactics = plBaseOffTactics;
			compTactics = compBaseDefTactics;
		}
		else {
			defense = true;
			turnover = 4;
			plTactics = plBaseDefTactics;
			compTactics = compBaseOffTactics;
		}
		courtPosition = 3;
	}
	
	//GRAB BALL
	//GRAB BALL
	//GRAB BALL
	//GRAB BALL
	//GRAB BALL
	public static void grabBall (int turnover) {
		Scanner s1 = new Scanner(System.in);
		
		int plAgl = 0;
		int compAgl = 0;
		if (plPlayer.getPosition().equals("PG"))
			plAgl = plPlayer.getAglAdv();
		else 
			plAgl = plPlayer.getAgl();
		if (compPlayer.getPosition().equals("PG"))
			compAgl = compPlayer.getAglAdv();
		else
			compAgl = compPlayer.getAgl();
		
		if (plTactics == 4 && courtPosition == 1)
			plAgl--;
		if (plTactics == 4 && courtPosition == 3)
			plAgl++;
		if (compTactics == 4 && courtPosition == 1)
			compAgl--;
		if (compTactics == 4 && courtPosition == 3)
			compAgl++;
		
		System.out.println();
		
		if (defense == true) {
			if (plAgl >= compAgl) {
				System.out.println(plPlayer.getName() + " lunges forward and grabs the ball before " + compPlayer.getName());
				defense = false;
				courtPosition = 3;
				turnover = 4;
				plTactics = plBaseOffTactics;
				compTactics = compBaseDefTactics;
			}
			else {
				System.out.println(compPlayer.getName() + " lunges forward and grabs the ball before " + plPlayer.getName());
			}
		}
		else {
			if (plAgl > compAgl) {
				System.out.println(plPlayer.getName() + " lunges forward and grabs the ball before " + compPlayer.getName());
			}
			else {
				System.out.println(compPlayer.getName() + " lunges forward and grabs the ball before " + plPlayer.getName());
				defense = true;
				courtPosition = 3;
				turnover = 4;
				plTactics = plBaseDefTactics;
				compTactics = compBaseOffTactics;
			}
		}
	}
	
	//TACTICS ADJUSTMENTS
	//TACTICS ADJUSTMENTS
	//TACTICS ADJUSTMENTS
	//TACTICS ADJUSTMENTS
	//TACTICS ADJUSTMENTS
	public static void tacticsAdjustment () {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Which playstyle would you like to adjust?");
		System.out.println("  1 - Offensive");
		System.out.println("  2 - Defensive");
		int tacticsType = s1.nextInt();
		s1.nextLine();
		
		System.out.println();
		System.out.println("What playstyle would you like change to?");
		if (tacticsType == 1) {
			for (int a = 1; a <= offTactics.size(); a++) 
				System.out.println("  " + (a) + " - " + offTactics.get(a-1));
		}
		else {
			for (int a = 1; a <= defTactics.size(); a++) 
				System.out.println("  " + (a) + " - " + defTactics.get(a-1));
		}
		
		int newTactic = s1.nextInt() - 1;
		s1.nextLine();
		System.out.println();
		
		if (tacticsType == 1) {
			System.out.println(offTactics.get(plBaseOffTactics) + " has been changed to " + offTactics.get(newTactic));
			plBaseOffTactics = newTactic;
		}
		else {
			System.out.println(defTactics.get(plBaseDefTactics) + " has been changed to " + defTactics.get(newTactic));
			plBaseDefTactics = newTactic;
		}
	}
	
	//PLAYER ADJUSTMENTS
	//PLAYER ADJUSTMENTS
	//PLAYER ADJUSTMENTS
	//PLAYER ADJUSTMENTS
	//PLAYER ADJUSTMENTS
	public static void playerAdjustments () {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("What would you like to adjust?");
		for (int a = 0; a < plRoster.size(); a++) 
			System.out.println("  " + (a+1) + " - " + plRoster.get(a).getName() + " (" + plRoster.get(a).getPosition() + ")");
		
		int changePlayer = s1.nextInt() - 1;
		s1.nextLine();
		Player temp = plRoster.get(changePlayer);
		
		System.out.println();
		System.out.println(temp);
		System.out.println();
		System.out.println("What would you like to change?");
		System.out.println("  1 - Name");
		System.out.println("  2 - Athleticism");
		System.out.println("  3 - Accuracy");
		System.out.println("  4 - Agility");
		int changeStat = s1.nextInt();
		s1.nextLine();
		if (changeStat == 1) {
			System.out.println();
			System.out.println("What would you like to change the name to?");
			String newName = s1.nextLine();
			temp.setName(newName);
		}
		if (changeStat == 2) {
			System.out.println();
			System.out.println("How much would you like to change " + temp.getName() + "'s");
			System.out.println("altheticism to?");
			int newAth = s1.nextInt();
			s1.nextLine();
			if (newAth > 30) {
				temp.setAth(30);
				System.out.println();
				System.out.println("A player's stats cannot exceed 30");
				System.out.println(temp.getName() + " is now more athletic");
			}
			else if (newAth < 1) {
				temp.setAth(1);
				System.out.println();
				System.out.println("A player's stats cannot go below 1");
				System.out.println(temp.getName() + " is now less athletic");
			}
			else {
				temp.setAth(newAth);
				System.out.println();
				if (newAth >= 0)
					System.out.println(temp.getName() + " is now more athletic");
				else 
					System.out.println(temp.getName() + " is now less athletic");
			}
		}
		if (changeStat == 3) {
			System.out.println();
			System.out.println("How much would you like to change " + temp.getName() + "'s ");
			System.out.println("accuracy to?");
			int newAcc = s1.nextInt();
			s1.nextLine();
			if (newAcc > 30) {
				temp.setAcc(30);
				System.out.println();
				System.out.println("A player's stats cannot exceed 30");
				System.out.println(temp.getName() + " is now more accurate");
			}
			else if (newAcc < 1) {
				temp.setAcc(1);
				System.out.println();
				System.out.println("A player's stats cannot go below 1");
				System.out.println(temp.getName() + " is now less accurate");
			}
			else {
				temp.setAcc(newAcc);
				System.out.println();
				if (newAcc >= 0)
					System.out.println(temp.getName() + " is now more accurate");
				else 
					System.out.println(temp.getName() + " is now less accurate");
			}
		}
		if (changeStat == 4) {
			System.out.println();
			System.out.println("How much would you like to change " + temp.getName() + "'s ");
			System.out.println("agility to?");
			int newAgl = s1.nextInt();
			s1.nextLine();
			if (newAgl > 30) {
				temp.setAgl(30);
				System.out.println();
				System.out.println("A player's stats cannot exceed 0");
				System.out.println(temp.getName() + " is now more agile");
			}
			else if (newAgl < 1) {
				temp.setAgl(1);
				System.out.println();
				System.out.println("A player's stats cannot go below 1");
				System.out.println(temp.getName() + " is now less agile");
			}
			else {
				temp.setAgl(newAgl);
				System.out.println();
				if (newAgl >= 0)
					System.out.println(temp.getName() + " is now more agile");
				else 
					System.out.println(temp.getName() + " is now less agile");
			}
		}
	}
	
	//DEFENDER
	//DEFENDER
	//DEFENDER
	//DEFENDER
	//DEFENDER
	public static void defender () {
		if (defense == true) {
			//COMP Iso
			if (compTactics == 0) {
				plPlayer = plRoster.get(compPlayer.getNum());
			}
			//1-2-2
			else if (plTactics == 1) {
				if (courtPosition == 3) {
					plPlayer = plRoster.get(compPlayer.getNum());
				}
				else if (courtPosition == 2) {
					if (compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("SG")) {
						plPlayer = plRoster.get(1);
					}
					else {
						plPlayer = plRoster.get(2);
					}
				}
				else {
					if (compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("SG") || compPlayer.getPosition().equals("SF")) {
						plPlayer = plRoster.get(3);
					}
					else {
						plPlayer = plRoster.get(4);
					}
				}
			}
			//1-3-1
			else if (plTactics == 2) {
				if (courtPosition == 3) {
					if (!compPlayer.getPosition().equals("C")) {
						plPlayer = plRoster.get(compPlayer.getNum());
					}
					else
						plPlayer = plRoster.get(3);
				}
				else if (courtPosition == 2) {
					if (compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("SG")) {
						plPlayer = plRoster.get(1);
					}
					else if (compPlayer.getPosition().equals("SF")) {
						plPlayer = plRoster.get(2);
					}
					else {
						plPlayer = plRoster.get(3);
					}
				}
				else {
					plPlayer = plRoster.get(4);
				}
			}
			//2-3
			else if (plTactics == 3) {
				if (courtPosition == 3) {
					if (compPlayer.getPosition().equals("PG")) {
						plPlayer = plRoster.get(0);
					}
					else if (compPlayer.getPosition().equals("SG")) {
						plPlayer = plRoster.get(1);
					}
					else if (compPlayer.getPosition().equals("SF")) {
						plPlayer = plRoster.get(2);
					}
					else {
						plPlayer = plRoster.get(3);
					}
				}
				else if (courtPosition == 2) {
					if (compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("SG")) {
						plPlayer = plRoster.get(2);
					}
					else if (compPlayer.getPosition().equals("SF") || compPlayer.getPosition().equals("PF")) {
						plPlayer = plRoster.get(3);
					}
					else {
						plPlayer = plRoster.get(4);
					}
				}
				else {
					plPlayer = plRoster.get(4);
				}
			}
			//3-2
			else if (plTactics == 4) {
				if (courtPosition == 3) {
					if (compPlayer.getPosition().equals("PG")) {
						plPlayer = plRoster.get(0);
					}
					else if (compPlayer.getPosition().equals("SG")) {
						plPlayer = plRoster.get(1);
					}
					else {
						plPlayer = plRoster.get(2);
					}
				}
				else {
					if (compPlayer.getPosition().equals("PG") || compPlayer.getPosition().equals("SG") || compPlayer.getPosition().equals("SF")) {
						plPlayer = plRoster.get(3);
					}
					else {
						plPlayer = plRoster.get(4);
					}
				}
			}
		}
		else {
			//PL Iso
			if (plTactics == 0) {
				compPlayer = compRoster.get(plPlayer.getNum());
			}
			//1-2-2
			else if (compTactics == 1) {
				if (courtPosition == 3) {
					compPlayer = compRoster.get(plPlayer.getNum());
				}
				else if (courtPosition == 2) {
					if (plPlayer.getPosition().equals("PG") || plPlayer.getPosition().equals("SG")) {
						compPlayer = compRoster.get(1);
					}
					else {
						compPlayer = compRoster.get(2);
					}
				}
				else {
					if (plPlayer.getPosition().equals("PG") || plPlayer.getPosition().equals("SG") || plPlayer.getPosition().equals("SF")) {
						compPlayer = compRoster.get(3);
					}
					else {
						compPlayer = compRoster.get(4);
					}
				}
			}
			//1-3-1
			else if (compTactics == 2) {
				if (courtPosition == 3) {
					if (!plPlayer.getPosition().equals("C")) {
						compPlayer = compRoster.get(plPlayer.getNum());
					}
					else
						compPlayer = compRoster.get(3);
				}
				else if (courtPosition == 2) {
					if (plPlayer.getPosition().equals("PG") || plPlayer.getPosition().equals("SG")) {
						compPlayer = compRoster.get(1);
					}
					else if (plPlayer.getPosition().equals("SF")) {
						compPlayer = compRoster.get(2);
					}
					else {
						compPlayer = compRoster.get(3);
					}
				}
				else {
					compPlayer = compRoster.get(4);
				}
			}
			//2-3
			else if (compTactics == 3) {
				if (courtPosition == 3) {
					if (plPlayer.getPosition().equals("PG")) {
						compPlayer = compRoster.get(0);
					}
					else if (plPlayer.getPosition().equals("SG")) {
						compPlayer = compRoster.get(1);
					}
					else if (plPlayer.getPosition().equals("SF")) {
						compPlayer = compRoster.get(2);
					}
					else {
						compPlayer = compRoster.get(3);
					}
				}
				else if (courtPosition == 2) {
					if (plPlayer.getPosition().equals("PG") || plPlayer.getPosition().equals("SG")) {
						compPlayer = compRoster.get(2);
					}
					else if (plPlayer.getPosition().equals("SF") || plPlayer.getPosition().equals("PF")) {
						compPlayer = compRoster.get(3);
					}
					else {
						compPlayer = compRoster.get(4);
					}
				}
				else {
					compPlayer = compRoster.get(4);
				}
			}
			//3-2
			else if (compTactics == 4) {
				if (courtPosition == 3) {
					if (plPlayer.getPosition().equals("PG")) {
						compPlayer = compRoster.get(0);
					}
					else if (plPlayer.getPosition().equals("SG")) {
						compPlayer = compRoster.get(1);
					}
					else {
						compPlayer = compRoster.get(2);
					}
				}
				else {
					if (plPlayer.getPosition().equals("PG") || plPlayer.getPosition().equals("SG") || plPlayer.getPosition().equals("SF")) {
						compPlayer = compRoster.get(3);
					}
					else {
						compPlayer = compRoster.get(4);
					}
				}
			}
		}
	}
	
	//TUTORIAL
	public static void gameTutorial () {
		Scanner s1 = new Scanner(System.in);
		
		int endTutorial = 1;
		while (endTutorial == 1) {
			System.out.println();
			System.out.println("What would you like to learn about?");
			System.out.println("  1 - Players & Positions");
			System.out.println("  2 - Gameplay Mechanics");
			System.out.println("  3 - Timer & Shotchock");
			System.out.println("  4 - Court Positions");
			System.out.println("  5 - Fouls");
			System.out.println("  6 - Return to Game");
			
			int tutorialChoice = s1.nextInt();
			s1.nextLine();
			if (tutorialChoice == 1) {
				System.out.println();
				System.out.println("There are 5 players on each side.");
				System.out.println("Each player has their own unique abilities");
				System.out.println();
				System.out.println("The point guard (PG) is very agile");
				System.out.println("They are the main play-makers and passers");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("The shooting guard (SG) is similar to a PG");
				System.out.println("They are more accurate but are also less athletic");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("The small forward (SF) is very well-rounded");
				System.out.println("They are all athletic, accurate, and agile");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("The power forward (PF) is similar to a SF");
				System.out.println("They are more athletic but less agile");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("The center (C) is the tallest and strongest player");
				System.out.println("They are very athletic but not very agile");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
			}
			else if (tutorialChoice == 2) {
				System.out.println();
				System.out.println("Each turn, you will have several play options");
				System.out.println("They are represented by numbers accordingly");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("Depending on where you are on the court");
				System.out.println("And the current player you are controlling");
				System.out.println("You may receive different options");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("The success of the play will be determined");
				System.out.println("Based on the abilities of your player");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("Each play will be associated with one or more");
				System.out.println("abilities of your player");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("For example, shooting a basket uses accuracy");
				System.out.println("While dunking uses athleticism");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("Sometimes, opponent players will be involved in");
				System.out.println("your actions, such as blocking shots on defense");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
			}
			else if (tutorialChoice == 3) {
				System.out.println();
				System.out.println("Each game consists of a number of minutes");
				System.out.println("Each minute contains 10 rounds");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("You have a limited amount of offense time");
				System.out.println("Each turnover consists of 4 rounds maximum");
				System.out.println("If you go over, the opponent will gain possession");
				System.out.println("This is called a shot clock violation");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println();
				System.out.println("At the end of the shot clock, you will have");
				System.out.println("access to a clutch shot");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println();
				System.out.println("This shot is difficult to make, but can change");
				System.out.println("the tides of the game entirely");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
			}
			else if (tutorialChoice == 4) {
				System.out.println();
				System.out.println("The court is divided into 3 areas");
				System.out.println();
				System.out.println("The 3pt line is the most outer area on the court");
				System.out.println("Shots taken outside the 3pt line score 3 points");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("Inside the 3pt line, you will get more actions");
				System.out.println("Shots taken here only score 2 points");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("Further inside the 3pt line is the paint");
				System.out.println("This is where you can take lay-ups or dunk");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
			}
			else if (tutorialChoice == 5) {
				System.out.println();
				System.out.println("It is possible that in the course of an action");
				System.out.println("That you foul another player");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
				System.out.println("These are cumulative, and once you reach 5 fouls");
				System.out.println("The opponent team will be allowed 2 free throws");
				System.out.println("Each free throw is 1 point");
				System.out.println("These rules are also valid for the opponent");
				System.out.println();
				System.out.println("Type anything to continue");
				s1.nextLine();
			}
			else {
				endTutorial = 2;
				System.out.println();
				System.out.println("These are all the rules of the game for now");
				System.out.println("Have fun!");
				System.out.println();
				System.out.println("Type anything to start");
				s1.nextLine();
			}
		}
	}
	
	//PLAYSTYLE TUTORIAL
	public static void playstyleTutorial() {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Playstyles are unique strategies you can use to");
		System.out.println("your advantage on the court");
		System.out.println();
		System.out.println("Type anything to continue");
		s1.nextLine();
		
		int endTutorial = 1;
		while (endTutorial == 1) {
			System.out.println();
			System.out.println("Which type of playstyle do you want to learn?");
			System.out.println("  1 - Offensive");
			System.out.println("  2 - Defensive");
			System.out.println("  3 - Return to Game");
			int learnPl = s1.nextInt();
			s1.nextLine();
			if (learnPl == 1) {
				System.out.println();
				System.out.println("Which offensive playstyle do you want to learn?");
				System.out.println("  1 - Isolation");
				System.out.println("  2 - 2 Out 3 In");
				System.out.println("  3 - 3 Out 2 In");
				System.out.println("  4 - 4 Out 1 In");
				System.out.println("  5 - 5 Out");
				int offPl = s1.nextInt();
				s1.nextLine();
				if (offPl == 1) {
					System.out.println();
					System.out.println("The Isolation playstyle singles out individual");
					System.out.println("players to go 1 on 1 with a single opponent player.");
					System.out.println("This forces all other players to fan out on the");
					System.out.println("other side of the court.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println("This playstyle prevents the pick & roll action,");
					System.out.println("and automatically changes to the 3 Out 2 In");
					System.out.println("playstyle once the isolated player passes the ball.");
					System.out.println("This playstyle is useful when you have an");
					System.out.println("outstanding player in your team who is at advantage");
					System.out.println("against the defensive player.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else if (offPl == 2) {
					System.out.println();
					System.out.println("The 2 Out 3 In playstyle puts the PG and SG");
					System.out.println("outside the 3pt line with the SF &PF inside the");
					System.out.println("perimeter and the C ready to step into the paint.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println("This opens up the opportunity for guards to shoot");
					System.out.println("from outside the perimeter, but also provides");
					System.out.println("opportunities for inside-perimeter shots and dunks.");
					System.out.println("This is a more inside-perimeter playstyle.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else if (offPl == 3) {
					System.out.println();
					System.out.println("The 3 Out 2 In playstyle puts the PG, SG and SF");
					System.out.println("outside the 3pt line with the PF inside the");
					System.out.println("perimeter and the C ready to step into the paint.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println("This allows for players to be spread out across");
					System.out.println("the court, with the guards ready to shoot 3s");
					System.out.println("outside, the forwards ready to drive in, or the C");
					System.out.println("to receive a pass and dunk. This is a very balanced");
					System.out.println("playstyle.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else if (offPl == 4) {
					System.out.println();
					System.out.println("The 4 Out 1 In playstyle puts the PG, SG, SF, and");
					System.out.println("PF outside the 3pt line with the C inside the");
					System.out.println("perimeter.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println("This puts players mainly around the 3pt line, so");
					System.out.println("the guards are ready to shoot or drive at any time,");
					System.out.println("the C is available to set up screens, and the");
					System.out.println("forwards ready to drive in any time. This is a more");
					System.out.println("perimeter playstyle.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else {
					System.out.println();
					System.out.println("The 5 Out playstyle puts all of the players outside");
					System.out.println("the perimeter.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("This calls for a highly accurate team, but if done");
					System.out.println("with the right team, allow players to rain 3pt shots");
					System.out.println("all game. This is a perimeter-heavy playstyle.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
			}
			else if (learnPl == 2) {
				System.out.println();
				System.out.println("Which defensive playstyle do you want to learn?");
				System.out.println("  1 - Man-to-Man");
				System.out.println("  2 - 1-2-2 Zone");
				System.out.println("  3 - 1-3-1 Zone");
				System.out.println("  4 - 2-3 Zone");
				System.out.println("  5 - 3-2 Zone");
				int defPl = s1.nextInt();
				s1.nextLine();
				if (defPl == 1) {
					System.out.println();
					System.out.println("Man-to-Man defense is the most basic type of ");
					System.out.println("defensive playstyle, with each player guarding an ");
					System.out.println("opponent of the same position.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("There are no bonuses or penalties to playing this ");
					System.out.println("way, but do keep in mind that you will only be able ");
					System.out.println("to follow defenders around loosely and will not be ");
					System.out.println("able to push back drives.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else if (defPl == 2) {
					System.out.println();
					System.out.println("1-2-2 zone is a type of zone defense. This means");
					System.out.println("that you will not be able to freely adjust ");
					System.out.println("defenders like in Man-to-Man defense");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("1-2-2 zone is a standard means of defense against");
					System.out.println("the 5 Out offensive playstyle, where the players");
					System.out.println("form a loose ring around the perimeter");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("1-2-2 zone specializes in perimeter defense, giving");
					System.out.println("players a +2 to BLOCK shots on the perimeter. ");
					System.out.println("However, the loose structure of this formation ");
					System.out.println("makes it less effective in intercepting passes,");
					System.out.println("giving players -2 to BLOCK or STEAL passes.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else if (defPl == 3) {
					System.out.println();
					System.out.println("1-3-1 zone is a type of zone defense. This means");
					System.out.println("that you will not be able to freely adjust ");
					System.out.println("defenders like in Man-to-Man defense");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("1-3-1 zone is a more uncommon defensive playstyle,");
					System.out.println("where, similar to the 1-2-2 zone, the players form");
					System.out.println("a ring around the perimeter. However, unlike 1-2-2");
					System.out.println("zone, the C alone guards the paint, while the PF");
					System.out.println("moves up to guard the interior");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("The tight interior of 1-3-1 zone along with its");
					System.out.println("wide spacing allows for lockdown defense, giving");
					System.out.println("all players +1 to BLOCK and STEAL shots. However,");
					System.out.println("players get a -2 on REBOUND, since defense is");
					System.out.println("mainly focused around the perimeter, with only");
					System.out.println("the C guarding the paint.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else if (defPl == 4) {
					System.out.println();
					System.out.println("2-3 zone is a type of zone defense. This means");
					System.out.println("that you will not be able to freely adjust ");
					System.out.println("defenders like in Man-to-Man defense");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("2-3 zone is probably the most common zone");
					System.out.println("defense playstyle, with players positioned in an");
					System.out.println("upside down pentagon inside the perimeter.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("The tightly packe structure of the 2-3 zone");
					System.out.println("creates an incredible lockdown defense, giving");
					System.out.println("players a +2 on all BLOCKS and STEALS within the");
					System.out.println("perimeter, forcing opponents to shoot from the 3pt");
					System.out.println("line due to the defensive pressure from inside.");
					System.out.println("However, the perimeter also happens to be the ");
					System.out.println("weakness of 2-3 zone, since defenders are placed ");
					System.out.println("deeper inside the perimeter, giving defenders -2 ");
					System.out.println("to BLOCK and STEAL outside the 3pt line.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
				else {
					System.out.println();
					System.out.println("3-2 zone is a type of zone defense. This means");
					System.out.println("that you will not be able to freely adjust ");
					System.out.println("defenders like in Man-to-Man defense");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println();
					System.out.println("3-2 zone is the inverse of the 2-3 zone, with");
					System.out.println("the PG, SG, and SF guarding the perimeter and");
					System.out.println("the PF and C guarding the interior.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
					System.out.println("Similar in structure to 1-2-2 zone, 3-2 zone");
					System.out.println("puts heavy emphasis on perimeter defense,");
					System.out.println("giving players +1 to all stats outside the 3pt");
					System.out.println("line. Unlike 1-2-2 zone, however, 3-2 zone leaves");
					System.out.println("the paint virtually unguarded, hence the -1 to all");
					System.out.println("stats inside the paint.");
					System.out.println();
					System.out.println("Type anything to continue");
					s1.nextLine();
				}
			}
			else {
				endTutorial = 2;
				System.out.println();
				System.out.println("These are all the playstyles of the game for now");
				System.out.println("Have fun!");
				System.out.println();
				System.out.println("Type anything to start");
				s1.nextLine();
			}
		}
	}

}
