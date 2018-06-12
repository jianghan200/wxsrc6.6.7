package com.tencent.mm.model;

import android.content.Context;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  private b bEL;
  private b.a dAm;
  a dAn;
  private boolean dAo = false;
  private Context rc = ad.getContext();
  
  public final boolean a(a parama)
  {
    this.dAn = parama;
    parama = new b((byte)0);
    if (this.bEL == null) {
      this.bEL = new b(this.rc);
    }
    if (this.dAm != parama) {
      this.dAm = parama;
    }
    this.bEL.a(this.dAm);
    if (this.bEL == null) {}
    while (this.dAo) {
      return false;
    }
    this.bEL.requestFocus();
    this.dAo = true;
    return this.dAo;
  }
  
  public final boolean bv(boolean paramBoolean)
  {
    if (this.bEL != null) {}
    for (boolean bool = this.bEL.zY();; bool = false)
    {
      this.dAo = false;
      if (paramBoolean)
      {
        this.bEL = null;
        this.dAm = null;
        this.dAn = null;
      }
      return bool;
    }
  }
  
  public static abstract interface a {}
  
  private final class b
    implements b.a
  {
    private b() {}
    
    public final void ex(int paramInt)
    {
      switch (paramInt)
      {
      case 0: 
      default: 
        x.v("MicroMsg.AudioHelperTool", "jacks UNKNOW_AUDIOFOCUS_LOSS DEFAULT");
      }
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              x.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_GAIN");
            } while (d.this.dAn == null);
            return;
            x.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS");
          } while (d.this.dAn == null);
          return;
          x.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT");
        } while (d.this.dAn == null);
        return;
        x.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
      } while (d.this.dAn == null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */