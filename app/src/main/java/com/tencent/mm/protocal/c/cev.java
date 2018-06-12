package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cev
  extends com.tencent.mm.bk.a
{
  public LinkedList<cdr> rHc = new LinkedList();
  public int rjC;
  public boolean szb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.rHc);
      paramVarArgs.fT(2, this.rjC);
      paramVarArgs.av(3, this.szb);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 8, this.rHc) + 0 + f.a.a.a.fQ(2, this.rjC) + (f.a.a.b.b.a.ec(3) + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rHc.clear();
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
      cev localcev = (cev)paramVarArgs[1];
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
          localObject1 = new cdr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((cdr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcev.rHc.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localcev.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localcev.szb = ((f.a.a.a.a)localObject1).cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */