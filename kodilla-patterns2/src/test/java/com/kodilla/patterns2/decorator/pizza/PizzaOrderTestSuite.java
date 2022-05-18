package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Buy a Margherita", description);
    }
    @Test
    public void testPizzaOrderWithMushroomAndHamGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }
    @Test
    public void testPizzaOrderWithMushroomAndHamGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Buy a Margherita + mushroom + ham", description);
    }
    @Test
    public void testPizzaOrderWithDoubleOlivesAndExtraCheeseGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(30), calculatedCost);
    }
    @Test
    public void testPizzaOrderWithDoubleOlivesAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Buy a Margherita + olives + olives + extra cheese", description);
    }
}
