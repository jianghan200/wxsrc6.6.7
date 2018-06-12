package com.tencent.d.b.f;

import com.tencent.d.a.c.d;
import com.tencent.d.b.d.b;
import com.tencent.d.b.d.b.a;
import com.tencent.d.b.e.e;

public final class j
  extends c
{
  e vmZ = null;
  private boolean vna = false;
  
  public j(e parame, boolean paramBoolean)
  {
    this.vmZ = parame;
    this.vna = paramBoolean;
  }
  
  final boolean cFX()
  {
    if (!com.tencent.d.b.b.a.cFO().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.c(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cFO().cFN())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.c(2));
      return true;
    }
    if ((com.tencent.d.a.a.cFD()) && (!this.vna))
    {
      com.tencent.d.a.c.c.i("Soter.TaskPrepareAppSecureKey", "soter: already has ask. do not need generate again", new Object[0]);
      b(new com.tencent.d.b.a.c(com.tencent.d.a.a.cFE()));
      return true;
    }
    if (this.vmZ == null) {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload ASK validation from server! Please make sure you upload it later", new Object[0]);
    }
    return false;
  }
  
  final void cFY()
  {
    com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: cancelled prepare ask", new Object[0]);
    com.tencent.d.a.a.cFB();
  }
  
  final void execute()
  {
    dC(d.cFJ().vly, 1);
    b.a locala = new b.a();
    boolean bool = this.vna;
    locala.vlU |= 0x1;
    locala.vlW = bool;
    locala.vlY = new j.1(this);
    locala.cFV().cFU();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/d/b/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */