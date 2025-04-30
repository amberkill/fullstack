package edu.cscc.model;

import jakarta.persistence.Entity
;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Record {

	    @Id
	    @GeneratedValue(generator = "RECORDS_SEQ",strategy=GenerationType.SEQUENCE)
	    @SequenceGenerator(name = "RECORDS_SEQ",allocationSize=1)
	    public Long id;
	    public String title;
	    public String artist;
	    public String label;
	    public Integer releaseYear;
	    public Integer numberOfTracks;
	    public Integer size;
	    public boolean damaged;
	    
	    public Record() {}
	    
	 // Getters
	    public Long getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getArtist() {
	        return artist;
	    }

	    public String getLabel() {
	        return label;
	    }

	    public Integer getReleaseYear() {
	        return releaseYear;
	    }

	    public Integer getNumberOfTracks() {
	        return numberOfTracks;
	    }

	    public Integer getSize() {
	        return size;
	    }

	    public boolean isDamaged() {
	        return damaged;
	    }

	    // Setters
	    public void setId(Long id) {
	        this.id = id;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setArtist(String artist) {
	        this.artist = artist;
	    }

	    public void setLabel(String label) {
	        this.label = label;
	    }

	    public void setReleaseYear(Integer releaseYear) {
	        this.releaseYear = releaseYear;
	    }

	    public void setNumberOfTracks(Integer numberOfTracks) {
	        this.numberOfTracks = numberOfTracks;
	    }

	    public void setSize(Integer size) {
	        this.size = size;
	    }

	    public void setDamaged(boolean damaged) {
	        this.damaged = damaged;
	    }

}