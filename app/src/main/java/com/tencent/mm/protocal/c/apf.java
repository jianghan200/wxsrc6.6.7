package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class apf
  extends bhp
{
  public aof rRd;
  public String rRp;
  public String rjT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rRd != null)
      {
        paramVarArgs.fV(2, this.rRd.boi());
        this.rRd.a(paramVarArgs);
      }
      if (this.rRp != null) {
        paramVarArgs.g(3, this.rRp);
      }
      if (this.rjT != null) {
        paramVarArgs.g(4, this.rjT);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label564;
      }
    }
    label564:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rRd != null) {
        paramInt = i + f.a.a.a.fS(2, this.rRd.boi());
      }
      i = paramInt;
      if (this.rRp != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rRp);
      }
      paramInt = i;
      if (this.rjT != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rjT);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        apf localapf = (apf)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localapf.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aof();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aof)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localapf.rRd = ((aof)localObject1);
            paramInt += 1;
          }
        case 3: 
          localapf.rRp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localapf.rjT = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/apf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */