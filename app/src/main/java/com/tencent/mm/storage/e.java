package com.tencent.mm.storage;

import com.tencent.mm.bt.h;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.plugin.messenger.foundation.a.k;

public abstract class e
{
  public static k sNP;
  protected f sNO;
  
  public e(f paramf)
  {
    this.sNO = paramf;
  }
  
  protected final String GX(String paramString)
  {
    return this.sNO.GX(paramString);
  }
  
  public abstract String XG(String paramString);
  
  protected final void a(h paramh, String paramString)
  {
    this.sNO.a(paramh, paramString);
  }
  
  protected final void a(f.b paramb)
  {
    this.sNO.a(paramb);
  }
  
  protected final void a(f.c paramc)
  {
    this.sNO.a(paramc);
  }
  
  protected boolean a(bd parambd, bd.b paramb)
  {
    return true;
  }
  
  public final h bdc()
  {
    return this.sNO.bdc();
  }
  
  protected final void fW(String paramString1, String paramString2)
  {
    this.sNO.b(paramString1, paramString2, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */