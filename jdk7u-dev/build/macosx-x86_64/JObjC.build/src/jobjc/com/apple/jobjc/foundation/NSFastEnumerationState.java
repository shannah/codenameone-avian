package com.apple.jobjc.foundation;

public final class NSFastEnumerationState extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 64 : 32;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected NSFastEnumerationState newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSFastEnumerationState(runtime); }
	};

	NSFastEnumerationState(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSFastEnumerationState(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int STATE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long state(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + STATE_OFFSET));
return returnValue;
	}

	public void setState(final long state__){
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(getRuntime(), this.raw.bufferPtr + STATE_OFFSET, state__);
	}

	private static final int ITEMSPTR_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> itemsPtr(){
final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ITEMSPTR_OFFSET));
return returnValue;
	}

	public void setItemsPtr(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> itemsPtr__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + ITEMSPTR_OFFSET, itemsPtr__);
	}

	private static final int MUTATIONSPTR_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* null (^L, ^Q) */ mutationsPtr(){
final Object /* null (^L, ^Q) */ returnValue = (Object /* null (^L, ^Q) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + MUTATIONSPTR_OFFSET));
return returnValue;
	}

	public void setMutationsPtr(final Object /* null (^L, ^Q) */ mutationsPtr__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + MUTATIONSPTR_OFFSET, mutationsPtr__);
	}

	private static final int EXTRA_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* null ([5L], [5Q]) */ extra(){
final Object /* null ([5L], [5Q]) */ returnValue = (Object /* null ([5L], [5Q]) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + EXTRA_OFFSET));
return returnValue;
	}

	public void setExtra(final Object /* null ([5L], [5Q]) */ extra__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + EXTRA_OFFSET, extra__);
	}
}
