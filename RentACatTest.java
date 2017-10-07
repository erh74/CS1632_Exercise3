import static org.junit.Assert.*;

import org.junit.*;

import org.mockito.*;
import java.util.ArrayList;


public class RentACatTest {


// Test the catExists() method by testing that an existing cat is found and returns true

  @Test
  public void testCatExistsExists(){
    //make an ArrayList of doubled cats
     ArrayList<Cat> arrListOfMockCats = new ArrayList<Cat>();
     //mock a cat class object
     Cat c1 = Mockito.mock(Cat.class);
     //stub the getId() method
     Mockito.when(c1.getId()).thenReturn(1);
     //add doubled cat to ArrayList
     arrListOfMockCats.add(c1);
     //create a Rent-A-Cat object
     RentACat rc = new RentACat();

     assertTrue(rc.catExists(1, arrListOfMockCats) == true);

  }

// Test the catExists() method by testing that a non-existant cat is not found and returns false
@Test
public void testCatExistsDoesntExist(){
  //make an ArrayList of doubled cats
   ArrayList<Cat> arrListOfMockCats = new ArrayList<Cat>();
   //mock a cat class object
   Cat c1 = Mockito.mock(Cat.class);
   //stub the getId() method
   Mockito.when(c1.getId()).thenReturn(2);
   //add doubled cat to ArrayList
   arrListOfMockCats.add(c1);
   //create a Rent-A-Cat object
   RentACat rc = new RentACat();

   assertTrue(rc.catExists(1, arrListOfMockCats) == false);

}

// Test the listCats() method by testing that a list of 2 cats is printed correctly
@Test
public void testListCatsGood(){
  //make an ArrayList of doubled cats
   ArrayList<Cat> arrListOfMockCats = new ArrayList<Cat>();
   //mock cat class objects
   Cat c1 = Mockito.mock(Cat.class);
   Cat c2 = Mockito.mock(Cat.class);
   Cat c3 = Mockito.mock(Cat.class);
   //add doubled cats to ArrayList
   arrListOfMockCats.add(c1);
   arrListOfMockCats.add(c2);
   arrListOfMockCats.add(c3);
   //stub the toString and getRented methods for each cat
   Mockito.when(c1.toString()).thenReturn("ID " + "1" + ". " + "cat1");
   Mockito.when(c2.toString()).thenReturn("ID " + "2" + ". " + "cat2");
   Mockito.when(c3.toString()).thenReturn("ID " + "3" + ". " + "cat3");
   Mockito.when(c1.getRented()).thenReturn(false);
   Mockito.when(c2.getRented()).thenReturn(false);
   Mockito.when(c3.getRented()).thenReturn(false);
   //create a Rent-A-Cat object
   RentACat rc = new RentACat();

   String result = c1.toString() + "\n" + c2.toString() + "\n"+ c3.toString() + "\n";

   assertEquals(result, rc.listCats(arrListOfMockCats));
}

// Test the listCats() method by testing that an empty list does not crash the program and just returns an empty list
  @Test
  public void testListCatsBad(){
    //make an empty ArrayList of doubled cats
     ArrayList<Cat> arrListOfMockCats = new ArrayList<Cat>();

     //create a Rent-A-Cat object
     RentACat rc = new RentACat();

     assertNotNull(rc.listCats(arrListOfMockCats));

  }

// Test the returnCat() method by testing that you are able to successfully return a rented cat
  @Test
  public void testReturnCatValid(){

  }

// Test the rentCat() method by testing that you cannot rent a cat that is already rented
  @Test
  public void testRentCatAlreadyRented(){

  }

  
}
