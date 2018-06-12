package com.tencent.mm.plugin.exdevice.e;

import f.a.a.b;
import java.util.LinkedList;

public final class n
  extends com.tencent.mm.bk.a
{
  public c ixh;
  public int ixl;
  public int ixm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ixh == null) {
        throw new b("Not all required fields were included: BasePush");
      }
      if (this.ixh != null)
      {
        paramVarArgs.fV(1, this.ixh.boi());
        this.ixh.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.ixl);
      paramVarArgs.fT(3, this.ixm);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ixh == null) {
        break label379;
      }
    }
    label379:
    for (paramInt = f.a.a.a.fS(1, this.ixh.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.ixl) + f.a.a.a.fQ(3, this.ixm);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ixh != null) {
          break;
        }
        throw new b("Not all required fields were included: BasePush");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new c();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((c)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localn.ixh = ((c)localObject1);
            paramInt += 1;
          }
        case 2: 
          localn.ixl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localn.ixm = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/e/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */