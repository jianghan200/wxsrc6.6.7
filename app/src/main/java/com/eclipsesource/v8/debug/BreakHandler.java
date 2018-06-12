package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.V8Object;

public abstract interface BreakHandler
{
  public abstract void onBreak(DebugHandler.DebugEvent paramDebugEvent, ExecutionState paramExecutionState, EventData paramEventData, V8Object paramV8Object);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/eclipsesource/v8/debug/BreakHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */