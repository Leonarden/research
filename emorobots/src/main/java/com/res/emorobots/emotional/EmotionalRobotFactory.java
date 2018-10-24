package com.res.emorobots.emotional;

import java.util.Collection;
import java.util.List;

import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;

public class EmotionalRobotFactory {
	EmotionalRobot rem = null;
	
	public static EmotionalRobot getInstance(Long type,List<Order> data) {
			EmotionalRobot r = null;
		if(type == 0) {
			r  = new EmotionalRobotImpl(data);
		}else
			if(type == 1) {
				
			}
		return r;
	}

}
