package com.tencent.mm.plugin.j.c;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.j.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;

public final class a
  implements Runnable
{
  private bd bGS;
  private int opType;
  
  public a(bd parambd, int paramInt)
  {
    this.bGS = parambd;
    this.opType = paramInt;
    x.d("MicroMsg.MsgEventTask", "%d msg id[%d %d] optype[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.bGS.field_msgId), Integer.valueOf(this.bGS.getType()), Integer.valueOf(this.opType) });
  }
  
  public final void run()
  {
    switch (this.opType)
    {
    default: 
      x.w("MicroMsg.MsgEventTask", "%d unknow op type [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.opType) });
      return;
    }
    b.avr().K(this.bGS);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/j/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */