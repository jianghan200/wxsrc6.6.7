package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bun
  extends bhd
{
  public String rIw;
  public String ruV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rIw != null) {
        paramVarArgs.g(2, this.rIw);
      }
      if (this.ruV != null) {
        paramVarArgs.g(3, this.ruV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label383;
      }
    }
    label383:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rIw != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rIw);
      }
      i = paramInt;
      if (this.ruV != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ruV);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bun localbun = (bun)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbun.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbun.rIw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbun.ruV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */