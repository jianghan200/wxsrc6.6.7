package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import com.google.a.a.e;

public abstract class d
  implements c
{
  public final String TAG2 = getClass().getSimpleName();
  private final long dJL = 60000L;
  Runnable dJQ = new d.1(this);
  boolean hiW = false;
  public int jIm = 2;
  private int mErrorCode = 64537;
  Handler mHandler = new Handler(Looper.getMainLooper());
  public boolean vbX = false;
  b vbY = null;
  public byte[] vbZ = null;
  public Object vca = null;
  public int vcb;
  public int vcc = 0;
  
  public abstract Object bI(byte[] paramArrayOfByte);
  
  public final void c(int paramInt, e parame)
  {
    this.vcb = paramInt;
    Object localObject = null;
    try
    {
      parame = e.b(parame);
      this.vbZ = parame;
      return;
    }
    catch (Exception parame)
    {
      for (;;)
      {
        parame = (e)localObject;
      }
    }
  }
  
  public abstract String cEm();
  
  public abstract int getType();
  
  public final void r(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 2;
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "onResp errcode", Integer.valueOf(paramInt) });
    this.mHandler.removeCallbacks(this.dJQ);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "NETTASK_RECV onResp:cmd= ", cEm(), Integer.valueOf(paramInt), Boolean.valueOf(this.hiW) });
    if (paramInt != 0)
    {
      com.tencent.pb.common.c.c.x("MicroMsg.Voip", new Object[] { this.TAG2, "getNetworkErrType errcode:" + paramInt });
      if (paramInt == -1) {
        if (h.isNetworkConnected()) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      if (this.hiW)
      {
        com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "onResp netscene already canceled, cmd:" + this.vcb });
        return;
        if (paramInt == 6801) {
          i = 10;
        } else {
          i = 4;
        }
      }
      else
      {
        this.mErrorCode = paramInt;
        this.vca = bI(paramArrayOfByte);
        this.mHandler.post(new d.2(this, i, paramInt));
        return;
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/pb/common/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */