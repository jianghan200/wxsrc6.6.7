package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public e jOV;
  public b jOY;
  public String jOZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hcE);
      if (this.jOV != null)
      {
        paramVarArgs.fV(2, this.jOV.boi());
        this.jOV.a(paramVarArgs);
      }
      if (this.jOY != null)
      {
        paramVarArgs.fV(3, this.jOY.boi());
        this.jOY.a(paramVarArgs);
      }
      if (this.jOZ != null) {
        paramVarArgs.g(4, this.jOZ);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.hcE) + 0;
      paramInt = i;
      if (this.jOV != null) {
        paramInt = i + f.a.a.a.fS(2, this.jOV.boi());
      }
      i = paramInt;
      if (this.jOY != null) {
        i = paramInt + f.a.a.a.fS(3, this.jOY.boi());
      }
      paramInt = i;
    } while (this.jOZ == null);
    return i + f.a.a.b.b.a.h(4, this.jOZ);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      c localc = (c)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localc.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localc.jOV = ((e)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new b();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((b)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localc.jOY = ((b)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localc.jOZ = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */