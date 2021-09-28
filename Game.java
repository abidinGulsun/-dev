package �dev;

public class Game {

	int game�d;
	String gameName;
	String detail;
	String company;
	String price;

	public Game() {
		this(1, "Assassins Creed Unity", "Bir suikasc� olan arno'nun hayat�n� yer alan bir oyundur...", "Ubisoft",
				"99.99 Tl");
	}

	public Game(int game�d, String gameName) {
		this(2, "The Witcher 3", "CD Projekt taraf�ndan yay�nlanan bir dizi fantezi aksiyon rol yapma oyunudur.",
				"Cd Projekt", "55.00 TL");
	}

	public Game(int game�d, String gameName, String detail) {
		this(3, "The Elder Scrolls Skyrim",
				"�lk do�an alduin isimli bir ejderhan�n kar��s�nda durabilecek olan tek varl�k olan dragonborn'un sava��...",
				"Bethesda", "55.00 Tl");
	}

	public Game(int game�d, String gameName, String detail, String company, String price) {
		super();
		this.game�d = game�d;
		this.gameName = gameName;
		this.detail = detail;
		this.company = company;
		this.price = price;
	}

}
