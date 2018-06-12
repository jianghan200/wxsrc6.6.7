package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cax
  extends bhp
{
  public int rlm;
  public bhy rny;
  public int rxG;
  public long rxH;
  public bzu sxi;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rny == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.sxi == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rxG);
      if (this.rny != null)
      {
        paramVarArgs.fV(4, this.rny.boi());
        this.rny.a(paramVarArgs);
      }
      if (this.sxi != null)
      {
        paramVarArgs.fV(5, this.sxi.boi());
        this.sxi.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.rlm);
      paramVarArgs.T(8, this.rxH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label792;
      }
    }
    label792:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(3, this.rxG);
      paramInt = i;
      if (this.rny != null) {
        paramInt = i + f.a.a.a.fS(4, this.rny.boi());
      }
      i = paramInt;
      if (this.sxi != null) {
        i = paramInt + f.a.a.a.fS(5, this.sxi.boi());
      }
      return i + f.a.a.a.fQ(7, this.rlm) + f.a.a.a.S(8, this.rxH);
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
        if (this.rny == null) {
          throw new b("Not all required fields were included: KeyBuf");
        }
        if (this.sxi != null) {
          break;
        }
        throw new b("Not all required fields were included: CmdList");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cax localcax = (cax)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 2: 
        case 6: 
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
            localcax.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 3: 
          localcax.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcax.rny = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bzu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcax.sxi = ((bzu)localObject1);
            paramInt += 1;
          }
        case 7: 
          localcax.rlm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcax.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */