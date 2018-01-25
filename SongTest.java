import java.util.Scanner;

public class SongTest {

	private static Scanner scanner;

	public static void main(String[] args) {

		Singer frank = new Singer ("Frank Sinatra");
		Singer wham = new Singer ("Wham!");
		Singer mariah = new Singer ("Mariah Carey");
		Singer chris = new Singer ("Chris Rea");
		Singer sia = new Singer ("Sia");
		Singer singers [] = {frank,wham,mariah,chris,sia};

		Song song1 = new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );
		Song song2 = new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		Song song3 = new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );
		Song song4 = new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		Song song5 = new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		Song song6 = new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );

		Song songs [] = {song1,song2,song3,song4,song5,song6};
		scanner = new Scanner (System.in);

		System.out.println("****************  Welcome to our DMST Christmas Music Application **************** ");
		while (true){
			System.out.println("Menu:                         ");
			System.out.println("Type 1 to display singers' list                         ");
			System.out.println("Type 2 to display songs' list                           ");
			System.out.println("Type 3 to display Frank's Sinatra available songs       ");

			System.out.print("    Type here: ");
			int choice = scanner.nextInt();

			if(choice==1){	//εκτύπωση της λίστας τραγουδιστών
				System.out.println("\n   ** Display Singers' List **     ");
				for (Singer item : singers) {
					System.out.println("   - "+item);
				}
			}
			else if(choice==2){	//εκτύπωση των τραγουδιών του Frank Sinatra
				int counter=0;
				System.out.println("\n   ** Display Frank's Sinatra Song List **     ");
				for (int i=0; i<songs.length; i++){

					if(songs[i]!=null && songs[i].getSinger().getName().equals("Frank Sinatra")){
						counter++;
					}

				}
				System.out.println("   "+counter +" songs are found: ");
				for (int i=0; i<songs.length; i++){
					if(songs[i]!=null && songs[i].getSinger().getName().equals("Frank Sinatra")){
						System.out.println("   Title: "+songs[i].getTitle() +" ,url to listen: "+songs[i].getUrl());
					}
				}
			}
			else System.out.println("Sorry, wrong input try again");
			System.out.println("*********************************************************************************** ");
			System.out.println();
			System.out.println();
		}
	}

	
}
