package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bos
  extends bhp
{
  public int hcE;
  public int rdV;
  public int rdW;
  public bhy rfy;
  public String smD;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rfy == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rdW);
      paramVarArgs.fT(3, this.rdV);
      if (this.rfy != null)
      {
        paramVarArgs.fV(4, this.rfy.boi());
        this.rfy.a(paramVarArgs);
      }
      if (this.smD != null) {
        paramVarArgs.g(5, this.smD);
      }
      paramVarArgs.fT(6, this.hcE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label658;
      }
    }
    label658:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rdW) + f.a.a.a.fQ(3, this.rdV);
      paramInt = i;
      if (this.rfy != null) {
        paramInt = i + f.a.a.a.fS(4, this.rfy.boi());
      }
      i = paramInt;
      if (this.smD != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.smD);
      }
      return i + f.a.a.a.fQ(6, this.hcE);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rfy != null) {
          break;
        }
        throw new b("Not all required fields were included: Buffer");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bos localbos = (bos)paramVarArgs[1];
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
            localbos.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbos.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbos.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbos.rfy = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbos.smD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbos.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */