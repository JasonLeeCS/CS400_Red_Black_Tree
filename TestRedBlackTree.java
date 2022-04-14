// --== CS400 Project One File Header ==--
// Name: Jason Lee
// Email: jlee967@wisc.edu
// Team: blue
// Group: CI
// TA: Harper
// Lecturer: Florian
// Notes to Grader: <optional extra notes>
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRedBlackTree
{
  
  @Test
  public void testInsertionWhenParentIsBlack() // Case 1 (When parent is black)
  {
    RedBlackTree <Integer> rbt = new RedBlackTree<>();
    rbt.insert(10);
    rbt.insert(5);
    rbt.insert(15);
    
    String expected = "[10, 5, 15]";
    if(rbt.root.isBlack && !rbt.root.leftChild.isBlack && !rbt.root.rightChild.isBlack);
    {
      assertEquals(rbt.root.toString(), expected);
    }
  }
  
  @Test
  public void testInsertionWhenParentIsRed() // Case 2 (When parent is red)
  {
    RedBlackTree <Integer> rbt = new RedBlackTree<>();
    rbt.insert(7);
    rbt.insert(14);
    rbt.insert(18);
    rbt.insert(23);
    
    String expected = "[14, 7, 18, 23]";
//    System.out.println(rbt.root.isBlack);
//    System.out.println(rbt.root.leftChild.isBlack);
//    System.out.println(!rbt.root.rightChild.rightChild.isBlack);
//    System.out.println(rbt.root.rightChild.rightChild.parent.isBlack);

    if(rbt.root.isBlack && rbt.root.leftChild.isBlack
        && rbt.root.rightChild.rightChild.parent.isBlack && !rbt.root.rightChild.rightChild.isBlack)
    {
      assertEquals(rbt.root.toString(), expected);
    }
  }

  @Test
  public void testInsertionWhenSiblingIsBlackOrNull() // When P's sibling is black (or null)
  {
    RedBlackTree <Integer> rbt = new RedBlackTree<>();
    rbt.insert(10);
    rbt.insert(5);
    rbt.insert(2);
    
    String expected = "[5, 2, 10]";
    if(rbt.root.isBlack && !rbt.root.leftChild.isBlack && !rbt.root.rightChild.isBlack)
    {
      assertEquals(rbt.root.toString(), expected);
    }
  }

  @Test
  public void testInsertionWhenSiblingIsRed() // When P's sibling is red
  {
    RedBlackTree <Integer> rbt = new RedBlackTree<>();
    rbt.insert(50);
    rbt.insert(30);
    rbt.insert(45);
    rbt.insert(15);
    System.out.println(rbt.root.toString());
    System.out.println(rbt.root.rightChild.leftChild);
    String expected = "[30, 15, 50, 45]";
    if(rbt.root.isBlack && rbt.root.leftChild.parent.isBlack
        && rbt.root.rightChild.isBlack && !rbt.root.rightChild.leftChild.isBlack)
    {
      assertEquals(rbt.root.toString(), expected);
    }
  }
}

