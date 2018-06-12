package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class tm
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public LinkedList<aqi> hbG = new LinkedList();
  public String rwk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwk != null) {
        paramVarArgs.g(1, this.rwk);
      }
      paramVarArgs.fT(2, this.hbF);
      paramVarArgs.d(3, 8, this.hbG);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwk == null) {
        break label347;
      }
    }
    label347:
    for (paramInt = f.a.a.b.b.a.h(1, this.rwk) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.hbF) + f.a.a.a.c(3, 8, this.hbG);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.hbG.clear();
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
        tm localtm = (tm)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localtm.rwk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localtm.hbF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqi();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((aqi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localtm.hbG.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/tm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */