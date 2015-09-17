//package com.team.jmaps.bookeatnow.domain.Restaurant;

public class Appreciation {

	private int numberOfUpVotes;
	private int numberOfDownVotes;
	private float globalRating;
	
	Appreciation(int upVotes, int downVotes, float globalRate){
		numberOfUpVotes = upVotes;
		numberOfDownVotes = downVotes;
		globalRating = globalRate;
	}
	
	private int getNumberOfUpVotes(){
		return numberOfUpVotes;
	}
	
	private int getNumberOfDownVotes(){
		return numberOfDownVotes;
	}
	
	private float getGlobalRating(){
		return numberOfUpVotes/(numberOfDownVotes+numberOfUpVotes);
	}
	
	private void setNumberOfUpVotes(int numberOfUp){
		numberOfUpVotes = numberOfUp;
	}
	
	private void setNumberOfDownVotes(int numberOfDown){
		numberOfDownVotes = numberOfDown;
	}
	
	void addPositiveVote(){
		setNumberOfUpVotes(numberOfUpVotes+1);
	}
	
	void addNegativeVote(){
		setNumberOfDownVotes(numberOfDownVotes+1);
	}
}

