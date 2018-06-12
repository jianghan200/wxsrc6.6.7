package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;

public abstract class b
{
  protected int a = 0;
  protected int b = 0;
  protected int c = 0;
  private WeakReference<h> d = null;
  
  protected void a()
  {
    h localh = null;
    try
    {
      if (this.d != null) {
        localh = (h)this.d.get();
      }
      if (localh != null)
      {
        localh.onAudioRecordStart();
        return;
      }
    }
    finally {}
    TXCLog.e("AudioCenter:TXCAudioBaseRecord", "onRecordStart:no callback");
  }
  
  public void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public void a(h paramh)
  {
    if (paramh == null) {}
    for (;;)
    {
      try
      {
        this.d = null;
        return;
      }
      finally {}
      this.d = new WeakReference(paramh);
    }
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    h localh = null;
    try
    {
      if (this.d != null) {
        localh = (h)this.d.get();
      }
      if (localh != null)
      {
        localh.onAudioRecordPCM(paramArrayOfByte, paramInt, paramLong);
        return;
      }
    }
    finally {}
    TXCLog.e("AudioCenter:TXCAudioBaseRecord", "onRecordPcmData:no callback");
  }
  
  protected void b()
  {
    h localh = null;
    try
    {
      if (this.d != null) {
        localh = (h)this.d.get();
      }
      if (localh != null)
      {
        localh.onAudioRecordStop();
        return;
      }
    }
    finally {}
    TXCLog.e("AudioCenter:TXCAudioBaseRecord", "onRecordStop:no callback");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/audio/impl/Record/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */