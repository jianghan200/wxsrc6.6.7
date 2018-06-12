package com.tencent.mm.plugin.u;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;

public final class a
  extends h
{
  private AudioTrack aga;
  private int channels;
  private boolean hEj = false;
  private int sampleRate;
  
  public a(g paramg, ag paramag)
  {
    super(paramg, paramag);
  }
  
  private int getSampleRate()
  {
    if (this.sampleRate == 0) {
      this.sampleRate = this.ldl.getInteger("sample-rate");
    }
    return this.sampleRate;
  }
  
  final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    x.d("MicroMsg.AudioTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d", new Object[] { avA(), Integer.valueOf(this.state), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    if (!d.sE(this.state))
    {
      x.i("MicroMsg.AudioTrackDataSource", "%s it no need process buffer now state %d", new Object[] { avA(), Integer.valueOf(this.state) });
      return false;
    }
    if (this.aga == null)
    {
      x.i("MicroMsg.AudioTrackDataSource", "%s init audio track", new Object[] { avA() });
      if (this.channels == 0) {
        this.channels = this.ldl.getInteger("channel-count");
      }
      if (this.channels == 1)
      {
        i = 4;
        int j = AudioTrack.getMinBufferSize(getSampleRate(), i, 2);
        this.aga = new com.tencent.mm.compatible.b.d(3, getSampleRate(), i, j);
        if ((this.aga == null) || (this.aga.getState() == 1)) {
          break label256;
        }
        x.w("MicroMsg.AudioTrackDataSource", "%s can not create audio track [%d]", new Object[] { avA(), Integer.valueOf(this.aga.getState()) });
        this.aga.release();
        this.aga = null;
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label270;
        }
        return false;
        i = 12;
        break;
        label256:
        setMute(this.hEj);
      }
    }
    label270:
    if ((d.sz(this.state)) && ((this.aga.getPlayState() == 2) || (this.aga.getPlayState() == 1))) {
      onStart();
    }
    if (this.state == 4) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (this.aga.getPlayState() == 3)) {
        onPause();
      }
      try
      {
        this.ldg.lcX = paramBufferInfo.presentationTimeUs;
        paramBufferInfo = new byte[paramBufferInfo.size];
        paramByteBuffer.get(paramBufferInfo);
        paramByteBuffer.clear();
        if (paramBufferInfo.length > 0) {
          this.aga.write(paramBufferInfo, 0, paramBufferInfo.length);
        }
        x.d("MicroMsg.AudioTrackDataSource", "%s finish to process index[%d] time[%d] to audio track", new Object[] { avA(), Integer.valueOf(paramInt), Long.valueOf(this.ldg.lcX) });
        paramMediaCodec.releaseOutputBuffer(paramInt, false);
      }
      catch (Exception paramMediaCodec)
      {
        for (;;)
        {
          x.e("MicroMsg.AudioTrackDataSource", "%s audio release output buffer error %s", new Object[] { avA(), paramMediaCodec.toString() });
        }
      }
      return true;
    }
  }
  
  final boolean a(MediaCodec paramMediaCodec)
  {
    x.i("MicroMsg.AudioTrackDataSource", "%s handle decoder before start", new Object[] { avA() });
    paramMediaCodec.configure(this.ldl, null, null, 0);
    return false;
  }
  
  protected final void b(MediaCodec paramMediaCodec)
  {
    x.i("MicroMsg.AudioTrackDataSource", "%s on output format changed", new Object[] { avA() });
    this.sampleRate = 0;
    this.channels = 0;
    if (this.aga != null) {}
    try
    {
      this.aga.flush();
      this.aga.release();
      this.aga = null;
      return;
    }
    catch (Exception paramMediaCodec)
    {
      for (;;) {}
    }
  }
  
  protected final void onPause()
  {
    x.i("MicroMsg.AudioTrackDataSource", "%s on pause", new Object[] { avA() });
    if ((this.aga != null) && (this.aga.getState() == 1)) {
      this.aga.pause();
    }
  }
  
  protected final void onStart()
  {
    x.i("MicroMsg.AudioTrackDataSource", "%s on start", new Object[] { avA() });
    if ((this.aga != null) && (this.aga.getState() == 1)) {
      this.aga.play();
    }
  }
  
  public final void release()
  {
    try
    {
      this.aga.flush();
      this.aga.release();
      super.release();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    if (this.aga == null)
    {
      x.w("MicroMsg.AudioTrackDataSource", "%s set mute[%b] but audio track is null", new Object[] { avA(), Boolean.valueOf(paramBoolean) });
      this.hEj = paramBoolean;
      return;
    }
    if (com.tencent.mm.compatible.util.d.fS(21))
    {
      x.d("MicroMsg.AudioTrackDataSource", "%s api below 21 set mute[%b]", new Object[] { avA(), Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
      {
        this.aga.setStereoVolume(0.0F, 0.0F);
        return;
      }
      this.aga.setStereoVolume(1.0F, 1.0F);
      return;
    }
    x.d("MicroMsg.AudioTrackDataSource", "%s api higher 21 set mute[%b]", new Object[] { avA(), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.aga.setVolume(0.0F);
      return;
    }
    this.aga.setVolume(1.0F);
  }
  
  final String type()
  {
    return "audio";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/u/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */