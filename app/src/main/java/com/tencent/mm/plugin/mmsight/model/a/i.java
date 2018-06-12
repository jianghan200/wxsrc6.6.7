package com.tencent.mm.plugin.mmsight.model.a;

import android.media.MediaRecorder;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  implements c
{
  private int audioSampleRate;
  private int dQF;
  c.a lhY;
  private ag lia = new i.1(this);
  private MediaRecorder lik;
  private boolean lil = false;
  
  public i(int paramInt1, int paramInt2)
  {
    this.audioSampleRate = paramInt1;
    this.dQF = paramInt2;
    x.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder, sampleRate: %s, bitrate: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final int a(c.a parama)
  {
    x.i("MicroMsg.MMSightAACMediaRecorder", "start, onPcmReady: %s", new Object[] { parama });
    this.lhY = parama;
    try
    {
      if ((this.lik != null) && (!this.lil)) {
        this.lik.start();
      }
      return 0;
    }
    catch (Exception parama)
    {
      x.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", parama, "start record aac.mp4 error:%s", new Object[] { parama.getMessage() });
      return -1;
    }
    finally
    {
      this.lia.sendEmptyMessage(0);
    }
  }
  
  public final int a(c.b paramb)
  {
    x.i("MicroMsg.MMSightAACMediaRecorder", "stop, mediaRecorder: %s, callback: %s", new Object[] { this.lik, paramb });
    if (this.lik == null) {
      if (paramb != null) {
        paramb.bei();
      }
    }
    for (;;)
    {
      return 0;
      try
      {
        if (!this.lil)
        {
          this.lik.stop();
          this.lik.release();
        }
        this.lik = null;
        if (paramb != null)
        {
          paramb.bei();
          return 0;
        }
      }
      catch (Exception paramb)
      {
        x.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", paramb, "stop record aac.mp4 error:%s", new Object[] { paramb.getMessage() });
      }
    }
    return -1;
  }
  
  public final int at(int paramInt, String paramString)
  {
    x.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder init tempPath[%s], sampleRate[%d]", new Object[] { paramString, Integer.valueOf(this.audioSampleRate) });
    this.lik = new MediaRecorder();
    this.lik.setAudioSource(1);
    this.lik.setOutputFormat(2);
    this.lik.setAudioEncoder(3);
    this.lik.setAudioChannels(1);
    this.lik.setAudioEncodingBitRate(this.dQF);
    this.lik.setAudioSamplingRate(this.audioSampleRate);
    this.lik.setOutputFile(paramString);
    try
    {
      this.lik.prepare();
      return 0;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", paramString, "mediaRecorder prepare error: %s", new Object[] { paramString.getMessage() });
    }
    return -1;
  }
  
  public final void bef() {}
  
  public final com.tencent.mm.e.b.c.a beg()
  {
    return null;
  }
  
  public final void clear()
  {
    try
    {
      if (this.lik != null)
      {
        if (!this.lil)
        {
          this.lik.stop();
          this.lik.release();
        }
        this.lik = null;
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", localException, "clear error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  public final void gt(boolean paramBoolean)
  {
    this.lil = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */