package com.tencent.mm.plugin.ipcall.a;

import com.tencent.mm.g.a.ij;
import com.tencent.mm.g.a.ij.a;
import com.tencent.mm.protocal.c.bcd;
import com.tencent.mm.protocal.c.bcm;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
  extends c<ij>
{
  public a koL;
  
  public h()
  {
    this.sFo = ij.class.getName().hashCode();
  }
  
  private boolean a(ij paramij)
  {
    if ((paramij instanceof ij))
    {
      paramij = paramij.bRR.bRS;
      if ((paramij != null) && (paramij.length > 0)) {
        break label26;
      }
    }
    for (;;)
    {
      return false;
      label26:
      if (paramij[0] == 101)
      {
        Object localObject = new byte[paramij.length - 1];
        System.arraycopy(paramij, 1, localObject, 0, localObject.length);
        try
        {
          paramij = (bcd)new bcd().aG((byte[])localObject);
          x.d("MicroMsg.IPCallSvrNotifyListener", "roomId: %d, roomKey: %d, DtmfPayloadType: %d", new Object[] { Integer.valueOf(paramij.rxG), Long.valueOf(paramij.rxH), Integer.valueOf(paramij.kpJ) });
          localObject = paramij.sew;
          if (localObject != null)
          {
            localObject = ((LinkedList)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              bcm localbcm = (bcm)((Iterator)localObject).next();
              x.d("MicroMsg.IPCallSvrNotifyListener", "userstatus: %d, userstatusKey: %d, memberId: %d", new Object[] { Integer.valueOf(localbcm.sdf), Integer.valueOf(localbcm.seH), Integer.valueOf(localbcm.seG) });
            }
          }
          if (this.koL == null) {}
        }
        catch (Exception paramij)
        {
          x.e("MicroMsg.IPCallSvrNotifyListener", "parse PstnNotify error: %s", new Object[] { paramij.getMessage() });
          return false;
        }
      }
    }
    this.koL.a(paramij);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(bcd parambcd);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */