/***********************************************
 * @ file WackyTales.java
 * @ brief This program allows users to pick their own words and the program will generate a Wacky Tale using these words.
 * @ author Jianqiu Xu (Tony)
 * @ date September 4, 2017
 ***********************************************/

import java.util.Scanner;

public class WackyTales {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String male;
        String female;
        String adj;
        String adv;
        String verb;
        String room;
        String aadv;
        String body;
        String sen;

        System.out.println("The Box");
        System.out.println("");
        System.out.print("Select a male friend: ");
        male = keyboard.next();
        System.out.print("Select a female friend: ");
        female = keyboard.next();
        System.out.print("Select an adjective: ");
        adj = keyboard.next();
        System.out.print("Select an adverb: ");
        adv = keyboard.next();
        System.out.print("Select a past tense verb: ");
        verb = keyboard.next();
        System.out.print("Select a room: ");
        room = keyboard.next();
        System.out.print("Select another adverb: ");
        aadv = keyboard.next();
        System.out.print("Select a body part: ");
        body = keyboard.next();
        System.out.print("Write an exclamation: ");
        sen = keyboard.next();
        System.out.println("");

        System.out.println("The doorbell rang. " + male + " and " + female + " raced to the door. There on the doorstep was an enormous, " + adj + " box. What could be inside? They " + adv + " " + verb + " the box into the " + room + ". " + female + " " + aadv + " put her " + body + " close to the box. She thought she heard a voice whisper, " + sen + "!");

        return;

    }
}
