package com.tencent.mm.plugin.mmsight.segment;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
{
  private long aBL;
  String ldm = null;
  private MediaExtractor ldo;
  private long lkn;
  MediaCodec llj;
  MediaCodec llk;
  MediaFormat lll;
  MediaFormat llm;
  VideoTransPara lln;
  boolean llo = true;
  List<byte[]> llp = null;
  private boolean llq = false;
  private boolean llr = false;
  private byte[] lls;
  private HandlerThread llt = null;
  private ag llu = null;
  
  public g(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, long paramLong1, long paramLong2, VideoTransPara paramVideoTransPara)
  {
    this.ldo = paramMediaExtractor;
    this.lll = paramMediaFormat;
    this.aBL = paramLong1;
    this.lkn = paramLong2;
    this.lln = paramVideoTransPara;
    this.ldm = paramMediaFormat.getString("mime");
    this.llp = new ArrayList();
    x.i("MicroMsg.MediaCodecAACTranscoder", "create MediaCodecAACTranscoder, startTimeMs: %s, endTimeMs: %s, mime: %s, srcMediaFormat: %s, para: %s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), this.ldm, paramMediaFormat, paramVideoTransPara });
  }
  
  private void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, boolean paramBoolean)
  {
    if (paramByteBuffer == null) {}
    for (;;)
    {
      return;
      x.d("MicroMsg.MediaCodecAACTranscoder", "processDecodeBuffer, EOS: %s, finishGetAllInputAACData: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.llr) });
      if (this.llo)
      {
        if (!this.llq)
        {
          beV();
          this.llq = true;
        }
        if (this.lls == null)
        {
          this.lls = new byte[paramByteBuffer.remaining()];
          paramByteBuffer.get(this.lls, 0, paramByteBuffer.remaining());
        }
        a(this.lls, paramBufferInfo.presentationTimeUs, paramBoolean);
        return;
      }
      byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
      paramByteBuffer.get(arrayOfByte, 0, paramByteBuffer.remaining());
      this.llp.add(arrayOfByte);
      if ((!this.llr) && (!paramBoolean)) {
        continue;
      }
      try
      {
        this.llj.stop();
        this.llj.release();
        beV();
        this.llq = true;
        paramByteBuffer = this.llp.iterator();
        int i = 0;
        while (paramByteBuffer.hasNext())
        {
          arrayOfByte = (byte[])paramByteBuffer.next();
          long l = paramBufferInfo.presentationTimeUs;
          if (i < this.llp.size() - 1) {
            break label258;
          }
          paramBoolean = true;
          a(arrayOfByte, l, paramBoolean);
          i += 1;
        }
      }
      catch (Exception paramByteBuffer)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", paramByteBuffer, "", new Object[0]);
          continue;
          label258:
          paramBoolean = false;
        }
      }
    }
  }
  
  private void a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    if ((this.llk == null) || (paramArrayOfByte == null)) {}
    for (;;)
    {
      return;
      Object localObject = this.llk.getInputBuffers();
      int j = this.llk.dequeueInputBuffer(20000L);
      if (j < 0)
      {
        x.d("MicroMsg.MediaCodecAACTranscoder", "encoder no input buffer available, drain first");
        beF();
      }
      int i;
      if (j >= 0)
      {
        localObject = localObject[j];
        ((ByteBuffer)localObject).clear();
        ((ByteBuffer)localObject).position(0);
        ((ByteBuffer)localObject).put(paramArrayOfByte);
        if (!paramBoolean) {
          break label165;
        }
        x.i("MicroMsg.MediaCodecAACTranscoder", "last, send EOS and try delay stop encoder");
        i = 1;
        ah.i(new g.2(this), 500L);
      }
      while (this.llk != null)
      {
        if (i != 0)
        {
          x.i("MicroMsg.MediaCodecAACTranscoder", "EOS received in sendAudioToEncoder");
          this.llk.queueInputBuffer(j, 0, paramArrayOfByte.length, paramLong, 4);
        }
        for (;;)
        {
          beF();
          return;
          this.llk.queueInputBuffer(j, 0, paramArrayOfByte.length, paramLong, 0);
        }
        label165:
        i = 0;
      }
    }
  }
  
  private void beF()
  {
    if (this.llk == null) {}
    do
    {
      return;
      MediaCodec.BufferInfo localBufferInfo;
      do
      {
        int i;
        ByteBuffer[] arrayOfByteBuffer2;
        for (;;)
        {
          try
          {
            ByteBuffer[] arrayOfByteBuffer1 = this.llk.getOutputBuffers();
            localBufferInfo = new MediaCodec.BufferInfo();
            i = this.llk.dequeueOutputBuffer(localBufferInfo, 20000L);
            x.d("MicroMsg.MediaCodecAACTranscoder", "encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
            if (i == -1)
            {
              x.d("MicroMsg.MediaCodecAACTranscoder", "no output available, break");
              return;
            }
          }
          catch (Exception localException)
          {
            x.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "drainEncoder error: %s", new Object[] { localException.getMessage() });
            return;
          }
          if (i == -3)
          {
            arrayOfByteBuffer2 = this.llk.getOutputBuffers();
          }
          else if (i == -2)
          {
            this.llm = this.llk.getOutputFormat();
            x.i("MicroMsg.MediaCodecAACTranscoder", "dstMediaFormat change: %s", new Object[] { this.llm });
          }
          else
          {
            if (i >= 0) {
              break;
            }
            x.e("MicroMsg.MediaCodecAACTranscoder", "unexpected encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          }
        }
        x.v("MicroMsg.MediaCodecAACTranscoder", "perform encoding");
        ByteBuffer localByteBuffer = arrayOfByteBuffer2[i];
        if (localByteBuffer == null)
        {
          x.e("MicroMsg.MediaCodecAACTranscoder", "ERROR, retrieve encoderOutputBuffer is null!!");
          return;
        }
        if (localBufferInfo.size > 0)
        {
          localByteBuffer.position(localBufferInfo.offset);
          localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
          if (localByteBuffer != null) {
            MP4MuxerJNI.writeAACData(0, localByteBuffer, localBufferInfo.size);
          }
        }
        this.llk.releaseOutputBuffer(i, false);
      } while ((localBufferInfo.flags & 0x4) == 0);
      x.i("MicroMsg.MediaCodecAACTranscoder", "receive EOS!");
    } while (this.llk == null);
    this.llk.stop();
    this.llk.release();
    this.llk = null;
  }
  
  private void beU()
  {
    if (this.llj == null) {
      return;
    }
    MediaCodec.BufferInfo localBufferInfo;
    label25:
    int i;
    ByteBuffer[] arrayOfByteBuffer2;
    for (;;)
    {
      try
      {
        ByteBuffer[] arrayOfByteBuffer1 = this.llj.getOutputBuffers();
        localBufferInfo = new MediaCodec.BufferInfo();
        i = this.llj.dequeueOutputBuffer(localBufferInfo, 20000L);
        x.d("MicroMsg.MediaCodecAACTranscoder", "decoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
        if (i == -1)
        {
          x.d("MicroMsg.MediaCodecAACTranscoder", "no output available, break");
          return;
        }
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "drainDecoder error: %s", new Object[] { localException.getMessage() });
        return;
      }
      if (i == -3)
      {
        arrayOfByteBuffer2 = this.llj.getOutputBuffers();
      }
      else if (i == -2)
      {
        this.lll = this.llj.getOutputFormat();
        x.i("MicroMsg.MediaCodecAACTranscoder", "srcMediaFormat change: %s", new Object[] { this.lll });
      }
      else
      {
        if (i >= 0) {
          break;
        }
        x.e("MicroMsg.MediaCodecAACTranscoder", "unexpected decoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
      }
    }
    x.v("MicroMsg.MediaCodecAACTranscoder", "perform decoding");
    ByteBuffer localByteBuffer = arrayOfByteBuffer2[i];
    if (localByteBuffer == null)
    {
      x.e("MicroMsg.MediaCodecAACTranscoder", "ERROR, retrieve decoderOutputBuffer is null!!");
      return;
    }
    if ((localBufferInfo.flags & 0x2) != 0)
    {
      x.e("MicroMsg.MediaCodecAACTranscoder", "ignore BUFFER_FLAG_CODEC_CONFIG");
      localBufferInfo.size = 0;
    }
    if (localBufferInfo.size > 0)
    {
      localByteBuffer.position(localBufferInfo.offset);
      localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
      if ((localBufferInfo.flags & 0x4) == 0) {
        break label336;
      }
    }
    label336:
    for (boolean bool = true;; bool = false)
    {
      a(localByteBuffer, localBufferInfo, bool);
      this.llj.releaseOutputBuffer(i, false);
      if ((localBufferInfo.flags & 0x4) == 0) {
        break label25;
      }
      x.i("MicroMsg.MediaCodecAACTranscoder", "receive EOS!");
      if (this.llj == null) {
        break;
      }
      this.llj.stop();
      this.llj.release();
      this.llj = null;
      return;
    }
  }
  
  private void beV()
  {
    if ((this.llk != null) && (this.llo) && (!this.llq))
    {
      this.llj.start();
      return;
    }
    try
    {
      this.llm = new MediaFormat();
      this.llm.setString("mime", "audio/mp4a-latm");
      this.llm.setInteger("aac-profile", 2);
      this.llm.setInteger("sample-rate", this.lln.audioSampleRate);
      this.llm.setInteger("channel-count", 1);
      this.llm.setInteger("bitrate", this.lln.dQF);
      this.llm.setInteger("max-input-size", 16384);
      this.llk = MediaCodec.createEncoderByType(this.ldm);
      this.llk.configure(this.llm, null, null, 1);
      this.llk.start();
      x.i("MicroMsg.MediaCodecAACTranscoder", "checkInitAndStartEncoder, not canEncodeDecodeBothExist, create new encoder");
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MediaCodecAACTranscoder", "checkInitAndStartEncoder, not canEncodeDecodeBothExist, error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  public final void beT()
  {
    this.llq = false;
    this.llr = false;
    label311:
    for (;;)
    {
      try
      {
        if ((this.llj == null) || (this.ldo == null))
        {
          x.e("MicroMsg.MediaCodecAACTranscoder", "startTranscodeBlockLoop error");
          return;
        }
        Object localObject = this.llj.getInputBuffers();
        int j = this.llj.dequeueInputBuffer(20000L);
        if (j < 0)
        {
          x.d("MicroMsg.MediaCodecAACTranscoder", "decoder no input buffer available, drain first");
          beU();
        }
        int k;
        long l;
        if (j >= 0)
        {
          x.d("MicroMsg.MediaCodecAACTranscoder", "decoderInputBufferIndex: %d", new Object[] { Integer.valueOf(j) });
          localObject = localObject[j];
          ((ByteBuffer)localObject).clear();
          ((ByteBuffer)localObject).position(0);
          k = this.ldo.readSampleData((ByteBuffer)localObject, 0);
          l = this.ldo.getSampleTime();
          this.ldo.advance();
          x.d("MicroMsg.MediaCodecAACTranscoder", "sampleSize: %s, pts: %s", new Object[] { Integer.valueOf(k), Long.valueOf(l) });
          if ((l < this.lkn * 1000L) && (l > 0L) && (k > 0)) {
            break label311;
          }
          x.i("MicroMsg.MediaCodecAACTranscoder", "reach end time, send EOS and try delay stop decoder");
          this.llr = true;
          ah.i(new g.1(this), 500L);
          i = 1;
          if (this.llj == null) {
            break;
          }
          if (i != 0)
          {
            x.i("MicroMsg.MediaCodecAACTranscoder", "EOS received in sendAudioToEncoder");
            this.llj.queueInputBuffer(j, 0, k, l, 4);
          }
        }
        else
        {
          beU();
          if ((!this.llr) || (this.llk != null)) {
            continue;
          }
          return;
        }
        this.llj.queueInputBuffer(j, 0, k, l, 0);
        continue;
        int i = 0;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "startTranscodeBlockLoop error: %s", new Object[] { localException.getMessage() });
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mmsight/segment/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */