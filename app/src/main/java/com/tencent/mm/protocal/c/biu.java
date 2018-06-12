package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class biu
  extends bhd
{
  public String category;
  public String mac;
  public String userName;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.mac == null) {
        throw new b("Not all required fields were included: mac");
      }
      if (this.userName == null) {
        throw new b("Not all required fields were included: userName");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.mac != null) {
        paramVarArgs.g(2, this.mac);
      }
      if (this.userName != null) {
        paramVarArgs.g(3, this.userName);
      }
      if (this.category != null) {
        paramVarArgs.g(4, this.category);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label506;
      }
    }
    label506:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mac != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.mac);
      }
      i = paramInt;
      if (this.userName != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.userName);
      }
      paramInt = i;
      if (this.category != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.category);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.mac == null) {
          throw new b("Not all required fields were included: mac");
        }
        if (this.userName != null) {
          break;
        }
        throw new b("Not all required fields were included: userName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        biu localbiu = (biu)paramVarArgs[1];
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
            localbiu.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbiu.mac = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbiu.userName = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbiu.category = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/biu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */