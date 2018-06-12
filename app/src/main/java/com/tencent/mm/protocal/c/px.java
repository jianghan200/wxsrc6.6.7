package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class px
  extends bhd
{
  public String jQb;
  public String reT;
  public String ruf;
  public String rug;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ruf == null) {
        throw new b("Not all required fields were included: DeviceId");
      }
      if (this.reT == null) {
        throw new b("Not all required fields were included: DeviceType");
      }
      if (this.rug == null) {
        throw new b("Not all required fields were included: ClientInfo");
      }
      if (this.jQb == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ruf != null) {
        paramVarArgs.g(2, this.ruf);
      }
      if (this.reT != null) {
        paramVarArgs.g(3, this.reT);
      }
      if (this.rug != null) {
        paramVarArgs.g(4, this.rug);
      }
      if (this.jQb != null) {
        paramVarArgs.g(5, this.jQb);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label629;
      }
    }
    label629:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ruf != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ruf);
      }
      i = paramInt;
      if (this.reT != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.reT);
      }
      paramInt = i;
      if (this.rug != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rug);
      }
      i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jQb);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ruf == null) {
          throw new b("Not all required fields were included: DeviceId");
        }
        if (this.reT == null) {
          throw new b("Not all required fields were included: DeviceType");
        }
        if (this.rug == null) {
          throw new b("Not all required fields were included: ClientInfo");
        }
        if (this.jQb != null) {
          break;
        }
        throw new b("Not all required fields were included: AppId");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        px localpx = (px)paramVarArgs[1];
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
            localpx.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localpx.ruf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localpx.reT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localpx.rug = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localpx.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/px.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */