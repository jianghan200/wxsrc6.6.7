package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cfv
  extends com.tencent.mm.bk.a
{
  public String jQb;
  public cfs sAq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQb == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.sAq == null) {
        throw new b("Not all required fields were included: PkgConfig");
      }
      if (this.jQb != null) {
        paramVarArgs.g(1, this.jQb);
      }
      if (this.sAq != null)
      {
        paramVarArgs.fV(2, this.sAq.boi());
        this.sAq.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQb == null) {
        break label396;
      }
    }
    label396:
    for (paramInt = f.a.a.b.b.a.h(1, this.jQb) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sAq != null) {
        i = paramInt + f.a.a.a.fS(2, this.sAq.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jQb == null) {
          throw new b("Not all required fields were included: AppId");
        }
        if (this.sAq != null) {
          break;
        }
        throw new b("Not all required fields were included: PkgConfig");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cfv localcfv = (cfv)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localcfv.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cfs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((cfs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfv.sAq = ((cfs)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/cfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */