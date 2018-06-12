package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class hw
  extends com.tencent.mm.bk.a
{
  public hz riN;
  public String riO;
  public String riP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.riN != null)
      {
        paramVarArgs.fV(1, this.riN.boi());
        this.riN.a(paramVarArgs);
      }
      if (this.riO != null) {
        paramVarArgs.g(2, this.riO);
      }
      if (this.riP != null) {
        paramVarArgs.g(3, this.riP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.riN == null) {
        break label383;
      }
    }
    label383:
    for (int i = f.a.a.a.fS(1, this.riN.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.riO != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.riO);
      }
      i = paramInt;
      if (this.riP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.riP);
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
        hw localhw = (hw)paramVarArgs[1];
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
            localObject1 = new hz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localhw.riN = ((hz)localObject1);
            paramInt += 1;
          }
        case 2: 
          localhw.riO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localhw.riP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */