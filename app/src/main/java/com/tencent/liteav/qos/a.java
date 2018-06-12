package com.tencent.liteav.qos;

public abstract interface a
{
  public abstract void onEnableDropStatusChanged(boolean paramBoolean);
  
  public abstract void onEncoderParamsChanged(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int onGetEncoderRealBitrate();
  
  public abstract int onGetQueueInputSize();
  
  public abstract int onGetQueueOutputSize();
  
  public abstract int onGetVideoDropCount();
  
  public abstract int onGetVideoQueueCurrentCount();
  
  public abstract int onGetVideoQueueMaxCount();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/qos/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */