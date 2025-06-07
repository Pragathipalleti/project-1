
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmojiMoodResponder {
    private Map<String, String> moodMap;

    public EmojiMoodResponder() {
        moodMap = new HashMap<>();
        moodMap.put("happy", "😊");
        moodMap.put("sad", "😔");
        moodMap.put("angry", "😠");
        moodMap.put("excited", "🤩");
        moodMap.put("bored", "😴");
    }

    public void respondToMood(String mood) {
        if (moodMap.containsKey(mood.toLowerCase())) {
            System.out.println("You seem to be feeling " + mood + ". Here's an emoji to match your mood: " + moodMap.get(mood.toLowerCase()));
        } else {
            System.out.println("I'm not sure I understand your mood. Can you try again?");
        }
    }

    public static void main(String[] args) {
        EmojiMoodResponder responder = new EmojiMoodResponder();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("How are you feeling today? (Type 'quit' to exit): ");
            String mood = scanner.nextLine();

            if (mood.equalsIgnoreCase("quit")) {
                break;
            }

            responder.respondToMood(mood);
        }

        scanner.close();
    }
}
