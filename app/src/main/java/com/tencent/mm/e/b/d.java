package com.tencent.mm.e.b;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import android.os.HandlerThread;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends f
{
  boolean bDM;
  AudioRecord bEa;
  c.a bEb;
  byte[] bEk = null;
  private int bEl;
  int bEm;
  private AudioRecord.OnRecordPositionUpdateListener bEn = new d.1(this);
  private HandlerThread mHandlerThread = null;
  boolean mIsMute;
  
  public d(AudioRecord paramAudioRecord, c.a parama, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.bEa = paramAudioRecord;
    this.bEb = parama;
    this.bDM = paramBoolean;
    this.bEl = paramInt1;
    this.bEm = paramInt2;
  }
  
  public final void aO(boolean paramBoolean)
  {
    this.mIsMute = paramBoolean;
  }
  
  public final void stopRecord()
  {
    this.bEa.setRecordPositionUpdateListener(null);
    this.bEa = null;
    this.mHandlerThread.quit();
    this.mHandlerThread = null;
  }
  
  public final boolean wn()
  {
    if (this.mHandlerThread != null)
    {
      x.e("MicroMsg.RecordModeAsyncCallback", "alreay started record");
      return false;
    }
    this.mHandlerThread = e.cZ("RecordModeAsyncCallback_handlerThread", 10);
    this.mHandlerThread.start();
    this.bEa.setRecordPositionUpdateListener(this.bEn, ag.fetchFreeHandler(this.mHandlerThread.getLooper()));
    this.bEa.setPositionNotificationPeriod(this.bEl);
    if ((this.bDM) || (this.bEk == null)) {
      this.bEk = new byte[this.bEm];
    }
    int i = this.bEa.read(this.bEk, 0, this.bEm);
    x.d("MicroMsg.RecordModeAsyncCallback", "startRecord, read ret: " + i);
    if ((this.bEb != null) && (i > 0)) {
      this.bEb.s(this.bEk, i);
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/e/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */