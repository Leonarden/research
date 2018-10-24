package com.res.emorobots.emotional;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.Preparable;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;

public interface Emotional<T extends Collection<Order>,T1 extends  Collection<Action<Collection<Order>>>> extends Preparable<T> {
// need to take into account statistical model

public T normalize(T d);

public T evaluateOrders(T orders);

public T1 evaluateActions(T1 actions);


}
