package com.res.memento;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	List<MilleTrackerMemento> tracks;
	int[] difficulty = {5,3,2};
	

	public void run(int ntracks, int diff) {
		tracks = new ArrayList<MilleTrackerMemento>(ntracks);
		for(int i=0;i<ntracks;i++) {
		MilleTracker mt = new MilleTracker();
		tracks.add(mt.createMemento());
		MilleTrackerMemento mtm = tracks.get(i);
		
		if( i % diff == 0)
			mtm.set
	}
	
}

