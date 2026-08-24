package OOP.oop14_aggregation;

public class TeamDemo {

    public static void main(String[] args){

        Player player1 = new Player("Shamol",20);
        Player player2 = new Player("Mahadi",23);
        Player player3 = new Player("Himel",22);

        Player[] players = {player1,player2,player3};

        Team team = new Team ("DFA",players);

        team.showTeamInfo();

    }
}
