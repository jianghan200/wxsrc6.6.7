package com.tencent.mm.plugin.gallery.model;

import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;

public final class l
{
  private int fUn = 3;
  HashSet<g.a> jBj = new HashSet();
  public HashSet<g.b> jBk = new HashSet();
  g jBl;
  public int jBm = 1;
  
  private void aRH()
  {
    x.i("MicroMsg.MediaQueryService", "initQueryType: %d", new Object[] { Integer.valueOf(this.jBm) });
    switch (this.jBm)
    {
    default: 
      this.jBl = new i();
      return;
    case 1: 
      this.jBl = new i();
      return;
    case 2: 
      this.jBl = new n();
      return;
    }
    this.jBl = new h();
  }
  
  public final void a(g.a parama)
  {
    this.jBj.add(parama);
  }
  
  public final int aRI()
  {
    x.i("MicroMsg.MediaQueryService", "getQuerySource, %d, %s", new Object[] { Integer.valueOf(this.fUn), bi.cjd() });
    return this.fUn;
  }
  
  public final int aRJ()
  {
    x.i("MicroMsg.MediaQueryService", "getQueryType, %d, %s", new Object[] { Integer.valueOf(this.jBm), bi.cjd() });
    return this.jBm;
  }
  
  public final void aRK()
  {
    if (this.jBl == null)
    {
      x.f("MicroMsg.MediaQueryService", "media query not init, init again");
      aRH();
    }
    c.aRg().z(new l.1(this));
  }
  
  public final void b(g.a parama)
  {
    this.jBj.remove(parama);
  }
  
  public final void e(String paramString, int paramInt, long paramLong)
  {
    if (this.jBl == null)
    {
      x.f("MicroMsg.MediaQueryService", "media query not init, init again");
      aRH();
    }
    c.aRg().aRt().removeCallbacksAndMessages(null);
    this.jBl.aRA();
    e locale = c.aRg();
    paramString = new l.2(this, paramString, paramInt, paramLong);
    locale.aRt().post(paramString);
  }
  
  public final void qt(int paramInt)
  {
    this.jBm = paramInt;
    aRH();
  }
  
  public final void qu(int paramInt)
  {
    x.i("MicroMsg.MediaQueryService", "setQuerySource, %d, %s", new Object[] { Integer.valueOf(paramInt), bi.cjd() });
    this.fUn = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */