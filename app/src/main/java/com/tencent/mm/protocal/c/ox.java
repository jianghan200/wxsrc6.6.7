package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ox
  extends bhp
{
  public int hcd;
  public byt rtb;
  public bws rtc;
  public bea rtd;
  public int rte;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rtb == null) {
        throw new b("Not all required fields were included: TransRes");
      }
      if (this.rtc == null) {
        throw new b("Not all required fields were included: UploadCtx");
      }
      if (this.rtd == null) {
        throw new b("Not all required fields were included: QueryCtx");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hcd);
      if (this.rtb != null)
      {
        paramVarArgs.fV(3, this.rtb.boi());
        this.rtb.a(paramVarArgs);
      }
      if (this.rtc != null)
      {
        paramVarArgs.fV(4, this.rtc.boi());
        this.rtc.a(paramVarArgs);
      }
      if (this.rtd != null)
      {
        paramVarArgs.fV(5, this.rtd.boi());
        this.rtd.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.rte);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label926;
      }
    }
    label926:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hcd);
      paramInt = i;
      if (this.rtb != null) {
        paramInt = i + f.a.a.a.fS(3, this.rtb.boi());
      }
      i = paramInt;
      if (this.rtc != null) {
        i = paramInt + f.a.a.a.fS(4, this.rtc.boi());
      }
      paramInt = i;
      if (this.rtd != null) {
        paramInt = i + f.a.a.a.fS(5, this.rtd.boi());
      }
      return paramInt + f.a.a.a.fQ(6, this.rte);
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
        if (this.rtb == null) {
          throw new b("Not all required fields were included: TransRes");
        }
        if (this.rtc == null) {
          throw new b("Not all required fields were included: UploadCtx");
        }
        if (this.rtd != null) {
          break;
        }
        throw new b("Not all required fields were included: QueryCtx");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ox localox = (ox)paramVarArgs[1];
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
            localox.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localox.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byt();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localox.rtb = ((byt)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bws();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bws)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localox.rtc = ((bws)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bea();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bea)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localox.rtd = ((bea)localObject1);
            paramInt += 1;
          }
        }
        localox.rte = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */