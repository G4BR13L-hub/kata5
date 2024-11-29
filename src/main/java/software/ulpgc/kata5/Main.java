package software.ulpgc.kata5;

import software.ulpgc.kata5.io.RandomUserAdapter;
import software.ulpgc.kata5.io.RandomUserDeserializer;
import software.ulpgc.kata5.io.RandomUserReader;
import software.ulpgc.kata5.io.UserLoader;

public class Main {
    public static void main(String[] args) {
        UserLoader userLoader = new UserLoader(
                new RandomUserAdapter(),
                new RandomUserDeserializer(),
                 new RandomUserReader()
        );

        for (int i = 0; i < 10; i++) {
            System.out.println(userLoader.getUser().name());
        }
    }
}
