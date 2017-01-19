import cs1.Keyboard;

public class Player{

    private String name;
    private double _bal;
    private int _winStreak;
    private int _loseStreak;

    public Player(String newName, double newBal){
	_winStreak = 0;
	_loseStreak = 0;
	name = newName;
	_bal = newBal;
    }

    public double checkBal(){
        return _bal;
    }

    public void win(double x){
	_winStreak += 1;
	_loseStreak = 0;
	_bal += x;
	System.out.println("You won " + x + " dollars!\n");
    }

    public void lose(double x){
	_loseStreak += 1;
	_winStreak = 0;
	_bal -= x;
	System.out.println("You lost " + x + " dollars...\n");
    }
}
