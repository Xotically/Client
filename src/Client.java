import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Client {

	static AudioPlayer audioPlayer;
	static Player player;
	static ServerConnection conn;
	static View view;

	public static void main(String[] args) {
		audioPlayer = new AudioPlayer();
		player = new Player();
		conn = new ServerConnection();
		view = new View();

		audioPlayer.playSong("goldenrod-city");
		conn.listen();
	}
}



