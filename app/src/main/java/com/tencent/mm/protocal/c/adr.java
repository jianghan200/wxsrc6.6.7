package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class adr
  extends bhp
{
  public long hcc;
  public int rIb;
  public int rIc;
  public int rId;
  public long rcg;
  
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
      paramVarArgs.T(2, this.rcg);
      paramVarArgs.T(3, this.hcc);
      paramVarArgs.fT(4, this.rIb);
      paramVarArgs.fT(5, this.rIc);
      paramVarArgs.fT(6, this.rId);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label492;
      }
    }
    label492:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.S(2, this.rcg) + f.a.a.a.S(3, this.hcc) + f.a.a.a.fQ(4, this.rIb) + f.a.a.a.fQ(5, this.rIc) + f.a.a.a.fQ(6, this.rId);
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
        adr localadr = (adr)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadr.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localadr.rcg = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localadr.hcc = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localadr.rIb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localadr.rIc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localadr.rId = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/adr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */