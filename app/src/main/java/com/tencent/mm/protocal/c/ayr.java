package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class ayr
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public LinkedList<Integer> rHd = new LinkedList();
  public LinkedList<ayo> sbv = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hbF);
      paramVarArgs.c(2, this.rHd);
      paramVarArgs.d(3, 8, this.sbv);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.hbF) + 0 + f.a.a.a.b(2, this.rHd) + f.a.a.a.c(3, 8, this.sbv);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rHd.clear();
      this.sbv.clear();
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
      ayr localayr = (ayr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localayr.hbF = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localayr.rHd = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ayo();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((ayo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localayr.sbv.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ayr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */