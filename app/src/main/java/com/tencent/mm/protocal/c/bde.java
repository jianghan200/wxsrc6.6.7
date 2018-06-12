package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bde
  extends bhp
{
  public String huW;
  public int hwV;
  public String hwW;
  public String lMV;
  public String lMW;
  public String sfo;
  public String sfp;
  public kl sfq;
  public String sfr;
  public String sfs;
  public btq sft;
  
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
      if (this.sfo != null) {
        paramVarArgs.g(4, this.sfo);
      }
      if (this.huW != null) {
        paramVarArgs.g(5, this.huW);
      }
      if (this.sfp != null) {
        paramVarArgs.g(6, this.sfp);
      }
      if (this.sfq != null)
      {
        paramVarArgs.fV(7, this.sfq.boi());
        this.sfq.a(paramVarArgs);
      }
      if (this.sfr != null) {
        paramVarArgs.g(8, this.sfr);
      }
      if (this.lMW != null) {
        paramVarArgs.g(9, this.lMW);
      }
      if (this.lMV != null) {
        paramVarArgs.g(10, this.lMV);
      }
      if (this.sfs != null) {
        paramVarArgs.g(11, this.sfs);
      }
      if (this.sft != null)
      {
        paramVarArgs.fV(12, this.sft.boi());
        this.sft.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1094;
      }
    }
    label1094:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt;
      if (this.sfo != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.sfo);
      }
      paramInt = i;
      if (this.huW != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.huW);
      }
      i = paramInt;
      if (this.sfp != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.sfp);
      }
      paramInt = i;
      if (this.sfq != null) {
        paramInt = i + f.a.a.a.fS(7, this.sfq.boi());
      }
      i = paramInt;
      if (this.sfr != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.sfr);
      }
      paramInt = i;
      if (this.lMW != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.lMW);
      }
      i = paramInt;
      if (this.lMV != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.lMV);
      }
      paramInt = i;
      if (this.sfs != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.sfs);
      }
      i = paramInt;
      if (this.sft != null) {
        i = paramInt + f.a.a.a.fS(12, this.sft.boi());
      }
      return i;
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
        bde localbde = (bde)paramVarArgs[1];
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
            localbde.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbde.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbde.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbde.sfo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbde.huW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbde.sfp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbde.sfq = ((kl)localObject1);
            paramInt += 1;
          }
        case 8: 
          localbde.sfr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbde.lMW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbde.lMV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbde.sfs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((btq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbde.sft = ((btq)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */