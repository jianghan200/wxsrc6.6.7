package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class th
  extends com.tencent.mm.bk.a
{
  public ts rwE;
  public ti rwF;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwE == null) {
        throw new b("Not all required fields were included: BannerSummary");
      }
      if (this.rwF == null) {
        throw new b("Not all required fields were included: BannerImg");
      }
      if (this.rwE != null)
      {
        paramVarArgs.fV(1, this.rwE.boi());
        this.rwE.a(paramVarArgs);
      }
      if (this.rwF != null)
      {
        paramVarArgs.fV(2, this.rwF.boi());
        this.rwF.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwE == null) {
        break label486;
      }
    }
    label486:
    for (paramInt = f.a.a.a.fS(1, this.rwE.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rwF != null) {
        i = paramInt + f.a.a.a.fS(2, this.rwF.boi());
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
        if (this.rwE == null) {
          throw new b("Not all required fields were included: BannerSummary");
        }
        if (this.rwF != null) {
          break;
        }
        throw new b("Not all required fields were included: BannerImg");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        th localth = (th)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ts();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ts)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localth.rwE = ((ts)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ti();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ti)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localth.rwF = ((ti)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */