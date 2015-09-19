//package com.team.jmaps.bookeatnow.domain.Restaurant;

public class Appreciation {

	private int numberOfUpVotes;
	private int numberOfDownVotes;
	private float globalRating;
	
	public Appreciation(int numberOfUpVotes, int numberOfDownVotes,
			float globalRating) {
		super();
		this.numberOfUpVotes = numberOfUpVotes;
		this.numberOfDownVotes = numberOfDownVotes;
		this.globalRating = globalRating;
	}

	public int getNumberOfUpVotes() {
		return numberOfUpVotes;
	}

	public void setNumberOfUpVotes(int numberOfUpVotes) {
		this.numberOfUpVotes = numberOfUpVotes;
	}

	public int getNumberOfDownVotes() {
		return numberOfDownVotes;
	}

	public void setNumberOfDownVotes(int numberOfDownVotes) {
		this.numberOfDownVotes = numberOfDownVotes;
	}

	public float getGlobalRating() {
		return globalRating;
	}

	public void setGlobalRating(float globalRating) {
		this.globalRating = globalRating;
	}
	
	
	
	
	
	
}

