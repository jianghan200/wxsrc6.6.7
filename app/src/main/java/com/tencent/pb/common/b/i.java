package com.tencent.pb.common.b;

import java.lang.ref.WeakReference;

public final class i
  implements c
{
  private WeakReference<c> vcE;
  
  public i(c paramc)
  {
    this.vcE = new WeakReference(paramc);
  }
  
  public final void r(int paramInt, byte[] paramArrayOfByte)
  {
    if ((this.vcE != null) && (this.vcE.get() != null))
    {
      ((c)this.vcE.get()).r(paramInt, paramArrayOfByte);
      return;
    }
    com.tencent.pb.common.c.c.x("OnRespForLongAIDLImpl fail", new Object[] { "callback is null, errCode=" + paramInt });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/pb/common/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */