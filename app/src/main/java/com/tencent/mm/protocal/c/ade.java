package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ade
  extends com.tencent.mm.bk.a
{
  public bhy rcT;
  public String rem;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rem == null) {
        throw new b("Not all required fields were included: ProductID");
      }
      if (this.rcT == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.rem != null) {
        paramVarArgs.g(1, this.rem);
      }
      if (this.rcT != null)
      {
        paramVarArgs.fV(2, this.rcT.boi());
        this.rcT.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rem == null) {
        break label396;
      }
    }
    label396:
    for (paramInt = f.a.a.b.b.a.h(1, this.rem) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rcT != null) {
        i = paramInt + f.a.a.a.fS(2, this.rcT.boi());
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
        if (this.rem == null) {
          throw new b("Not all required fields were included: ProductID");
        }
        if (this.rcT != null) {
          break;
        }
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ade localade = (ade)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localade.rem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localade.rcT = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */