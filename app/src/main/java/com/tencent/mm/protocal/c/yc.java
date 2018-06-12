package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class yc
  extends com.tencent.mm.bk.a
{
  public xv rDZ;
  public LinkedList<String> rEa = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rDZ == null) {
        throw new b("Not all required fields were included: GameItem");
      }
      if (this.rDZ != null)
      {
        paramVarArgs.fV(1, this.rDZ.boi());
        this.rDZ.a(paramVarArgs);
      }
      paramVarArgs.d(2, 1, this.rEa);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rDZ == null) {
        break label356;
      }
    }
    label356:
    for (paramInt = f.a.a.a.fS(1, this.rDZ.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 1, this.rEa);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rEa.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rDZ != null) {
          break;
        }
        throw new b("Not all required fields were included: GameItem");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        yc localyc = (yc)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((xv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localyc.rDZ = ((xv)localObject1);
            paramInt += 1;
          }
        }
        localyc.rEa.add(((f.a.a.a.a)localObject1).vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/yc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */