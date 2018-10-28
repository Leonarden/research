package com.res.emorobot.streaming.remote;



import com.res.emorobot.streaming.action.ActionRequest;
import com.res.emorobot.streaming.interpreter.InterpreterRequest;

public class RemoteActionRequest extends RemoteRequest implements ActionRequest<Action,Problem> {

	Action actionRequest(Problem p, Action blocking);

}
