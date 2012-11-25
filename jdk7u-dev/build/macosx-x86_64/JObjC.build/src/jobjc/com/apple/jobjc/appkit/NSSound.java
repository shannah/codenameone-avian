package com.apple.jobjc.appkit;

public  class NSSound extends com.apple.jobjc.foundation.NSObject {
	public NSSound(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSound(final NSSound obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend channelMapping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_channelMapping_IMetInst(){
		return ((channelMapping_IMetInst != null)
	? (channelMapping_IMetInst)
	: (channelMapping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "channelMapping", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray channelMapping(){
			final com.apple.jobjc.Invoke.MsgSend channelMapping_IMetInst = get_channelMapping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		channelMapping_IMetInst.init(nativeBuffer, this);
		channelMapping_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentTime_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentTime_IMetInst(){
		return ((currentTime_IMetInst != null)
	? (currentTime_IMetInst)
	: (currentTime_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentTime", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double currentTime(){
			final com.apple.jobjc.Invoke.MsgSend currentTime_IMetInst = get_currentTime_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentTime_IMetInst.init(nativeBuffer, this);
		currentTime_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend duration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duration_IMetInst(){
		return ((duration_IMetInst != null)
	? (duration_IMetInst)
	: (duration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duration", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double duration(){
			final com.apple.jobjc.Invoke.MsgSend duration_IMetInst = get_duration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duration_IMetInst.init(nativeBuffer, this);
		duration_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_byReference_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_byReference_IMetInst(){
		return ((initWithContentsOfFile_byReference_IMetInst != null)
	? (initWithContentsOfFile_byReference_IMetInst)
	: (initWithContentsOfFile_byReference_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:byReference:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile_byReference(final com.apple.jobjc.foundation.NSString path, final boolean byRef){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_byReference_IMetInst = get_initWithContentsOfFile_byReference_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_byReference_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, byRef);
		initWithContentsOfFile_byReference_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_byReference_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_byReference_IMetInst(){
		return ((initWithContentsOfURL_byReference_IMetInst != null)
	? (initWithContentsOfURL_byReference_IMetInst)
	: (initWithContentsOfURL_byReference_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:byReference:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_byReference(final com.apple.jobjc.foundation.NSURL url, final boolean byRef){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_byReference_IMetInst = get_initWithContentsOfURL_byReference_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_byReference_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, byRef);
		initWithContentsOfURL_byReference_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_IMetInst(){
		return ((initWithData_IMetInst != null)
	? (initWithData_IMetInst)
	: (initWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPasteboard_IMetInst(){
		return ((initWithPasteboard_IMetInst != null)
	? (initWithPasteboard_IMetInst)
	: (initWithPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend initWithPasteboard_IMetInst = get_initWithPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		initWithPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isPlaying_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isPlaying_IMetInst(){
		return ((isPlaying_IMetInst != null)
	? (isPlaying_IMetInst)
	: (isPlaying_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isPlaying", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isPlaying(){
			final com.apple.jobjc.Invoke.MsgSend isPlaying_IMetInst = get_isPlaying_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isPlaying_IMetInst.init(nativeBuffer, this);
		isPlaying_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loops_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loops_IMetInst(){
		return ((loops_IMetInst != null)
	? (loops_IMetInst)
	: (loops_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loops", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean loops(){
			final com.apple.jobjc.Invoke.MsgSend loops_IMetInst = get_loops_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loops_IMetInst.init(nativeBuffer, this);
		loops_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pause_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pause_IMetInst(){
		return ((pause_IMetInst != null)
	? (pause_IMetInst)
	: (pause_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pause", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean pause(){
			final com.apple.jobjc.Invoke.MsgSend pause_IMetInst = get_pause_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pause_IMetInst.init(nativeBuffer, this);
		pause_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend play_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_play_IMetInst(){
		return ((play_IMetInst != null)
	? (play_IMetInst)
	: (play_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "play", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean play(){
			final com.apple.jobjc.Invoke.MsgSend play_IMetInst = get_play_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		play_IMetInst.init(nativeBuffer, this);
		play_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend playbackDeviceIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_playbackDeviceIdentifier_IMetInst(){
		return ((playbackDeviceIdentifier_IMetInst != null)
	? (playbackDeviceIdentifier_IMetInst)
	: (playbackDeviceIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "playbackDeviceIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString playbackDeviceIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend playbackDeviceIdentifier_IMetInst = get_playbackDeviceIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		playbackDeviceIdentifier_IMetInst.init(nativeBuffer, this);
		playbackDeviceIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resume_IMetInst(){
		return ((resume_IMetInst != null)
	? (resume_IMetInst)
	: (resume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resume", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean resume(){
			final com.apple.jobjc.Invoke.MsgSend resume_IMetInst = get_resume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resume_IMetInst.init(nativeBuffer, this);
		resume_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setChannelMapping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setChannelMapping_IMetInst(){
		return ((setChannelMapping_IMetInst != null)
	? (setChannelMapping_IMetInst)
	: (setChannelMapping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setChannelMapping:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setChannelMapping(final com.apple.jobjc.foundation.NSArray channelMapping){
			final com.apple.jobjc.Invoke.MsgSend setChannelMapping_IMetInst = get_setChannelMapping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setChannelMapping_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, channelMapping);
		setChannelMapping_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentTime_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentTime_IMetInst(){
		return ((setCurrentTime_IMetInst != null)
	? (setCurrentTime_IMetInst)
	: (setCurrentTime_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentTime:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setCurrentTime(final double seconds){
			final com.apple.jobjc.Invoke.MsgSend setCurrentTime_IMetInst = get_setCurrentTime_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentTime_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, seconds);
		setCurrentTime_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID aDelegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDelegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLoops_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLoops_IMetInst(){
		return ((setLoops_IMetInst != null)
	? (setLoops_IMetInst)
	: (setLoops_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLoops:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setLoops(final boolean val){
			final com.apple.jobjc.Invoke.MsgSend setLoops_IMetInst = get_setLoops_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLoops_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, val);
		setLoops_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setName_IMetInst(){
		return ((setName_IMetInst != null)
	? (setName_IMetInst)
	: (setName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setName:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setName(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setName_IMetInst = get_setName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setName_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPlaybackDeviceIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPlaybackDeviceIdentifier_IMetInst(){
		return ((setPlaybackDeviceIdentifier_IMetInst != null)
	? (setPlaybackDeviceIdentifier_IMetInst)
	: (setPlaybackDeviceIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPlaybackDeviceIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPlaybackDeviceIdentifier(final com.apple.jobjc.foundation.NSString deviceUID){
			final com.apple.jobjc.Invoke.MsgSend setPlaybackDeviceIdentifier_IMetInst = get_setPlaybackDeviceIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPlaybackDeviceIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, deviceUID);
		setPlaybackDeviceIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVolume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVolume_IMetInst(){
		return ((setVolume_IMetInst != null)
	? (setVolume_IMetInst)
	: (setVolume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVolume:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setVolume(final float volume){
			final com.apple.jobjc.Invoke.MsgSend setVolume_IMetInst = get_setVolume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVolume_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, volume);
		setVolume_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stop_IMetInst(){
		return ((stop_IMetInst != null)
	? (stop_IMetInst)
	: (stop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stop", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean stop(){
			final com.apple.jobjc.Invoke.MsgSend stop_IMetInst = get_stop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stop_IMetInst.init(nativeBuffer, this);
		stop_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend volume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_volume_IMetInst(){
		return ((volume_IMetInst != null)
	? (volume_IMetInst)
	: (volume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "volume", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float volume(){
			final com.apple.jobjc.Invoke.MsgSend volume_IMetInst = get_volume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		volume_IMetInst.init(nativeBuffer, this);
		volume_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToPasteboard_IMetInst(){
		return ((writeToPasteboard_IMetInst != null)
	? (writeToPasteboard_IMetInst)
	: (writeToPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToPasteboard:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void writeToPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend writeToPasteboard_IMetInst = get_writeToPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		writeToPasteboard_IMetInst.invoke(nativeBuffer);
		
		
	}

}
