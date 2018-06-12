package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cbs
  extends com.tencent.mm.bk.a
{
  public caz sxO;
  public int sxP;
  public int sxQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sxO == null) {
        throw new b("Not all required fields were included: base_response");
      }
      if (this.sxO != null)
      {
        paramVarArgs.fV(1, this.sxO.boi());
        this.sxO.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.sxP);
      paramVarArgs.fT(3, this.sxQ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sxO == null) {
        break label379;
      }
    }
    label379:
    for (paramInt = f.a.a.a.fS(1, this.sxO.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.sxP) + f.a.a.a.fQ(3, this.sxQ);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sxO != null) {
          break;
        }
        throw new b("Not all required fields were included: base_response");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cbs localcbs = (cbs)paramVarArgs[1];
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
            localObject1 = new caz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((caz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcbs.sxO = ((caz)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcbs.sxP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcbs.sxQ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */