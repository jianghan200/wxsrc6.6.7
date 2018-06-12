package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class g
  extends h
{
  private int lhM = -1;
  
  public g(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public final int at(int paramInt, String paramString)
  {
    this.lhM = paramInt;
    return super.at(paramInt, paramString);
  }
  
  protected final boolean bex()
  {
    return true;
  }
  
  protected final void e(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    if ((this.lhM >= 0) && (paramByteBuffer != null) && (paramBufferInfo != null) && (!this.lib)) {
      SightVideoJNI.writeAACData(this.lhM, paramByteBuffer, paramBufferInfo.size);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */