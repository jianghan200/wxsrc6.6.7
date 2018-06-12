package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bff
  extends bhp
{
  public bey sgt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sgt == null) {
        throw new b("Not all required fields were included: rcptinfolist");
      }
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.sgt != null)
      {
        paramVarArgs.fV(1, this.sgt.boi());
        this.sgt.a(paramVarArgs);
      }
      if (this.six != null)
      {
        paramVarArgs.fV(2, this.six.boi());
        this.six.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sgt == null) {
        break label486;
      }
    }
    label486:
    for (paramInt = f.a.a.a.fS(1, this.sgt.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.six != null) {
        i = paramInt + f.a.a.a.fS(2, this.six.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sgt == null) {
          throw new b("Not all required fields were included: rcptinfolist");
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bff localbff = (bff)paramVarArgs[1];
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
            localObject1 = new bey();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bey)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbff.sgt = ((bey)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new fl();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbff.six = ((fl)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */