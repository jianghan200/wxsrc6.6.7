package com.eclipsesource.v8;

public abstract interface ReferenceHandler
{
  public abstract void v8HandleCreated(V8Value paramV8Value);
  
  public abstract void v8HandleDisposed(V8Value paramV8Value);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/eclipsesource/v8/ReferenceHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */