package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bjn
  extends com.tencent.mm.bk.a
{
  public String iwP;
  public int otY;
  public aqs rUI;
  public String sjx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sjx != null) {
        paramVarArgs.g(1, this.sjx);
      }
      paramVarArgs.fT(2, this.otY);
      if (this.iwP != null) {
        paramVarArgs.g(3, this.iwP);
      }
      if (this.rUI != null)
      {
        paramVarArgs.fV(4, this.rUI.boi());
        this.rUI.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sjx == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = f.a.a.b.b.a.h(1, this.sjx) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.otY);
      paramInt = i;
      if (this.iwP != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.iwP);
      }
      i = paramInt;
      if (this.rUI != null) {
        i = paramInt + f.a.a.a.fS(4, this.rUI.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        bjn localbjn = (bjn)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbjn.sjx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbjn.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbjn.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((aqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbjn.rUI = ((aqs)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bjn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */