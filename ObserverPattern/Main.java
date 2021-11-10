package com.company;

import com.company.interfaces.Observer;
import com.company.model.EmailTopic;
import com.company.model.EmailSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        //create observers
        Observer firstObserver = new EmailSubscriber("First Observer");

        Observer secondObserver = new EmailSubscriber("Second Observer");

        Observer thirdObserver = new EmailSubscriber("Third Observer");

        //Register the observers
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //Check for updates
        firstObserver.update();
        secondObserver.update();

        //Providing message
        topic.postMessage("Hello Subscribers!");

        //Providing message excluding Second Observer
        topic.unregister(secondObserver);

        topic.postMessage("Hello Subscribers!");
    }
}
