package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bqc
  extends bhp
{
  public int hcE;
  public int rWy;
  public LinkedList<bok> rWz = new LinkedList();
  public String rcc;
  public int rdV;
  public int rdW;
  public long rlK;
  public bok soc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.soc == null) {
        throw new b("Not all required fields were included: BufferUrl");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rdW);
      paramVarArgs.fT(3, this.rdV);
      if (this.rcc != null) {
        paramVarArgs.g(4, this.rcc);
      }
      if (this.soc != null)
      {
        paramVarArgs.fV(5, this.soc.boi());
        this.soc.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.rWy);
      paramVarArgs.d(7, 8, this.rWz);
      paramVarArgs.T(8, this.rlK);
      paramVarArgs.fT(9, this.hcE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label869;
      }
    }
    label869:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rdW) + f.a.a.a.fQ(3, this.rdV);
      paramInt = i;
      if (this.rcc != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rcc);
      }
      i = paramInt;
      if (this.soc != null) {
        i = paramInt + f.a.a.a.fS(5, this.soc.boi());
      }
      return i + f.a.a.a.fQ(6, this.rWy) + f.a.a.a.c(7, 8, this.rWz) + f.a.a.a.S(8, this.rlK) + f.a.a.a.fQ(9, this.hcE);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rWz.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.soc != null) {
          break;
        }
        throw new b("Not all required fields were included: BufferUrl");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bqc localbqc = (bqc)paramVarArgs[1];
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
            localbqc.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbqc.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbqc.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbqc.rcc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bok();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bok)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqc.soc = ((bok)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbqc.rWy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bok();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bok)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqc.rWz.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localbqc.rlK = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localbqc.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */