package com.res.emorobot.streaming.remote;

package com.res.emorobot.streaming.remote;

import com.res.emorobot.streaming.interpreter.InterpreterRequest;

public class RemoteInterpreterRequest extends RemoteRequest implements ActionRequest<Action,Solution> {

	Action actionRequest(Solution s);

}
