package com.tencent.matrix.mrs.core;

public abstract interface MrsCallback
{
  public abstract String getPublicSharePath();
  
  public abstract void onMrsReportDataReady(byte[] paramArrayOfByte);
  
  public abstract boolean onRequestGetMrsStrategy(byte[] paramArrayOfByte);
  
  public abstract void onStrategyNotify(String paramString, boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/mrs/core/MrsCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */