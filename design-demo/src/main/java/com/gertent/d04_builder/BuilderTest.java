package com.gertent.d04_builder;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public class BuilderTest {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
