package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ph
  extends com.tencent.mm.bk.a
{
  public int rtD;
  public bhy rtE;
  public int rtF;
  public bhy rtG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtE == null) {
        throw new b("Not all required fields were included: OperationInfo");
      }
      paramVarArgs.fT(1, this.rtD);
      if (this.rtE != null)
      {
        paramVarArgs.fV(2, this.rtE.boi());
        this.rtE.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rtF);
      if (this.rtG != null)
      {
        paramVarArgs.fV(4, this.rtG.boi());
        this.rtG.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.rtD) + 0;
      paramInt = i;
      if (this.rtE != null) {
        paramInt = i + f.a.a.a.fS(2, this.rtE.boi());
      }
      i = paramInt + f.a.a.a.fQ(3, this.rtF);
      paramInt = i;
    } while (this.rtG == null);
    return i + f.a.a.a.fS(4, this.rtG.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rtE == null) {
        throw new b("Not all required fields were included: OperationInfo");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ph localph = (ph)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localph.rtD = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localph.rtE = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localph.rtF = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhy();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localph.rtG = ((bhy)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */