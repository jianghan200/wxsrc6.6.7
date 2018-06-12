package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class cp
  extends com.tencent.mm.bk.a
{
  public LinkedList<cq> jSY = new LinkedList();
  public String jSZ;
  public String jSo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.jSY);
      if (this.jSo != null) {
        paramVarArgs.g(2, this.jSo);
      }
      if (this.jSZ != null) {
        paramVarArgs.g(3, this.jSZ);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.c(1, 8, this.jSY) + 0;
      paramInt = i;
      if (this.jSo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jSo);
      }
      i = paramInt;
    } while (this.jSZ == null);
    return paramInt + f.a.a.b.b.a.h(3, this.jSZ);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jSY.clear();
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
      cp localcp = (cp)paramVarArgs[1];
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
          localObject1 = new cq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((cq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcp.jSY.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localcp.jSo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localcp.jSZ = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */