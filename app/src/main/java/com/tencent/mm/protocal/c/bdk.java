package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bdk
  extends bhp
{
  public int hwV;
  public String hwW;
  public ke rIx;
  public amp rIz;
  public String sda;
  public String sdb;
  
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
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      if (this.rIz != null)
      {
        paramVarArgs.fV(4, this.rIz.boi());
        this.rIz.a(paramVarArgs);
      }
      if (this.sda != null) {
        paramVarArgs.g(5, this.sda);
      }
      if (this.sdb != null) {
        paramVarArgs.g(6, this.sdb);
      }
      if (this.rIx != null)
      {
        paramVarArgs.fV(7, this.rIx.boi());
        this.rIx.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label807;
      }
    }
    label807:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt;
      if (this.rIz != null) {
        i = paramInt + f.a.a.a.fS(4, this.rIz.boi());
      }
      paramInt = i;
      if (this.sda != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sda);
      }
      i = paramInt;
      if (this.sdb != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.sdb);
      }
      paramInt = i;
      if (this.rIx != null) {
        paramInt = i + f.a.a.a.fS(7, this.rIx.boi());
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
        bdk localbdk = (bdk)paramVarArgs[1];
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
            localbdk.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbdk.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbdk.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new amp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((amp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdk.rIz = ((amp)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbdk.sda = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbdk.sdb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ke();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ke)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbdk.rIx = ((ke)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */