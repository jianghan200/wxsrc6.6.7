package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cef
  extends com.tencent.mm.bk.a
{
  public long szl;
  public long szm;
  public String szn;
  public LinkedList<ceg> szo = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szn == null) {
        throw new b("Not all required fields were included: TotalMsg");
      }
      paramVarArgs.T(1, this.szm);
      paramVarArgs.T(2, this.szl);
      if (this.szn != null) {
        paramVarArgs.g(3, this.szn);
      }
      paramVarArgs.d(4, 8, this.szo);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.S(1, this.szm) + 0 + f.a.a.a.S(2, this.szl);
      paramInt = i;
      if (this.szn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.szn);
      }
      return paramInt + f.a.a.a.c(4, 8, this.szo);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.szo.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.szn == null) {
        throw new b("Not all required fields were included: TotalMsg");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      cef localcef = (cef)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localcef.szm = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localcef.szl = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 3: 
        localcef.szn = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ceg();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((ceg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localcef.szo.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */