/***********************************************
 * @ file HTMLgenerator.java
 * @ brief This program collect words picked by users, and generate a HTML script.
 * @ author Jianqiu Xu (Tony)
 * @ date September 4, 2017
 ***********************************************/

import java.util.Scanner;

public class HTMLgenerator {

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

        System.out.println("The Box HTMLgenerator");
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

        System.out.println("<!DOCTYPE html>");
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>Jianqiu Xu</h1>");
        System.out.println("<h2>My Wacky Tales</h2>");
        System.out.println("With words: " + male + ", " + female + ", " + adj + ", " + adv + ", " + verb + ", " + room + ", " + aadv + ", " + body + ", " + sen);
        System.out.println("");
        System.out.println("<h3>The Box</h3>");
        System.out.println("");
        System.out.println("The doorbell rang. " + male + " and " + female + " raced to the door. There on the doorstep was an enormous, " + adj + " box.");
        System.out.println("What could be inside? They " + adv + " " + verb + " the box into the " + room + ". " + female + " " + aadv + " put her " + body + " close to the box.");
        System.out.println("She thought she heard a voice whisper, " + sen + "!");
        System.out.println("");
        System.out.println("</body>");
        System.out.println("</html>");


        return;


    }



        }
