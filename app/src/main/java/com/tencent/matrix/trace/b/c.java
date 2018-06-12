package com.tencent.matrix.trace.b;

public abstract interface c
{
  public abstract long[] getBuffer();
  
  public abstract int getCurIndex();
  
  public abstract long getFirstTime();
  
  public abstract long getLastDiffTime();
  
  public abstract boolean isRealTrace();
  
  public abstract void onCreate();
  
  public abstract void onDestroy();
  
  public abstract void registerListener(d paramd);
  
  public abstract void reset();
  
  public abstract void unregisterListener(d paramd);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */