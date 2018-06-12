package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class baw
  extends com.tencent.mm.bk.a
{
  public String rtC;
  public cfv sdh;
  public cfx sdi;
  public cfr sdj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtC == null) {
        throw new b("Not all required fields were included: PkgId");
      }
      if (this.rtC != null) {
        paramVarArgs.g(1, this.rtC);
      }
      if (this.sdh != null)
      {
        paramVarArgs.fV(2, this.sdh.boi());
        this.sdh.a(paramVarArgs);
      }
      if (this.sdi != null)
      {
        paramVarArgs.fV(3, this.sdi.boi());
        this.sdi.a(paramVarArgs);
      }
      if (this.sdj != null)
      {
        paramVarArgs.fV(4, this.sdj.boi());
        this.sdj.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rtC == null) {
        break label654;
      }
    }
    label654:
    for (int i = f.a.a.b.b.a.h(1, this.rtC) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sdh != null) {
        paramInt = i + f.a.a.a.fS(2, this.sdh.boi());
      }
      i = paramInt;
      if (this.sdi != null) {
        i = paramInt + f.a.a.a.fS(3, this.sdi.boi());
      }
      paramInt = i;
      if (this.sdj != null) {
        paramInt = i + f.a.a.a.fS(4, this.sdj.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rtC != null) {
          break;
        }
        throw new b("Not all required fields were included: PkgId");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        baw localbaw = (baw)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbaw.rtC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cfv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cfv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbaw.sdh = ((cfv)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cfx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cfx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbaw.sdi = ((cfx)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cfr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cfr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbaw.sdj = ((cfr)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/baw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */