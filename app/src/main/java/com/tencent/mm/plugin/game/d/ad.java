package com.tencent.mm.plugin.game.d;

import f.a.a.b;
import java.util.LinkedList;

public final class ad
  extends com.tencent.mm.bk.a
{
  public String jOS;
  public e jOV;
  public af jQD;
  public ae jQE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jOV == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.jOV != null)
      {
        paramVarArgs.fV(1, this.jOV.boi());
        this.jOV.a(paramVarArgs);
      }
      if (this.jQD != null)
      {
        paramVarArgs.fV(2, this.jQD.boi());
        this.jQD.a(paramVarArgs);
      }
      if (this.jQE != null)
      {
        paramVarArgs.fV(3, this.jQE.boi());
        this.jQE.a(paramVarArgs);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jOV == null) {
        break label654;
      }
    }
    label654:
    for (int i = f.a.a.a.fS(1, this.jOV.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQD != null) {
        paramInt = i + f.a.a.a.fS(2, this.jQD.boi());
      }
      i = paramInt;
      if (this.jQE != null) {
        i = paramInt + f.a.a.a.fS(3, this.jQE.boi());
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jOV != null) {
          break;
        }
        throw new b("Not all required fields were included: AppItem");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ad localad = (ad)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localad.jOV = ((e)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new af();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((af)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localad.jQD = ((af)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ae();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ae)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localad.jQE = ((ae)localObject1);
            paramInt += 1;
          }
        }
        localad.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */