package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class byr
  extends com.tencent.mm.bk.a
{
  public int rgC;
  public String rsZ;
  public bhy ssr;
  public int suB;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ssr == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.ssr != null)
      {
        paramVarArgs.fV(1, this.ssr.boi());
        this.ssr.a(paramVarArgs);
      }
      if (this.rsZ != null) {
        paramVarArgs.g(2, this.rsZ);
      }
      paramVarArgs.fT(3, this.rgC);
      paramVarArgs.fT(4, this.suB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ssr == null) {
        break label434;
      }
    }
    label434:
    for (paramInt = f.a.a.a.fS(1, this.ssr.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rsZ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rsZ);
      }
      return i + f.a.a.a.fQ(3, this.rgC) + f.a.a.a.fQ(4, this.suB);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ssr != null) {
          break;
        }
        throw new b("Not all required fields were included: Text");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        byr localbyr = (byr)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbyr.ssr = ((bhy)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbyr.rsZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbyr.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbyr.suB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/byr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */