package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cfk
  extends com.tencent.mm.bk.a
{
  public long szS;
  public iv szT;
  public int szU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.szS);
      if (this.szT != null)
      {
        paramVarArgs.fV(2, this.szT.boi());
        this.szT.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.szU);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.S(1, this.szS) + 0;
      paramInt = i;
      if (this.szT != null) {
        paramInt = i + f.a.a.a.fS(2, this.szT.boi());
      }
      return paramInt + f.a.a.a.fQ(3, this.szU);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      cfk localcfk = (cfk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localcfk.szS = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iv();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((iv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfk.szT = ((iv)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localcfk.szU = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */