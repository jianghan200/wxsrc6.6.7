package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class chm
  extends com.tencent.mm.bk.a
{
  public chl sBu;
  public LinkedList<Integer> sBv = new LinkedList();
  public int sBw;
  public int sBx;
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
      paramVarArgs.d(2, 2, this.sBv);
      paramVarArgs.d(3, 2, this.sum);
      paramVarArgs.fT(4, this.sBw);
      paramVarArgs.fT(5, this.sBx);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sBu == null) {
        break label455;
      }
    }
    label455:
    for (paramInt = f.a.a.a.fS(1, this.sBu.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 2, this.sBv) + f.a.a.a.c(3, 2, this.sum) + f.a.a.a.fQ(4, this.sBw) + f.a.a.a.fQ(5, this.sBx);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sBv.clear();
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
        chm localchm = (chm)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((chl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchm.sBu = ((chl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localchm.sBv.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 3: 
          localchm.sum.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 4: 
          localchm.sBw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localchm.sBx = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/chm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */