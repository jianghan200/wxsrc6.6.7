package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class se
  extends com.tencent.mm.bk.a
{
  public String huX;
  public int rvB;
  public LinkedList<pr> rvC = new LinkedList();
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.huX != null) {
        paramVarArgs.g(2, this.huX);
      }
      paramVarArgs.fT(3, this.rvB);
      paramVarArgs.d(4, 8, this.rvC);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = f.a.a.b.b.a.h(1, this.title) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.huX != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.huX);
      }
      return i + f.a.a.a.fQ(3, this.rvB) + f.a.a.a.c(4, 8, this.rvC);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rvC.clear();
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
        se localse = (se)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localse.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localse.huX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localse.rvB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localse.rvC.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/se.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */