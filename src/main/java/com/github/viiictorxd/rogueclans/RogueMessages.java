package com.github.viiictorxd.rogueclans;

import java.io.File;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class RogueMessages {

    private final File file;
    private final Map<String, String> messages;

    public RogueMessages(RogueClans rogueClans) {
        this.file = new File(rogueClans.getDataFolder(), "messages.yml");
        if (file.exists())
            rogueClans.saveResource("messages.yml", false);

        this.messages = new HashMap<>();
    }

    public Map<String, String> getMessages() {
        return messages;
    }

    public String getMessage(String key, Object... parameters) {
        String message = messages.getOrDefault(key, "Invalid key: " + key);
        if (parameters != null
                && parameters.length > 0)
            message = MessageFormat.format(message, parameters);

        return message;
    }
}
