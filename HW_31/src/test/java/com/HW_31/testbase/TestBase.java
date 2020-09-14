package com.HW_31.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {

    @BeforeClass
    public static void init(){
        RestAssured.baseURI = "https://www.mixcloud.com";
    }
}
