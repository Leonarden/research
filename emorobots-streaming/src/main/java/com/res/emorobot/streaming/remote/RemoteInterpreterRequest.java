package com.res.emorobot.streaming.remote;

import com.res.emorobot.streaming.interpreter.InterpreterRequest;

public class RemoteInterpreterRequest implements InterpreterRequest<Interpreter,Solution> {

	Interpreter interpreterRequest(Solution s);

}
