package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testAddDogs(){
        Dog expected = new Dog("Khuri", null, 99);
        DogHouse.add(expected);
        Integer id = expected.getId();
        Dog actual = DogHouse.getDogById(id);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDogById(){
        Dog d1 = new Dog("taki", null, 266);
        DogHouse.add(d1);
        Integer id = d1.getId();
        DogHouse.remove(id);
        Dog removedDog = DogHouse.getDogById(id);
        Assert.assertNull( removedDog);
    }

    @Test
    public void testRemoveDogDog(){
        Dog d2 = new Dog("Boggie", null, 977);
        DogHouse.add(d2);
        DogHouse.remove(d2);
        Dog removedDog = DogHouse.getDogById(977);
        Assert.assertNull(removedDog);

    }
    @Test
    public void testGetDogById(){
        Dog d3 = new Dog("Tigger", null, 101);
        DogHouse.add(d3);
        Integer id = d3.getId();
        Dog actualDog = DogHouse.getDogById(id);
        Assert.assertEquals(d3, actualDog);


    }


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
