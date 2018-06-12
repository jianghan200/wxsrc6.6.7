package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class chs
  extends com.tencent.mm.bk.a
{
  public String sBJ;
  public int sBK;
  public int sBL;
  public chl sBu;
  public LinkedList<Integer> sum = new LinkedList();
  
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
      if (this.sBJ != null) {
        paramVarArgs.g(2, this.sBJ);
      }
      paramVarArgs.d(3, 2, this.sum);
      paramVarArgs.fT(4, this.sBK);
      paramVarArgs.fT(5, this.sBL);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sBu == null) {
        break label456;
      }
    }
    label456:
    for (paramInt = f.a.a.a.fS(1, this.sBu.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sBJ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sBJ);
      }
      return i + f.a.a.a.c(3, 2, this.sum) + f.a.a.a.fQ(4, this.sBK) + f.a.a.a.fQ(5, this.sBL);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sum.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        chs localchs = (chs)paramVarArgs[1];
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
            localchs.sBu = ((chl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localchs.sBJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localchs.sum.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 4: 
          localchs.sBK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localchs.sBL = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/chs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */