/*
 * generated by Xtext 2.36.0-SNAPSHOT
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.myDsl.ClientCallback;
import org.xtext.example.mydsl.myDsl.Executor;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Node;
import org.xtext.example.mydsl.myDsl.PeriodicTimer;
import org.xtext.example.mydsl.myDsl.Publisher;
import org.xtext.example.mydsl.myDsl.Service;
import org.xtext.example.mydsl.myDsl.ServiceCallback;
import org.xtext.example.mydsl.myDsl.ServiceRequest;
import org.xtext.example.mydsl.myDsl.SubscriberCallback;
import org.xtext.example.mydsl.myDsl.SystemModel;
import org.xtext.example.mydsl.myDsl.TimerCallback;
import org.xtext.example.mydsl.myDsl.Topic;
import org.xtext.example.mydsl.myDsl.Walltimer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CLIENT_CALLBACK:
				sequence_ClientCallback(context, (ClientCallback) semanticObject); 
				return; 
			case MyDslPackage.EXECUTOR:
				sequence_Executor(context, (Executor) semanticObject); 
				return; 
			case MyDslPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case MyDslPackage.PERIODIC_TIMER:
				sequence_PeriodicTimer(context, (PeriodicTimer) semanticObject); 
				return; 
			case MyDslPackage.PUBLISHER:
				sequence_Publisher(context, (Publisher) semanticObject); 
				return; 
			case MyDslPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case MyDslPackage.SERVICE_CALLBACK:
				sequence_ServiceCallback(context, (ServiceCallback) semanticObject); 
				return; 
			case MyDslPackage.SERVICE_REQUEST:
				sequence_ServiceRequest(context, (ServiceRequest) semanticObject); 
				return; 
			case MyDslPackage.SUBSCRIBER_CALLBACK:
				sequence_SubscriberCallback(context, (SubscriberCallback) semanticObject); 
				return; 
			case MyDslPackage.SYSTEM:
				sequence_System(context, (org.xtext.example.mydsl.myDsl.System) semanticObject); 
				return; 
			case MyDslPackage.SYSTEM_MODEL:
				sequence_SystemModel(context, (SystemModel) semanticObject); 
				return; 
			case MyDslPackage.TIMER_CALLBACK:
				sequence_TimerCallback(context, (TimerCallback) semanticObject); 
				return; 
			case MyDslPackage.TOPIC:
				sequence_Topic(context, (Topic) semanticObject); 
				return; 
			case MyDslPackage.WALLTIMER:
				sequence_Walltimer(context, (Walltimer) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Callback returns ClientCallback
	 *     ClientCallback returns ClientCallback
	 *
	 * Constraint:
	 *     (bufferSize=INT name=ID executedIn+=[Executor|ID]* executionTime=INT?)
	 * </pre>
	 */
	protected void sequence_ClientCallback(ISerializationContext context, ClientCallback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Executor returns Executor
	 *
	 * Constraint:
	 *     (name=ID type=ExecutorType executed+=[Callback|ID]*)
	 * </pre>
	 */
	protected void sequence_Executor(ISerializationContext context, Executor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Node returns Node
	 *
	 * Constraint:
	 *     (
	 *         NodeName=STRING 
	 *         publishers+=Publisher* 
	 *         subscribers+=SubscriberCallback* 
	 *         services+=ServiceCallback* 
	 *         servicerequests+=ServiceRequest* 
	 *         clients+=ClientCallback* 
	 *         timers+=TimerCallback*
	 *     )
	 * </pre>
	 */
	protected void sequence_Node(ISerializationContext context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SystemTimer returns PeriodicTimer
	 *     PeriodicTimer returns PeriodicTimer
	 *
	 * Constraint:
	 *     (period=INT name=STRING from=[TimerCallback|ID] systemtimer+=SystemTimer*)
	 * </pre>
	 */
	protected void sequence_PeriodicTimer(ISerializationContext context, PeriodicTimer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Publisher returns Publisher
	 *
	 * Constraint:
	 *     (name=ID publishes+=[Topic|ID]+ bufferSize=INT)
	 * </pre>
	 */
	protected void sequence_Publisher(ISerializationContext context, Publisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Callback returns ServiceCallback
	 *     ServiceCallback returns ServiceCallback
	 *
	 * Constraint:
	 *     (bufferSize=INT name=ID service=[Service|ID]? executedIn+=[Executor|ID]* executionTime=INT?)
	 * </pre>
	 */
	protected void sequence_ServiceCallback(ISerializationContext context, ServiceCallback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ServiceRequest returns ServiceRequest
	 *
	 * Constraint:
	 *     (name=ID service=[Service|ID]?)
	 * </pre>
	 */
	protected void sequence_ServiceRequest(ISerializationContext context, ServiceRequest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (name=ID serviceReq=[ServiceRequest|ID]? clientCAll=[ClientCallback|ID]? serviceCAll=[ServiceCallback|ID]?)
	 * </pre>
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Callback returns SubscriberCallback
	 *     SubscriberCallback returns SubscriberCallback
	 *
	 * Constraint:
	 *     (bufferSize=INT name=ID subscribesTo+=[Topic|ID]* executedIn+=[Executor|ID]* executionTime=INT?)
	 * </pre>
	 */
	protected void sequence_SubscriberCallback(ISerializationContext context, SubscriberCallback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SystemModel returns SystemModel
	 *
	 * Constraint:
	 *     systems+=System+
	 * </pre>
	 */
	protected void sequence_SystemModel(ISerializationContext context, SystemModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     (
	 *         SystemName=STRING 
	 *         nodes+=Node+ 
	 *         topics+=Topic* 
	 *         executors+=Executor+ 
	 *         services+=Service* 
	 *         periodictimers+=PeriodicTimer* 
	 *         walltimers+=Walltimer*
	 *     )
	 * </pre>
	 */
	protected void sequence_System(ISerializationContext context, org.xtext.example.mydsl.myDsl.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Callback returns TimerCallback
	 *     TimerCallback returns TimerCallback
	 *
	 * Constraint:
	 *     (bufferSize=INT name=ID executedIn+=[Executor|ID]* of=[SystemTimer|STRING]? executionTime=INT?)
	 * </pre>
	 */
	protected void sequence_TimerCallback(ISerializationContext context, TimerCallback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Topic returns Topic
	 *
	 * Constraint:
	 *     (name=ID published+=[Publisher|ID]* subscribed+=[SubscriberCallback|ID]*)
	 * </pre>
	 */
	protected void sequence_Topic(ISerializationContext context, Topic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SystemTimer returns Walltimer
	 *     Walltimer returns Walltimer
	 *
	 * Constraint:
	 *     (releaseTimes=INT name=STRING from=[TimerCallback|ID] systemtimer+=SystemTimer*)
	 * </pre>
	 */
	protected void sequence_Walltimer(ISerializationContext context, Walltimer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
