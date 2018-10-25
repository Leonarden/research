package com.res.emorobots.action;

import java.util.Collection;
import java.util.List;

import  com.res.emorobots.emotional.EmotionalRobot;
import com.res.emorobots.emotional.EmotionalRobotFactory;
import com.res.emorobots.sentence.Order;

public class RobotAction extends BalancedAction{
EmotionalRobot bemotional = null;

   public RobotAction(List<Order<Collection<RobotCommandProxy>>> d ) {
	   this.data = d;
	   this.type = 0; //basic
	   this.bemotional = EmotionalRobotFactory.getInstance(this.type,this.data);
   }
   public RobotAction(Long type) {
	   this.type = type;
	   this.bemotional = EmotionalRobotFactory.getInstance(this.type,this.data);
   }
	public RobotAction(Long type,Collection<?> d) {
		this.type = type;
		this.data = (List<Order<Collection<RobotCommandProxy>>>) d;
		this.bemotional = EmotionalRobotFactory.getInstance(this.type,this.data);
	}

	
}
