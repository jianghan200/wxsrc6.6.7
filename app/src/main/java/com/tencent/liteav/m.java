package com.tencent.liteav;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.basic.c.a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;
import java.lang.ref.WeakReference;

public abstract class m
{
  protected g a = null;
  protected Context b = null;
  protected TXCloudVideoView c = null;
  protected WeakReference<a> d;
  
  public m(Context paramContext)
  {
    if (paramContext != null) {
      this.b = paramContext.getApplicationContext();
    }
  }
  
  public abstract int a(String paramString, int paramInt);
  
  public abstract int a(boolean paramBoolean);
  
  public void a()
  {
    TXCLog.w("TXIPlayer", "pause not support");
  }
  
  public void a(float paramFloat)
  {
    TXCLog.w("TXIPlayer", "rate not implement");
  }
  
  public abstract void a(int paramInt);
  
  public void a(Context paramContext, int paramInt) {}
  
  public void a(Surface paramSurface) {}
  
  public void a(a parama)
  {
    this.d = new WeakReference(parama);
  }
  
  public void a(g paramg)
  {
    this.a = paramg;
    if (this.a == null) {
      this.a = new g();
    }
  }
  
  public void a(n paramn) {}
  
  public void a(TXLivePlayer.ITXAudioRawDataListener paramITXAudioRawDataListener) {}
  
  public void a(TXCloudVideoView paramTXCloudVideoView)
  {
    this.c = paramTXCloudVideoView;
  }
  
  public void a(TXRecordCommon.ITXVideoRecordListener paramITXVideoRecordListener) {}
  
  public boolean a(byte[] paramArrayOfByte)
  {
    return false;
  }
  
  public void b()
  {
    TXCLog.w("TXIPlayer", "resume not support");
  }
  
  public abstract void b(int paramInt);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract int c(int paramInt);
  
  public void c(boolean paramBoolean)
  {
    TXCLog.w("TXIPlayer", "autoPlay not implement");
  }
  
  public abstract boolean c();
  
  public TextureView d()
  {
    return null;
  }
  
  public abstract int e();
  
  public void e(int paramInt)
  {
    TXCLog.w("TXIPlayer", "seek not support");
  }
  
  public g f()
  {
    return this.a;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */