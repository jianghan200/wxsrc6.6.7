package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cj
  extends com.tencent.mm.bk.a
{
  public String jRj;
  public dx rcL;
  public LinkedList<alh> rcM = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcL == null) {
        throw new b("Not all required fields were included: ArtisAuthor");
      }
      if (this.rcL != null)
      {
        paramVarArgs.fV(1, this.rcL.boi());
        this.rcL.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.rcM);
      if (this.jRj != null) {
        paramVarArgs.g(3, this.jRj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rcL == null) {
        break label493;
      }
    }
    label493:
    for (paramInt = f.a.a.a.fS(1, this.rcL.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.rcM);
      paramInt = i;
      if (this.jRj != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jRj);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rcM.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rcL != null) {
          break;
        }
        throw new b("Not all required fields were included: ArtisAuthor");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cj localcj = (cj)paramVarArgs[1];
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
            localObject1 = new dx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcj.rcL = ((dx)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alh();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((alh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcj.rcM.add(localObject1);
            paramInt += 1;
          }
        }
        localcj.jRj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */