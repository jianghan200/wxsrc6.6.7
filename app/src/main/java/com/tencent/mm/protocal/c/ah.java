package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ah
  extends com.tencent.mm.bk.a
{
  public int qZC;
  public int qZD;
  public int qZJ;
  public LinkedList<af> qZK = new LinkedList();
  public int qZL;
  public LinkedList<af> qZM = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qZC);
      paramVarArgs.fT(2, this.qZJ);
      paramVarArgs.d(3, 8, this.qZK);
      paramVarArgs.fT(4, this.qZD);
      paramVarArgs.fT(5, this.qZL);
      paramVarArgs.d(6, 8, this.qZM);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.qZC) + 0 + f.a.a.a.fQ(2, this.qZJ) + f.a.a.a.c(3, 8, this.qZK) + f.a.a.a.fQ(4, this.qZD) + f.a.a.a.fQ(5, this.qZL) + f.a.a.a.c(6, 8, this.qZM);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qZK.clear();
      this.qZM.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
      ah localah = (ah)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localah.qZC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localah.qZJ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new af();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((af)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localah.qZK.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localah.qZD = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localah.qZL = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new af();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((af)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localah.qZM.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */