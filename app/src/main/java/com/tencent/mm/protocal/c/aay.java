package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aay
  extends com.tencent.mm.bk.a
  implements bnu
{
  public int rGc;
  public int rGd;
  public int rGe;
  public LinkedList<bhz> rGf = new LinkedList();
  public int rfn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rfn);
      paramVarArgs.fT(2, this.rGc);
      paramVarArgs.fT(3, this.rGd);
      paramVarArgs.fT(4, this.rGe);
      paramVarArgs.d(5, 8, this.rGf);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rfn) + 0 + f.a.a.a.fQ(2, this.rGc) + f.a.a.a.fQ(3, this.rGd) + f.a.a.a.fQ(4, this.rGe) + f.a.a.a.c(5, 8, this.rGf);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rGf.clear();
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
      aay localaay = (aay)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localaay.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localaay.rGc = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localaay.rGd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localaay.rGe = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhz();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localaay.rGf.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
  
  public final int getRet()
  {
    return this.rfn;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */