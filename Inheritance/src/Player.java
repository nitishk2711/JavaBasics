
public class Player {
	String name,team;
	int jerseyno;
	
	public Player(String name, String team, int jerseyNo) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.team = team;
		this.jerseyno = jerseyNo;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+team+" "+jerseyno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1= new Player("Virat","India",07);
		Player p2= new Player("dhoni","India",02);
		Player p3= new Player("yuvraj","India",05);
		Player x[]= {p1,p2,p3};
		for(int i=0;i<=x.length;i++) {
			System.out.println(x[i]);
			
		}
	}

}
