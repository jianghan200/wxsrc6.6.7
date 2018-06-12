package com.tencent.mm.plugin.game.d;

import f.a.a.b;
import java.util.LinkedList;

public final class ap
  extends com.tencent.mm.bk.a
{
  public e jOV;
  public String jOZ;
  public String jPA;
  public LinkedList<aq> jQX = new LinkedList();
  
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
      if (this.jOZ != null) {
        paramVarArgs.g(2, this.jOZ);
      }
      paramVarArgs.d(3, 8, this.jQX);
      if (this.jPA != null) {
        paramVarArgs.g(4, this.jPA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jOV == null) {
        break label548;
      }
    }
    label548:
    for (paramInt = f.a.a.a.fS(1, this.jOV.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jOZ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jOZ);
      }
      i += f.a.a.a.c(3, 8, this.jQX);
      paramInt = i;
      if (this.jPA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPA);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jQX.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        ap localap = (ap)paramVarArgs[1];
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
            localap.jOV = ((e)localObject1);
            paramInt += 1;
          }
        case 2: 
          localap.jOZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localap.jQX.add(localObject1);
            paramInt += 1;
          }
        }
        localap.jPA = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/d/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */