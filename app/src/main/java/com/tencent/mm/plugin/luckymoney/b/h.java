package com.tencent.mm.plugin.luckymoney.b;

import java.util.LinkedList;

public final class h
  extends com.tencent.mm.bk.a
{
  public int jzh;
  public int kPV;
  public LinkedList<i> kQe = new LinkedList();
  public int kQk;
  public long kQl;
  public int kQm;
  public long kQn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.kQk);
      paramVarArgs.T(2, this.kQl);
      paramVarArgs.fT(3, this.kQm);
      paramVarArgs.T(4, this.kQn);
      paramVarArgs.fT(5, this.jzh);
      paramVarArgs.fT(6, this.kPV);
      paramVarArgs.d(7, 8, this.kQe);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.kQk) + 0 + f.a.a.a.S(2, this.kQl) + f.a.a.a.fQ(3, this.kQm) + f.a.a.a.S(4, this.kQn) + f.a.a.a.fQ(5, this.jzh) + f.a.a.a.fQ(6, this.kPV) + f.a.a.a.c(7, 8, this.kQe);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.kQe.clear();
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
      h localh = (h)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localh.kQk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localh.kQl = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 3: 
        localh.kQm = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localh.kQn = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 5: 
        localh.jzh = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localh.kPV = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new i();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((i)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localh.kQe.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */