package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class awf
  extends com.tencent.mm.bk.a
{
  public long lastUpdateTime;
  public LinkedList<kw> ruL = new LinkedList();
  public int ruM;
  public int ruN;
  public int version;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.ruL);
      paramVarArgs.fT(2, this.version);
      paramVarArgs.fT(3, this.ruM);
      paramVarArgs.fT(4, this.ruN);
      paramVarArgs.T(5, this.lastUpdateTime);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 8, this.ruL) + 0 + f.a.a.a.fQ(2, this.version) + f.a.a.a.fQ(3, this.ruM) + f.a.a.a.fQ(4, this.ruN) + f.a.a.a.S(5, this.lastUpdateTime);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ruL.clear();
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
      awf localawf = (awf)paramVarArgs[1];
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
          localObject1 = new kw();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((kw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localawf.ruL.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localawf.version = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localawf.ruM = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localawf.ruN = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localawf.lastUpdateTime = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/awf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */