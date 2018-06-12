package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class cw
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public LinkedList<am> jPz = new LinkedList();
  public String jQG;
  public String jQZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      paramVarArgs.d(2, 8, this.jPz);
      if (this.jQG != null) {
        paramVarArgs.g(3, this.jQG);
      }
      if (this.jQZ != null) {
        paramVarArgs.g(4, this.jQZ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = f.a.a.b.b.a.h(1, this.bHD) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.jPz);
      paramInt = i;
      if (this.jQG != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jQG);
      }
      i = paramInt;
      if (this.jQZ != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jQZ);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jPz.clear();
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
        cw localcw = (cw)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localcw.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new am();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((am)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcw.jPz.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localcw.jQG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localcw.jQZ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */