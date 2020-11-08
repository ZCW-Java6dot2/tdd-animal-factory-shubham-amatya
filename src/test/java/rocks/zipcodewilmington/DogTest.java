package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;

    @Before
    public void setUp(){
        this.dog = new Dog(null, null, null);

    }

    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";
        // When (a dog's name is set to the given name)
        dog.setName(givenName);
        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test

    public void testSpeak(){
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}
