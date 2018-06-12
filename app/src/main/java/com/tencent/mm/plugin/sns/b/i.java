package com.tencent.mm.plugin.sns.b;

import com.tencent.mm.kernel.c.a;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.storage.bd;

public abstract interface i
  extends a
{
  public abstract String C(bd parambd);
  
  public abstract void Z(bd parambd);
  
  public abstract String a(String paramString, PString paramPString);
  
  public abstract void a(String paramString, u.b paramb, bd parambd);
  
  public abstract void b(String paramString, d paramd);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */