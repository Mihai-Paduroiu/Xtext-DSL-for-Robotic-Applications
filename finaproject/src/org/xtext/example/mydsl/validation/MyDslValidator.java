/*
 * generated by Xtext 2.34.0-SNAPSHOT


 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.List;
import java.util.Set;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Node;
import org.xtext.example.mydsl.myDsl.System;
import org.xtext.example.mydsl.myDsl.SystemModel;
import org.xtext.example.mydsl.myDsl.Executor;
import org.xtext.example.mydsl.myDsl.SubscriberCallback;
import org.xtext.example.mydsl.myDsl.ServiceCallback;
import org.xtext.example.mydsl.myDsl.ClientCallback;
import org.xtext.example.mydsl.myDsl.TimerCallback;
import org.xtext.example.mydsl.myDsl.Publisher;
import org.xtext.example.mydsl.myDsl.Topic;
import org.xtext.example.mydsl.myDsl.Callback;



/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
	public static final String INVALID_NAME = "invalidName";
	
@Check 
	public void checkSystem(System system) {
			if(system.getSystemName().isBlank()) {
				error("System must have a name", MyDslPackage.Literals.SYSTEM__SYSTEM_NAME, INVALID_NAME);
		}
			if(Character.isLowerCase(system.getSystemName().charAt(0))) {
				warning("Name should start with a capital", MyDslPackage.Literals.SYSTEM__SYSTEM_NAME, INVALID_NAME);
	}
}
	

@Check
public void checkSystemHasAtLeastOneNode(System system) {
    if (system.getNodes().isEmpty()) {
        warning("A system must have at least one node", MyDslPackage.Literals.SYSTEM__NODES);
    }
}


@Check
public void checkSystemHasExecutors(System system) {
    if (system.getExecutors().isEmpty()) {
        warning("A system must have at least one executor", MyDslPackage.Literals.SYSTEM__EXECUTORS);
    }
}



public static final String DUP_EXECUTOR_NAME = "dupExecutorName";

@Check
public void checkExecutorNamesUnique(SystemModel model) {
    Set<String> names = new HashSet<>();
    for (System system : model.getSystems()) {
        for (Executor executor : system.getExecutors()) {
            if (!names.add(executor.getName())) {
                error("Duplicate Executor name: " + executor.getName() + ". This could lead to referencing problems",
                      executor,
                      MyDslPackage.Literals.EXECUTOR__NAME, DUP_EXECUTOR_NAME);
            }
        }
    }
}
  
public static final String DUP_SUBSCRIBERCALLBACK_NAME = "dupSubscriberCallbackName";

@Check
public void checkDuplicateSubscriberCallbackNames(SystemModel model) {
    Set<String> subscriberCallbackNames = new HashSet<>();
    for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            for (SubscriberCallback callback : node.getSubscribers()) {
                if (!subscriberCallbackNames.add(callback.getName())) {
                    error("Duplicate SubscriberCallback name: " + callback.getName() + 
                    	      ". This could lead to referencing problems.",
                    	      callback,
                    	      null, 
                    	      DUP_SUBSCRIBERCALLBACK_NAME);
                }
            }
        }
    }
}

public static final String DUP_SERVICECALLBACK_NAME = "dupServiceCallbackName";

@Check
public void checkDuplicateServiceCallbackNames(SystemModel model) {
    Set<String> serviceCallbackNames = new HashSet<>();
    for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            for (ServiceCallback callback : node.getServices()) {
                if (!serviceCallbackNames.add(callback.getName())) {
                    error("Duplicate ServiceCallback name: " + callback.getName() + 
                    		". This could lead to referencing problems.",
                          callback,
                          null, 
                          DUP_SERVICECALLBACK_NAME);
                }
            }
        }
    }
}

public static final String DUP_CLIENTCALLBACK_NAME = "dupClientCallbackName";

@Check
public void checkDuplicateClientCallbackNames(SystemModel model) {
    Set<String> clientCallbackNames = new HashSet<>();
    for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            for (ClientCallback callback : node.getClients()) {
                if (!clientCallbackNames.add(callback.getName())) {
                    error("Duplicate ClientCallback name: " + callback.getName() + 
                    		". This could lead to referencing problems.",
                          callback,
                          null,
                          DUP_CLIENTCALLBACK_NAME);
                }
            }
        }
    }
}



public static final String DUP_TIMERCALLBACK_NAME = "dupTimerCallbackName";

@Check
public void checkDuplicateTimerCallbackNames(SystemModel model) {
    Set<String> timerCallbackNames = new HashSet<>();
    for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            for (TimerCallback callback : node.getTimers()) {
                if (!timerCallbackNames.add(callback.getName())) {
                    error("Duplicate TimerCallback name: " + callback.getName() + 
                    		". This could lead to referencing problems.",
                          callback,
                          null,
                          DUP_TIMERCALLBACK_NAME);
                }
            }
        }
    }
}

private static final String MISSING_TOPIC_PUBLISHER_REFERENCE = "missingTopicPublisherReference";

@Check
public void checkPublishersReferenceBackToTopics(SystemModel model) {
    for (System system : model.getSystems()) {
        for (Topic topic : system.getTopics()) {
            for (Publisher publisher : topic.getPublished()) {
                if (!publisher.getPublishes().contains(topic)) {
                    error("The '" + publisher.getName() + "' has to reference '" + topic.getName() + "'.",
                          publisher, 									
                          MyDslPackage.Literals.PUBLISHER__PUBLISHES,	 
                          MISSING_TOPIC_PUBLISHER_REFERENCE);
                }
            }
        }
    }
}

private static final String MISSING_PUBLISHER_TOPIC_BACK_REFERENCE = "missingPublisherTopicBackReference";

@Check
public void checkTopicsReferenceBackToPublishers(SystemModel model) {
    for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            for (Publisher publisher : node.getPublishers()) {
                for (Topic topic : publisher.getPublishes()) {
                    if (!topic.getPublished().contains(publisher)) {
                        error("The Topic '" + topic.getName() + "' does not reference back the Publisher '" + publisher.getName() + "'.",
                              topic,										 // the EObject with the issue
                              MyDslPackage.Literals.TOPIC__PUBLISHED,		 // the feature with the issue
                              MISSING_PUBLISHER_TOPIC_BACK_REFERENCE);
                    }
                }
            }
        }
    }
}

private static final String MISSING_EXECUTOR_CALLBACK_BACK_REFERENCE = "missingExecutorCallbackBackReference";

@Check
public void checkExecutorsReferenceBackToCallbacks(SystemModel model) {
    for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            // Collect all callbacks in the node
            List<Callback> allCallbacks = new ArrayList<>();
            allCallbacks.addAll(node.getSubscribers());
            allCallbacks.addAll(node.getServices());
            allCallbacks.addAll(node.getClients());
            allCallbacks.addAll(node.getTimers());

            for (Callback callback : allCallbacks) {
                for (Executor executor : callback.getExecutedIn()) {
                    if (!executor.getExecuted().contains(callback)) {
                        error("The Executor '" + executor.getName() + "' does not reference back the Callback '" + callback.getName() + "'.",
                              executor, 
                              MyDslPackage.Literals.EXECUTOR__EXECUTED, 
                              MISSING_EXECUTOR_CALLBACK_BACK_REFERENCE);
                    }
                }
            }
        }
    }
}

private static final String MISSING_CALLBACK_EXECUTOR_BACK_REFERENCE = "missingCallbackExecutorBackReference";

@Check
public void checkCallbacksReferenceBackToExecutors(SystemModel model) {
    for (System system : model.getSystems()) {  							//iterate through all systems, 'System' is type of the item, and 'system' is the variable that contains it.
        for (Executor executor : system.getExecutors()) { 					//taking the first system, we iterate through its executors
            for (Callback callback : executor.getExecuted()) {				//and through each executor's references to existing instances of callbacks
                if (!callback.getExecutedIn().contains(executor)) {			//check if the executor that references callback, is NOT(!) in the list of executors referenced by the callback
                    error("The Callback '" + callback.getName() + "' must reference back the Executor '" + executor.getName() + "'.",
                    callback,										 		// where the framework needs to show the error(localise)
                          MyDslPackage.Literals.CALLBACK__EXECUTED_IN, 		// the feature with the issue
                          MISSING_CALLBACK_EXECUTOR_BACK_REFERENCE);
                }
            }
        }
    }
}

private static final String MISSING_SUBSCRIBER_CALLBACK_TOPIC_REFERENCE = "missingSubscriberCallbackTopicReference";
@Check
public void checkSubscriberCallbacksReferencedByTopics(SystemModel model) {
	for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            for (SubscriberCallback subscriberCallback : node.getSubscribers()) {
                for (Topic topic : subscriberCallback.getSubscribesTo()) {  // Iterate over the list of topics
                    if (!topic.getSubscribed().contains(subscriberCallback)) {
                        error("The SubscriberCallback '" + subscriberCallback.getName() + 
                              "' subscribes to the Topic '" + topic.getName() + 
                              "' but is not referenced back by the Topic.",
                              topic,
                              MyDslPackage.Literals.TOPIC__SUBSCRIBED,
                              MISSING_SUBSCRIBER_CALLBACK_TOPIC_REFERENCE);
                    }
                }
            }
        }
    }
}


private static final String MISSING_TOPIC_SUBSCRIBER_CALLBACK_REFERENCE = "missingTopicSubscriberCallbackReference";

@Check
public void checkTopicsReferencedBySubscriberCallbacks(SystemModel model) {
    for (System system : model.getSystems()) {
        for (Topic topic : system.getTopics()) {
            for (SubscriberCallback subscriberCallback : topic.getSubscribed()) {
                if (!subscriberCallback.getSubscribesTo().contains(topic)) {
                    error("The Topic '" + topic.getName() + "' is claimed to be subscribed by SubscriberCallback '" + 
                          subscriberCallback.getName() + "' but does not reference it correctly.",
                          subscriberCallback,
                          MyDslPackage.Literals.SUBSCRIBER_CALLBACK__SUBSCRIBES_TO, // Update this reference based on your model
                          MISSING_TOPIC_SUBSCRIBER_CALLBACK_REFERENCE);
                }
            }
        }
    }
}
	 

/*
private static final String MISSING_PUBLISHER_TOPIC_REFERENCE = "missingPublisherTopicReference";

@Check
public void checkPublishersAndTopicsReferenceEachOther1(SystemModel model) {
    for (System system : model.getSystems()) {
        for (Node node : system.getNodes()) {
            for (Publisher publisher : node.getPublishers()) {
                List<Topic> publishedTopics = publisher.getPublishes(); // Assuming this is now a List

                // Check if all topics in publishedTopics list reference this publisher
                if (publishedTopics != null) {
                    for (Topic topic : publishedTopics) {
                        if (!topic.getPublished().contains(publisher)) {
                            error("The Topic '" + topic.getName() + "' does not reference back to the Publisher '" + publisher.getName() + "'.",
                                  publisher,
                                  MyDslPackage.Literals.PUBLISHER__PUBLISHES,
                                  MISSING_PUBLISHER_TOPIC_REFERENCE);
                        }
                    }
                }

                // Check if there are any topics referencing this publisher that are not in the publisher's publishedTopics list
                for (Topic topic : system.getTopics()) {
                    if (topic.getPublished().contains(publisher) && (publishedTopics == null || !publishedTopics.contains(topic))) {
                        error("The Publisher '" + publisher.getName() + "' does not reference the Topic '" + topic.getName() + "' that references it.",
                              topic,
                              MyDslPackage.Literals.TOPIC__PUBLISHED,
                              MISSING_PUBLISHER_TOPIC_REFERENCE);
                    }
                }
            }
        }
    }
}
*/

}
