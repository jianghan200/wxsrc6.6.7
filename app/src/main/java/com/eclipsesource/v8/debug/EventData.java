package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Object;

public class EventData
  implements Releasable
{
  protected V8Object v8Object;
  
  EventData(V8Object paramV8Object)
  {
    this.v8Object = paramV8Object.twin();
  }
  
  public void release()
  {
    if (!this.v8Object.isReleased()) {
      this.v8Object.release();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/eclipsesource/v8/debug/EventData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */