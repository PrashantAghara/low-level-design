package dp.flyweight.wordprocessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static final Map<Character, Letter> characterCache = new HashMap<>();

    public static Letter crateLetter(char characterValue) {
        if (characterCache.containsKey(characterValue)) {
            // if exists, return the cached character object.
            return characterCache.get(characterValue);
        } else {
            // if not exists, create the character object and cache it.
            DocumentCharacter characterObj = new DocumentCharacter(characterValue, "Arial", 10);
            // add to cache
            characterCache.put(characterValue, characterObj);
            return characterObj;
        }
    }

    public static int getTotalCharacters() {
        return characterCache.size();
    }
}
