package org.blitmatthew;

import org.blitmatthew.entity.Content;
import org.blitmatthew.entity.User;
import org.blitmatthew.service.StreamingPlatform;

public class Main {
    public static void main(String[] args) {
        StreamingPlatform platform = new StreamingPlatform();

        // Add sample data
        Content movie1 = new Content("1", "The Matrix", "Sci-Fi", 1999);
        Content movie2 = new Content("2", "Inception", "Sci-Fi", 2010);
        Content show1 = new Content("3", "Breaking Bad", "Drama", 2008);

        User user1 = new User("U1", "john_doe");
        User user2 = new User("U2", "jane_smith");

        // Add to platform
        platform.addContent(movie1);
        platform.addContent(movie2);
        platform.addContent(show1);
        platform.addUser(user1);
        platform.addUser(user2);

        // TODO: Implement test cases for each day's tasks
    }
}