package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  implements e
{
  public int oEZ = 0;
  public int oFn = 71;
  private String oFo = null;
  public int oFp = 0;
  public a oFq = null;
  
  public l()
  {
    au.DF().a(611, this);
    au.DF().a(612, this);
  }
  
  public l(a parama)
  {
    this();
    this.oFq = parama;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MicroMsg.VoicePrintCreateService", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0)) {
      if (this.oFq != null) {
        this.oFq.bIV();
      }
    }
    label146:
    label190:
    label278:
    label303:
    label308:
    label351:
    for (;;)
    {
      return;
      if (paraml.getType() == 611)
      {
        paramString = (d)paraml;
        this.oFp = paramString.oES;
        this.oFo = paramString.oER;
        x.d("MicroMsg.VoicePrintCreateService", "onFinishGetText, resId:%d, voiceText==null:%b", new Object[] { Integer.valueOf(this.oFp), Boolean.valueOf(bi.oW(this.oFo)) });
        if (this.oFq != null)
        {
          if (this.oFn != 71) {
            break label278;
          }
          this.oFq.OD(this.oFo);
        }
      }
      if (paraml.getType() == 612)
      {
        paramString = (f)paraml;
        if (((paramString.oFb != 72) || (paramString.oFc != 0)) && (paramString.oFb != 71)) {
          break label303;
        }
        paramInt1 = 1;
        if (paramInt1 == 0) {
          break label308;
        }
        x.d("MicroMsg.VoicePrintCreateService", "onRegister, ok, step:%d", new Object[] { Integer.valueOf(paramString.oFb) });
        this.oEZ = paramString.oEZ;
        if (this.oFq != null) {
          this.oFq.u(true, paramString.oFb);
        }
      }
      for (;;)
      {
        if ((paramInt1 == 0) || (paramString.oFb != 71) || (this.oFq == null)) {
          break label351;
        }
        this.oFq.OE(this.oFo);
        return;
        if (this.oFn != 72) {
          break label146;
        }
        this.oFq.OE(this.oFo);
        break label146;
        break;
        paramInt1 = 0;
        break label190;
        x.d("MicroMsg.VoicePrintCreateService", "onRegister, not ok, step:%d", new Object[] { Integer.valueOf(paramString.oFb) });
        if (this.oFq != null) {
          this.oFq.u(false, paramString.oFb);
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void OD(String paramString);
    
    public abstract void OE(String paramString);
    
    public abstract void bIV();
    
    public abstract void u(boolean paramBoolean, int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */