package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.debug.mirror.Frame;

public class ExecutionState
  implements Releasable
{
  private static final String FRAME = "frame";
  private static final String FRAME_COUNT = "frameCount";
  private static final String PREPARE_STEP = "prepareStep";
  private V8Object v8Object;
  
  ExecutionState(V8Object paramV8Object)
  {
    this.v8Object = paramV8Object.twin();
  }
  
  public Frame getFrame(int paramInt)
  {
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramInt);
    Object localObject1 = null;
    try
    {
      V8Object localV8Object = this.v8Object.executeObjectFunction("frame", localV8Array);
      localObject1 = localV8Object;
      Frame localFrame = new Frame(localV8Object);
      localV8Array.release();
      if (localV8Object != null) {
        localV8Object.release();
      }
      return localFrame;
    }
    finally
    {
      localV8Array.release();
      if (localObject1 != null) {
        ((V8Object)localObject1).release();
      }
    }
  }
  
  public int getFrameCount()
  {
    return this.v8Object.executeIntegerFunction("frameCount", null);
  }
  
  public void prepareStep(StepAction paramStepAction)
  {
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramStepAction.index);
    try
    {
      this.v8Object.executeVoidFunction("prepareStep", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
    }
  }
  
  public void release()
  {
    if ((this.v8Object != null) && (!this.v8Object.isReleased()))
    {
      this.v8Object.release();
      this.v8Object = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/debug/ExecutionState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */