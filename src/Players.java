public enum Players {
    CirclePlayer("O", "CirclePlayer"),
    CrossPlayer("X","CrossPlayer");

    String symbol;
    String name;
    Players(String symbol,String name) {
        this.name= name;
        this.symbol = symbol;
    }
}
