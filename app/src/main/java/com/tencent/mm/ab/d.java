package com.tencent.mm.ab;

import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.concurrent.ConcurrentHashMap;

public abstract interface d
{
  public abstract b b(a parama);
  
  public abstract void h(bd parambd);
  
  public static final class a
  {
    public by dIN;
    public boolean dIO = false;
    public boolean dIP = false;
    public boolean dIQ = false;
    
    public a(by paramby, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      this.dIN = paramby;
      this.dIO = paramBoolean1;
      this.dIP = paramBoolean2;
      this.dIQ = paramBoolean3;
    }
    
    public final String toString()
    {
      return String.format("AddMsgInfo(%d), get[%b], fault[%b], up[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.dIO), Boolean.valueOf(this.dIP), Boolean.valueOf(this.dIQ) });
    }
  }
  
  public static final class b
  {
    public bd bGS;
    public boolean dIR;
    
    public b(bd parambd, boolean paramBoolean)
    {
      this.bGS = parambd;
      this.dIR = paramBoolean;
    }
  }
  
  public static final class c
  {
    private static ConcurrentHashMap<Object, d> dIS = new ConcurrentHashMap();
    
    public static void a(Object paramObject, d paramd)
    {
      x.i("MicroMsg.IMessageExtension.Factory", "registerExtensionFor %s, %s", new Object[] { paramObject, paramd });
      dIS.put(paramObject, paramd);
    }
    
    public static void b(Object paramObject, d paramd)
    {
      x.i("MicroMsg.IMessageExtension.Factory", "unregisterExtensionFor %s, %s", new Object[] { paramObject, paramd });
      dIS.remove(paramObject);
    }
    
    public static d ba(Object paramObject)
    {
      return (d)dIS.get(paramObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */