package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class q
  extends r
{
  protected int lhM = -1;
  
  public q(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean);
  }
  
  public final int cQ(int paramInt1, int paramInt2)
  {
    this.lhM = paramInt1;
    return super.cQ(paramInt1, paramInt2);
  }
  
  public final void clear()
  {
    super.clear();
    SightVideoJNI.releaseBigSightDataBuffer(this.lhM);
  }
  
  protected final void e(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    if ((this.lhM >= 0) && (paramByteBuffer != null) && (paramBufferInfo != null))
    {
      long l = bi.VG();
      SightVideoJNI.writeH264Data(this.lhM, paramByteBuffer, paramBufferInfo.size);
      x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeH264Data used %sms, size: %s", new Object[] { Long.valueOf(bi.bI(l)), Integer.valueOf(paramBufferInfo.size) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */