package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.g.c.bd;
import com.tencent.mm.sdk.e.c.a;

public final class c
  extends bd
{
  public static c.a dhO = ;
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final boolean aLa()
  {
    return this.field_dataType == 4;
  }
  
  public final float getProgress()
  {
    return Math.max(0.0F, Math.min(99.0F, this.field_offset / this.field_totalLen) * 100.0F);
  }
  
  public final boolean isFinished()
  {
    return this.field_status == 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/fav/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */