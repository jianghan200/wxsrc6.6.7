package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class chq
  extends com.tencent.mm.bk.a
{
  public String sBH;
  public chl sBu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sBu != null)
      {
        paramVarArgs.fV(1, this.sBu.boi());
        this.sBu.a(paramVarArgs);
      }
      if (this.sBH != null) {
        paramVarArgs.g(2, this.sBH);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sBu == null) {
        break label328;
      }
    }
    label328:
    for (paramInt = f.a.a.a.fS(1, this.sBu.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sBH != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sBH);
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        chq localchq = (chq)paramVarArgs[1];
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
            localObject1 = new chl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((chl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchq.sBu = ((chl)localObject1);
            paramInt += 1;
          }
        }
        localchq.sBH = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/chq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */