package com.apple.jobjc.appkit;

public  class NSPredicateEditorRowTemplateClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPredicateEditorRowTemplateClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPredicateEditorRowTemplateClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPredicateEditorRowTemplateClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend templatesWithAttributeKeyPaths_inEntityDescription_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_templatesWithAttributeKeyPaths_inEntityDescription_CMetInst(){
		return ((templatesWithAttributeKeyPaths_inEntityDescription_CMetInst != null)
	? (templatesWithAttributeKeyPaths_inEntityDescription_CMetInst)
	: (templatesWithAttributeKeyPaths_inEntityDescription_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "templatesWithAttributeKeyPaths:inEntityDescription:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray templatesWithAttributeKeyPaths_inEntityDescription(final com.apple.jobjc.foundation.NSArray keyPaths, final Object /* NSEntityDescription* (@, @) */ entityDescription){
			final com.apple.jobjc.Invoke.MsgSend templatesWithAttributeKeyPaths_inEntityDescription_CMetInst = get_templatesWithAttributeKeyPaths_inEntityDescription_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		templatesWithAttributeKeyPaths_inEntityDescription_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPaths);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, entityDescription);
		templatesWithAttributeKeyPaths_inEntityDescription_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
