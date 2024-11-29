package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.User;

public class UserLoader {
    private final UserDeserializer deserializer;
    private final UserReader reader;
    private final UserAdapter adapter;

    public UserLoader(UserAdapter adapter, UserDeserializer deserializer, UserReader reader) {
        this.adapter = adapter;
        this.deserializer = deserializer;
        this.reader = reader;
    }

    public User getUser(){
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
