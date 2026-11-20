
package inventory;

public class Emily extends NPC {

    private static final long serialVersionUID = 1L;

    private int conversationNumber = 0;

    public Emily() {
        super("Emily");
    }

    @Override
    public void talk() {

        switch (conversationNumber) {

            case 0:
                conversation1();
                break;

            case 1:
                conversation2();
                break;

            case 2:
                conversation3();
                break;

            case 3:
                conversation4();
                break;

            case 4:
                conversation5();
                break;
        }
    }

    private void conversation1() {

        say("Please! Is someone there? Can you help me?");

        String[] responses = {
            "Who are you?",
            "What happened to you?",
            "Do you know how to escape?"
        };

        int option = getResponse(responses);

        switch (option) {

            case 0:
                say("My name is Emily. I used to work as a researcher in this laboratory.");
                conversationNumber = 1;
                break;

            case 1:
                say("Someone caught me investigating this laboratory and locked me inside this cell.");
                conversationNumber = 2;
                break;

            case 2:
                say("I heard there is an Access Card hidden somewhere in this facility. It might help you unlock the doors.");
                conversationNumber = 3;
                break;

            case -1:
                say("Please don't leave me here...");
                break;
        }
    }

    private void conversation2() {

        say("I'm glad you're still here! There is something you should know about this laboratory.");

        String[] responses = {
            "Tell me more about yourself.",
            "Who locked you in here?",
            "I'll look for a way to escape."
        };

        int option = getResponse(responses);

        switch (option) {

            case 0:
                say("I worked here for years until I discovered something suspicious about the experiments being conducted.");
                conversationNumber = 2;
                break;

            case 1:
                say("I never saw their face. They attacked me from behind and locked the cell. I haven't seen them since.");
                conversationNumber = 3;
                break;

            case 2:
                say("Please find the Access Card. It might unlock important doors throughout the laboratory.");
                conversationNumber = 4;
                break;

            case -1:
                say("Please don't leave me here...");
                break;
        }
    }

    private void conversation3() {

        say("There is something else you should know. This laboratory was hiding secret research.");

        String[] responses = {
            "What kind of research?",
            "Do you know where the Access Card is?",
            "I'll keep investigating."
        };

        int option = getResponse(responses);

        switch (option) {

            case 0:
                say("They were experimenting with dangerous chemicals, but something went terribly wrong. I believe the experiments caused this entire disaster.");
                conversationNumber = 3;
                break;

            case 1:
                say("I believe the Access Card was stored in the Security Room. You should search there.");
                conversationNumber = 4;
                break;

            case 2:
                say("Be careful. The deeper you explore, the more dangerous this place becomes. There are secrets hidden throughout this facility.");
                conversationNumber = 4;
                break;

            case -1:
                say("Please don't leave me here...");
                break;
        }
    }

    private void conversation4() {

        say("Have you found anything useful yet? I really need your help.");

        String[] responses = {
            "I found out about the Access Card.",
            "Tell me about the basement.",
            "I'll keep looking."
        };

        int option = getResponse(responses);

        switch (option) {

            case 0:
                say("That's great! Once you find the Access Card, you might be able to unlock important laboratory doors.");
                conversationNumber = 4;
                break;

            case 1:
                say("I heard the basement contains some of the laboratory's secret research. Nobody is supposed to go down there. Please be careful if you explore it.");
                conversationNumber = 4;
                break;

            case 2:
                say("Thank you. Please don't give up. I don't want to be trapped here forever.");
                conversationNumber = 4;
                break;

            case -1:
                say("Please don't leave me here...");
                break;
        }
    }

    private void conversation5() {

        say("You're back! Have you found a way out of this place?");

        String[] responses = {
            "I'm still working on it.",
            "I think I'm getting closer.",
            "I'll come back later."
        };

        int option = getResponse(responses);

        switch (option) {

            case 0:
                say("I understand. Please keep searching. I know you can find a way to get us out of here!");
                break;

            case 1:
                say("That's wonderful news! I hope we can both escape soon. Please don't lose hope.");
                break;

            case 2:
                say("Okay. I'll be waiting here. Please don't forget about me!");
                break;

            case -1:
                say("Please don't leave me here...");
                break;
        }
    }
}
