package net.codejava;
 
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
 
public class UserTest {
 
    @Test
public void testUsernameTooLong() {
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
                User user = new User();
                user.setName("Pablo Diego Jose Franciso Picasso");
            }
    );
 
    assertEquals("Username is too long", exception.getMessage());      
}
}