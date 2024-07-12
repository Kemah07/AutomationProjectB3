package io.loop.test.day8;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T2_java_faker {

    @Test
    public void test() {
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.bothify(\"#??#\") = " + faker.bothify("#??#"));



    }
}
