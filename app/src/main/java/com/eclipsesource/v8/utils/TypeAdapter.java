package com.eclipsesource.v8.utils;

public abstract interface TypeAdapter
{
  public static final Object DEFAULT = new Object();
  
  public abstract Object adapt(int paramInt, Object paramObject);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/eclipsesource/v8/utils/TypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */