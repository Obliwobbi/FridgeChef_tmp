package io.github.mortenjenne.fridgechef.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseReaderTest {

    @Test
    void accountLogin() {
        //Arrange
        DatabaseReader dbReader = new DatabaseReader();
        boolean expected = true;

        //Act
        boolean actual = dbReader.accountLogin("fridge@chef.com","notNull123!");

        //Assert
        assertEquals(expected,actual);
        }
    }
