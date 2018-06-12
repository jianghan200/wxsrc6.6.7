package com.tencent.mm.compatible.b;

import android.media.AudioTrack;

public final class d
  extends AudioTrack
{
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, 2, paramInt4, 1);
    f.fF(hashCode());
  }
  
  public final void release()
  {
    super.release();
    f.fG(hashCode());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/compatible/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */