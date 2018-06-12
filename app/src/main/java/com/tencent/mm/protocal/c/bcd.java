package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bcd
  extends com.tencent.mm.bk.a
{
  public int kpJ;
  public int rxG;
  public long rxH;
  public LinkedList<bcm> sew = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rxG);
      paramVarArgs.T(2, this.rxH);
      paramVarArgs.d(3, 8, this.sew);
      paramVarArgs.fT(4, this.kpJ);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rxG) + 0 + f.a.a.a.S(2, this.rxH) + f.a.a.a.c(3, 8, this.sew) + f.a.a.a.fQ(4, this.kpJ);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.sew.clear();
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
      bcd localbcd = (bcd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbcd.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localbcd.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcm();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bcm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbcd.sew.add(localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localbcd.kpJ = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */