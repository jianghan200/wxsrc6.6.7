package com.tencent.mm.compatible.b;

import android.media.AudioRecord;

public final class c
  extends AudioRecord
{
  public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, 2, paramInt4);
    f.fH(hashCode());
  }
  
  public final void release()
  {
    super.release();
    f.fI(hashCode());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */