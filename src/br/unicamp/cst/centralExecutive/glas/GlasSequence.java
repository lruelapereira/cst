/**
 * 
 */
package br.unicamp.cst.centralExecutive.glas;

import java.util.ArrayList;

/**
 * @author Klaus Raizer
 *
 */
public class GlasSequence {

	private ArrayList<GlasEvent> events= new ArrayList<GlasEvent>();

	public void clearAllEvents(){
		events.clear();
	}

	public void addEvent(GlasEvent event) {
		events.add(event);
	}

	public void removeEvent(int index){
		events.remove(index);
	}

	/**
	 * @return the events
	 */
	public ArrayList<GlasEvent> getEvents() {
		ArrayList<GlasEvent> newEvents= new ArrayList<GlasEvent>();
		newEvents.addAll(events);
		return newEvents;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(ArrayList<GlasEvent> events) {		
		this.events = events;
	}

	public void addAll(GlasSequence given_sequence) {
		ArrayList<GlasEvent> local_events = given_sequence.getEvents();

		for(GlasEvent ev : local_events){
			this.addEvent(ev);
		}

	}

	/**
	 *  Calculates the number of stimuli in this sequence.
	 *  The number of stimuli is estimated as being the largest integer number present in the current sequence list of stimuli, plus one
	 * @return the number of stimuli in this sequence
	 */
	public int getNStimuli() {

		int nStimuli=0;
		for(int i = 0; i<this.getEvents().size();i++){
			int stim = this.getEvents().get(i).getStimulus();
			if(stim>nStimuli){
				nStimuli=stim;
			}
		}

		nStimuli=nStimuli+1;
		return nStimuli;
	}

	/**
	 *  Calculates the number of actions in this sequence.
	 *  The number of actions is estimated as being the largest integer number present in the current sequence list of actions, plus one
	 * @return the number of actions in this sequence
	 */
	public int getNActions() {

		int nActions=0;
		for(int i = 0; i<this.getEvents().size();i++){
			int act = this.getEvents().get(i).getAction();
			if(act>nActions){
				nActions=act;
			}
		}
		nActions=nActions+1;
		return nActions;
	}



}
