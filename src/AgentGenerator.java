public class AgentGenerator {

    private static final String[] AGENTS = {"Astra", "Breach", "Brimstone", "Chamber", "Clove", "Cypher",
            "Deadlock", "Fade", "Gekko", "Harbor", "Iso", "Jett", "KA/YO", "KillJoy", "Neon", "Omen",
            "Phoenix", "Raze", "Reyna", "Sage", "Skye", "Sova", "Tejo", "Veto", "Viper", "Vyse", "Waylay", "Yoru"};


    public static String generateAgent() {
        return AGENTS[(int)(Math.random()*28)];
    }

}
