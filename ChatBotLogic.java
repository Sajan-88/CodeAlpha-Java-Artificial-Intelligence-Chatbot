import java.util.HashMap;
import java.util.Map;

public class ChatBotLogic {

    private Map<String, String> responses;

    public ChatBotLogic() {

        responses = new HashMap<>();

        responses.put("hello", "Hello! How can I assist you?");
        responses.put("hi", "Hi there!");
        responses.put("how are you", "I'm doing great. Thanks for asking!");
        responses.put("what is java", "Java is an object-oriented programming language.");
        responses.put("what is ai", "Artificial Intelligence enables machines to mimic human intelligence.");
        responses.put("what is oop", "OOP stands for Object-Oriented Programming.");
        responses.put("bye", "Goodbye! Have a great day.");
    }

    public String getResponse(String input) {

        input = input.toLowerCase();

        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                return responses.get(key);
            }
        }

        return "Sorry, I don't understand. Can you rephrase?";
    }
}
