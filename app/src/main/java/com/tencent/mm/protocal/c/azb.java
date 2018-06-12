package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class azb
  extends bhp
{
  public int iwS;
  public String iwT;
  public String rEf;
  public String rEg;
  public String sbS;
  
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
      if (this.rEg != null) {
        paramVarArgs.g(2, this.rEg);
      }
      paramVarArgs.fT(3, this.iwS);
      if (this.iwT != null) {
        paramVarArgs.g(4, this.iwT);
      }
      if (this.rEf != null) {
        paramVarArgs.g(5, this.rEf);
      }
      if (this.sbS != null) {
        paramVarArgs.g(6, this.sbS);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label568;
      }
    }
    label568:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rEg != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rEg);
      }
      i += f.a.a.a.fQ(3, this.iwS);
      paramInt = i;
      if (this.iwT != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.iwT);
      }
      i = paramInt;
      if (this.rEf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rEf);
      }
      paramInt = i;
      if (this.sbS != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sbS);
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
        azb localazb = (azb)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localazb.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localazb.rEg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localazb.iwS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localazb.iwT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localazb.rEf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localazb.sbS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/azb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */