package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ara
  extends bhd
{
  public int bYt;
  public String dxc;
  public String iEL;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.iEL == null) {
        throw new b("Not all required fields were included: appusername");
      }
      if (this.dxc == null) {
        throw new b("Not all required fields were included: rankid");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.username != null) {
        paramVarArgs.g(2, this.username);
      }
      if (this.iEL != null) {
        paramVarArgs.g(3, this.iEL);
      }
      paramVarArgs.fT(4, this.bYt);
      if (this.dxc != null) {
        paramVarArgs.g(5, this.dxc);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label577;
      }
    }
    label577:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.username != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.username);
      }
      i = paramInt;
      if (this.iEL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.iEL);
      }
      i += f.a.a.a.fQ(4, this.bYt);
      paramInt = i;
      if (this.dxc != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.dxc);
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
        if (this.username == null) {
          throw new b("Not all required fields were included: username");
        }
        if (this.iEL == null) {
          throw new b("Not all required fields were included: appusername");
        }
        if (this.dxc != null) {
          break;
        }
        throw new b("Not all required fields were included: rankid");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ara localara = (ara)paramVarArgs[1];
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
            localara.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localara.username = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localara.iEL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localara.bYt = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localara.dxc = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ara.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */