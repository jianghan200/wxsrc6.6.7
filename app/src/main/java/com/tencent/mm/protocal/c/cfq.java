package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cfq
  extends com.tencent.mm.bk.a
{
  public cft sAh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sAh == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (this.sAh != null)
      {
        paramVarArgs.fV(4, this.sAh.boi());
        this.sAh.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sAh == null) {
        break label305;
      }
    }
    label305:
    for (paramInt = f.a.a.a.fS(4, this.sAh.boi()) + 0;; paramInt = 0)
    {
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sAh != null) {
          break;
        }
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cfq localcfq = (cfq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cft();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((cft)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfq.sAh = ((cft)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */