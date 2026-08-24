package OOP.oop14_aggregation;

public class Team {

    String name;
    Player[] players;

    Team(String name,Player[] players){
        this.name = name;
        this.players = players;
    }

    void showTeamInfo() {
        System.out.println("Team name: "+name);
        System.out.println();
        System.out.println("*************");
        System.out.println("Players Info: ");
        System.out.println("*************");
        System.out.println();
        for(Player player : players){
            player.showPlayerInfo();
        }
    }
}
