package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bux
  extends bhd
{
  public String cCR;
  public String devicetype;
  public String lKa;
  public int srT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.devicetype == null) {
        throw new b("Not all required fields were included: devicetype");
      }
      if (this.lKa == null) {
        throw new b("Not all required fields were included: deviceid");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.devicetype != null) {
        paramVarArgs.g(2, this.devicetype);
      }
      if (this.lKa != null) {
        paramVarArgs.g(3, this.lKa);
      }
      if (this.cCR != null) {
        paramVarArgs.g(4, this.cCR);
      }
      paramVarArgs.fT(5, this.srT);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label541;
      }
    }
    label541:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.devicetype != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.devicetype);
      }
      i = paramInt;
      if (this.lKa != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lKa);
      }
      paramInt = i;
      if (this.cCR != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.cCR);
      }
      return paramInt + f.a.a.a.fQ(5, this.srT);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.devicetype == null) {
          throw new b("Not all required fields were included: devicetype");
        }
        if (this.lKa != null) {
          break;
        }
        throw new b("Not all required fields were included: deviceid");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bux localbux = (bux)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbux.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbux.devicetype = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbux.lKa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbux.cCR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbux.srT = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */