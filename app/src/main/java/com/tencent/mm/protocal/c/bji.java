package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bji
  extends bhp
{
  public String rgQ;
  public aue rgR;
  public alx rhk;
  public aly rhl;
  public int sjv;
  public ci sjw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rgR == null) {
        throw new b("Not all required fields were included: Contact");
      }
      if (this.rhk == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.rhl == null) {
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rgR != null)
      {
        paramVarArgs.fV(2, this.rgR.boi());
        this.rgR.a(paramVarArgs);
      }
      if (this.rhk != null)
      {
        paramVarArgs.fV(3, this.rhk.boi());
        this.rhk.a(paramVarArgs);
      }
      if (this.rhl != null)
      {
        paramVarArgs.fV(4, this.rhl.boi());
        this.rhl.a(paramVarArgs);
      }
      if (this.rgQ != null) {
        paramVarArgs.g(5, this.rgQ);
      }
      paramVarArgs.fT(6, this.sjv);
      if (this.sjw != null)
      {
        paramVarArgs.fV(7, this.sjw.boi());
        this.sjw.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1095;
      }
    }
    label1095:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rgR != null) {
        paramInt = i + f.a.a.a.fS(2, this.rgR.boi());
      }
      i = paramInt;
      if (this.rhk != null) {
        i = paramInt + f.a.a.a.fS(3, this.rhk.boi());
      }
      paramInt = i;
      if (this.rhl != null) {
        paramInt = i + f.a.a.a.fS(4, this.rhl.boi());
      }
      i = paramInt;
      if (this.rgQ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rgQ);
      }
      i += f.a.a.a.fQ(6, this.sjv);
      paramInt = i;
      if (this.sjw != null) {
        paramInt = i + f.a.a.a.fS(7, this.sjw.boi());
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
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rgR == null) {
          throw new b("Not all required fields were included: Contact");
        }
        if (this.rhk == null) {
          throw new b("Not all required fields were included: HardDevice");
        }
        if (this.rhl != null) {
          break;
        }
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bji localbji = (bji)paramVarArgs[1];
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
            localbji.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aue();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aue)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbji.rgR = ((aue)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((alx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbji.rhk = ((alx)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aly();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aly)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbji.rhl = ((aly)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbji.rgQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbji.sjv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ci();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ci)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbji.sjw = ((ci)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */