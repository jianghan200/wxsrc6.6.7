package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bvy
  extends bhd
{
  public String hbL;
  public int rIp;
  public int rdV;
  public int rdW;
  public bhy rtW;
  public String ssm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rdV);
      paramVarArgs.fT(3, this.rdW);
      paramVarArgs.fT(4, this.rIp);
      if (this.rtW != null)
      {
        paramVarArgs.fV(5, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      if (this.ssm != null) {
        paramVarArgs.g(6, this.ssm);
      }
      if (this.hbL != null) {
        paramVarArgs.g(7, this.hbL);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label681;
      }
    }
    label681:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rdV) + f.a.a.a.fQ(3, this.rdW) + f.a.a.a.fQ(4, this.rIp);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(5, this.rtW.boi());
      }
      i = paramInt;
      if (this.ssm != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.ssm);
      }
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.hbL);
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
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bvy localbvy = (bvy)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbvy.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbvy.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbvy.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbvy.rIp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbvy.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbvy.ssm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbvy.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bvy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */