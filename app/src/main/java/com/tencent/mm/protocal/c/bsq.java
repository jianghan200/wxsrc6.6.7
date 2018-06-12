package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bsq
  extends bhd
{
  public int rPs;
  public int rPt;
  public bhy rPu;
  public bhy scR;
  public String sign;
  public String spW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rPu == null) {
        throw new b("Not all required fields were included: ReqText");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rPs);
      paramVarArgs.fT(3, this.rPt);
      if (this.rPu != null)
      {
        paramVarArgs.fV(4, this.rPu.boi());
        this.rPu.a(paramVarArgs);
      }
      if (this.scR != null)
      {
        paramVarArgs.fV(5, this.scR.boi());
        this.scR.a(paramVarArgs);
      }
      if (this.sign != null) {
        paramVarArgs.g(6, this.sign);
      }
      if (this.spW != null) {
        paramVarArgs.g(7, this.spW);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label791;
      }
    }
    label791:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rPs) + f.a.a.a.fQ(3, this.rPt);
      paramInt = i;
      if (this.rPu != null) {
        paramInt = i + f.a.a.a.fS(4, this.rPu.boi());
      }
      i = paramInt;
      if (this.scR != null) {
        i = paramInt + f.a.a.a.fS(5, this.scR.boi());
      }
      paramInt = i;
      if (this.sign != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sign);
      }
      i = paramInt;
      if (this.spW != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.spW);
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
        if (this.rPu != null) {
          break;
        }
        throw new b("Not all required fields were included: ReqText");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bsq localbsq = (bsq)paramVarArgs[1];
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
            localbsq.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbsq.rPs = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbsq.rPt = ((f.a.a.a.a)localObject1).vHC.rY();
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbsq.rPu = ((bhy)localObject1);
            paramInt += 1;
          }
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
            localbsq.scR = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbsq.sign = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbsq.spW = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */