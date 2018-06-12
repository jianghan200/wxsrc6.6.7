package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class sh
  extends com.tencent.mm.bk.a
{
  public int rvE;
  public si rvF;
  public int rvG;
  public si rvH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvF == null) {
        throw new b("Not all required fields were included: NightTime");
      }
      if (this.rvH == null) {
        throw new b("Not all required fields were included: AllDayTime");
      }
      paramVarArgs.fT(1, this.rvE);
      if (this.rvF != null)
      {
        paramVarArgs.fV(2, this.rvF.boi());
        this.rvF.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rvG);
      if (this.rvH != null)
      {
        paramVarArgs.fV(4, this.rvH.boi());
        this.rvH.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rvE) + 0;
      paramInt = i;
      if (this.rvF != null) {
        paramInt = i + f.a.a.a.fS(2, this.rvF.boi());
      }
      i = paramInt + f.a.a.a.fQ(3, this.rvG);
      paramInt = i;
    } while (this.rvH == null);
    return i + f.a.a.a.fS(4, this.rvH.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rvF == null) {
        throw new b("Not all required fields were included: NightTime");
      }
      if (this.rvH == null) {
        throw new b("Not all required fields were included: AllDayTime");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      sh localsh = (sh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localsh.rvE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new si();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((si)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localsh.rvF = ((si)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localsh.rvG = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new si();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((si)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localsh.rvH = ((si)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */