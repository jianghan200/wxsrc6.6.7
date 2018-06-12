package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cgf
  extends com.tencent.mm.bk.a
{
  public String rKY;
  public bhy rLb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rLb == null) {
        throw new b("Not all required fields were included: VerifyBuff");
      }
      if (this.rKY != null) {
        paramVarArgs.g(1, this.rKY);
      }
      if (this.rLb != null)
      {
        paramVarArgs.fV(2, this.rLb.boi());
        this.rLb.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rKY == null) {
        break label360;
      }
    }
    label360:
    for (paramInt = f.a.a.b.b.a.h(1, this.rKY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rLb != null) {
        i = paramInt + f.a.a.a.fS(2, this.rLb.boi());
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
        if (this.rLb != null) {
          break;
        }
        throw new b("Not all required fields were included: VerifyBuff");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cgf localcgf = (cgf)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localcgf.rKY = ((f.a.a.a.a)localObject1).vHC.readString();
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
          localcgf.rLb = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */