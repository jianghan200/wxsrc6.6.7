package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cfu
  extends com.tencent.mm.bk.a
{
  public String rDd;
  public String rDf;
  public cft sAh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rDd == null) {
        throw new b("Not all required fields were included: Rid");
      }
      if (this.rDf == null) {
        throw new b("Not all required fields were included: MimeType");
      }
      if (this.sAh == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (this.rDd != null) {
        paramVarArgs.g(1, this.rDd);
      }
      if (this.rDf != null) {
        paramVarArgs.g(2, this.rDf);
      }
      if (this.sAh != null)
      {
        paramVarArgs.fV(3, this.sAh.boi());
        this.sAh.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rDd == null) {
        break label483;
      }
    }
    label483:
    for (int i = f.a.a.b.b.a.h(1, this.rDd) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rDf != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rDf);
      }
      i = paramInt;
      if (this.sAh != null) {
        i = paramInt + f.a.a.a.fS(3, this.sAh.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rDd == null) {
          throw new b("Not all required fields were included: Rid");
        }
        if (this.rDf == null) {
          throw new b("Not all required fields were included: MimeType");
        }
        if (this.sAh != null) {
          break;
        }
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cfu localcfu = (cfu)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localcfu.rDd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localcfu.rDf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cft();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((cft)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfu.sAh = ((cft)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */