package com.tencent.mm.plugin.appbrand.media.record.a;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.mm.plugin.appbrand.media.encode.M4aAudioFormatJni;
import com.tencent.mm.plugin.appbrand.media.record.h;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a
  extends b
{
  int giR = 2;
  private MediaCodec giS;
  MediaCodec.BufferInfo giT;
  private final int giU = 100;
  private String mFilePath = "";
  
  public final boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null)
    {
      x.e("MicroMsg.Record.AACAudioEncoder", "pcm is null");
      return false;
    }
    if (this.giS != null)
    {
      x.i("MicroMsg.Record.AACAudioEncoder", "encodePCMToAAC endOfStream:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      Object localObject2 = this.giS.getInputBuffers();
      Object localObject1 = this.giS.getOutputBuffers();
      paramInt = this.giS.dequeueInputBuffer(100L);
      if (paramInt >= 0)
      {
        localObject2 = localObject2[paramInt];
        ((ByteBuffer)localObject2).clear();
        ((ByteBuffer)localObject2).put(paramArrayOfByte);
        ((ByteBuffer)localObject2).position(0);
        ((ByteBuffer)localObject2).limit(paramArrayOfByte.length);
        x.i("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex:%d, data length:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
        if (paramBoolean)
        {
          this.giS.queueInputBuffer(paramInt, 0, paramArrayOfByte.length, System.nanoTime(), 4);
          paramArrayOfByte = (byte[])localObject1;
          paramInt = this.giS.dequeueOutputBuffer(this.giT, 100L);
          if (paramInt != -1) {
            break label227;
          }
          x.d("MicroMsg.Record.AACAudioEncoder", "no output available, break");
        }
      }
      for (;;)
      {
        label180:
        return true;
        this.giS.queueInputBuffer(paramInt, 0, paramArrayOfByte.length, System.nanoTime(), 0);
        paramArrayOfByte = (byte[])localObject1;
        break;
        x.e("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex %d", new Object[] { Integer.valueOf(paramInt) });
        paramArrayOfByte = (byte[])localObject1;
        break;
        label227:
        if (paramInt == -3)
        {
          x.e("MicroMsg.Record.AACAudioEncoder", "output buff change");
          paramArrayOfByte = this.giS.getOutputBuffers();
          break;
        }
        if (paramInt == -2)
        {
          localObject1 = this.giS.getOutputFormat();
          x.e("MicroMsg.Record.AACAudioEncoder", "encoder output format changed: " + localObject1);
          break;
        }
        if (paramInt < 0)
        {
          x.e("MicroMsg.Record.AACAudioEncoder", "unexpected result from encoder.dequeueOutputBuffer: %s", new Object[] { Integer.valueOf(paramInt) });
          break;
        }
        x.i("MicroMsg.Record.AACAudioEncoder", "outputBufferIndex %d", new Object[] { Integer.valueOf(paramInt) });
        localObject1 = paramArrayOfByte[paramInt];
        if (localObject1 == null) {
          throw new RuntimeException("outputBuffer " + paramInt + " was null");
        }
        if ((this.giT.flags & 0x2) != 0) {
          x.e("MicroMsg.Record.AACAudioEncoder", "flags is BUFFER_FLAG_CODEC_CONFIG, don't writ data into file");
        }
        for (;;)
        {
          this.giS.releaseOutputBuffer(paramInt, false);
          if ((this.giT.flags & 0x4) == 0) {
            break;
          }
          if (paramBoolean) {
            break label496;
          }
          x.w("MicroMsg.Record.AACAudioEncoder", "reached end of stream unexpectedly");
          break label180;
          int i = this.giT.size;
          localObject2 = new byte[i];
          ((ByteBuffer)localObject1).get((byte[])localObject2, 0, i);
          int j = M4aAudioFormatJni.writeAudioBuff((byte[])localObject2, i);
          d((byte[])localObject2, i, false);
          if (j == 0) {
            x.i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff ok,");
          } else {
            x.i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff fail,");
          }
        }
        label496:
        x.e("MicroMsg.Record.AACAudioEncoder", "reach the end, and end to encode the data");
      }
    }
    x.e("MicroMsg.Record.AACAudioEncoder", "mEncoder is null");
    return false;
  }
  
  public final void close()
  {
    x.i("MicroMsg.Record.AACAudioEncoder", "close");
    if (this.giS != null)
    {
      this.giS.stop();
      this.giS.release();
      this.giS = null;
    }
    M4aAudioFormatJni.closeM4aFile();
  }
  
  public final boolean e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    x.i("MicroMsg.Record.AACAudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mFilePath = paramString;
    try
    {
      x.i("MicroMsg.Record.AACAudioEncoder", "initCodec");
      this.giT = new MediaCodec.BufferInfo();
      MediaFormat localMediaFormat = MediaFormat.createAudioFormat(this.giV, paramInt1, paramInt2);
      localMediaFormat.setInteger("bitrate", paramInt3);
      localMediaFormat.setInteger("aac-profile", this.giR);
      this.giS = MediaCodec.createEncoderByType(this.giV);
      this.giS.configure(localMediaFormat, null, null, 1);
      this.giS.start();
      x.i("MicroMsg.Record.AACAudioEncoder", "encoder start to work");
      paramInt3 = 0;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Record.AACAudioEncoder", localIOException, "initCodec", new Object[0]);
        paramInt3 = -1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Record.AACAudioEncoder", localException, "initCodec", new Object[0]);
        paramInt3 = -1;
      }
      x.i("MicroMsg.Record.AACAudioEncoder", "initCodec ok");
      if (M4aAudioFormatJni.createM4aFile(paramString, paramInt2, paramInt1, this.giR) != 0) {
        break label224;
      }
      x.i("MicroMsg.Record.AACAudioEncoder", "createM4aFile m4a jni api ok,");
      return true;
      label224:
      x.i("MicroMsg.Record.AACAudioEncoder", "createM4aFile m4a jni api fail,");
      h.li(22);
    }
    if (paramInt3 == -1)
    {
      x.i("MicroMsg.Record.AACAudioEncoder", "initCodec  fail,");
      h.li(21);
      return false;
    }
    return false;
  }
  
  public final void flush()
  {
    x.i("MicroMsg.Record.AACAudioEncoder", "flush");
    d(new byte[0], 0, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */