package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.tencent.d.a.c.f;
import com.tencent.d.b.d.b;
import com.tencent.d.b.d.b.a;
import com.tencent.d.b.e.e;

public final class k
  extends c
{
  private int fdx = -1;
  String vlV = null;
  private boolean vna = false;
  e vnd = null;
  private e vne = null;
  private boolean vnf = false;
  
  public k(int paramInt, e parame1, e parame2, boolean paramBoolean)
  {
    this.fdx = paramInt;
    this.vnd = parame1;
    this.vna = paramBoolean;
    this.vnf = true;
    this.vne = parame2;
  }
  
  private void cGe()
  {
    dC(this.vlV, 1);
    b.a locala = new b.a();
    String str = this.vlV;
    boolean bool = this.vna;
    locala.vlV = str;
    locala.vlX = bool;
    locala.vlU |= 0x2;
    locala.vlY = new k.2(this);
    locala.cFV().cFU();
  }
  
  @SuppressLint({"DefaultLocale"})
  final boolean cFX()
  {
    if (!com.tencent.d.b.b.a.cFO().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.c(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cFO().cFN())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.c(2));
      return true;
    }
    this.vlV = ((String)com.tencent.d.b.b.a.cFO().cFQ().get(this.fdx, ""));
    if (f.oW(this.vlV))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
      b(new com.tencent.d.b.a.c(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.fdx) })));
      return true;
    }
    boolean bool = com.tencent.d.a.a.cFD();
    if ((!bool) && (com.tencent.d.a.a.acz(this.vlV)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: no ask but has auth key. delete the auth key as well", new Object[0]);
      com.tencent.d.a.a.bD(this.vlV, false);
    }
    if ((!bool) && (!this.vnf))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: has not generate app secure key yet and not require to generate it", new Object[0]);
      b(new com.tencent.d.b.a.c(3));
      return true;
    }
    if ((com.tencent.d.a.a.acz(this.vlV)) && (!com.tencent.d.a.a.acA(this.vlV)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: already has auth key but not valid. delete it already and re-generate", new Object[0]);
      return false;
    }
    if ((com.tencent.d.a.a.acz(this.vlV)) && (!this.vna))
    {
      com.tencent.d.a.c.c.i("Soter.TaskPrepareAuthKey", "soter: already has key. do not need generate again", new Object[0]);
      b(new com.tencent.d.b.a.c(com.tencent.d.a.a.acB(this.vlV)));
      return true;
    }
    if (this.vnd == null) {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload AuthKey validation from server! Please make sure you upload it later", new Object[0]);
    }
    return false;
  }
  
  final void cFY()
  {
    com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: cancelled prepare authkey: %s", new Object[] { this.vlV });
    com.tencent.d.a.a.bD(this.vlV, false);
  }
  
  final void execute()
  {
    if ((!com.tencent.d.a.a.cFD()) && (this.vnf))
    {
      com.tencent.d.a.c.c.d("Soter.TaskPrepareAuthKey", "soter: ask not found, but required to generate it. start generate", new Object[0]);
      com.tencent.d.b.a.a(new k.1(this), false, this.vne);
      return;
    }
    cGe();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/d/b/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */