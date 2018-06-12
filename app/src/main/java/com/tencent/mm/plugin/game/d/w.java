package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class w
  extends com.tencent.mm.bk.a
{
  public String jOS;
  public e jOV;
  public LinkedList<String> jQg = new LinkedList();
  public String jQh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jOV != null)
      {
        paramVarArgs.fV(1, this.jOV.boi());
        this.jOV.a(paramVarArgs);
      }
      paramVarArgs.d(2, 1, this.jQg);
      if (this.jQh != null) {
        paramVarArgs.g(3, this.jQh);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jOV == null) {
        break label434;
      }
    }
    label434:
    for (paramInt = f.a.a.a.fS(1, this.jOV.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 1, this.jQg);
      paramInt = i;
      if (this.jQh != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jQh);
      }
      i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jOS);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jQg.clear();
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
        w localw = (w)paramVarArgs[1];
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
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localw.jOV = ((e)localObject1);
            paramInt += 1;
          }
        case 2: 
          localw.jQg.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 3: 
          localw.jQh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localw.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/d/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */