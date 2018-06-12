package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import com.tencent.mm.plugin.voip.video.CaptureView;

public abstract interface b
{
  public abstract void OH(String paramString);
  
  public abstract void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public abstract void aL(int paramInt, String paramString);
  
  public abstract void aYv();
  
  public abstract void bKB();
  
  public abstract Context bLD();
  
  public abstract void bLE();
  
  public abstract void c(int paramInt1, int paramInt2, int[] paramArrayOfInt);
  
  public abstract void dQ(int paramInt1, int paramInt2);
  
  public abstract void setCaptureView(CaptureView paramCaptureView);
  
  public abstract void setConnectSec(long paramLong);
  
  public abstract void setHWDecMode(int paramInt);
  
  public abstract void setMute(boolean paramBoolean);
  
  public abstract void setScreenEnable(boolean paramBoolean);
  
  public abstract void uninit();
  
  public abstract void yN(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */