package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class do
  extends com.tencent.mm.bk.a
{
  public LinkedList<dp> rdR = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      ((f.a.a.c.a)paramVarArgs[0]).d(1, 8, this.rdR);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 8, this.rdR) + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rdR.clear();
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
      do localdo = (do)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new dp();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((dp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localdo.rdR.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */