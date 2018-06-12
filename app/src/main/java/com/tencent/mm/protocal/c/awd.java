package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class awd
  extends com.tencent.mm.bk.a
{
  public int otY;
  public pn rZv;
  public int rZw;
  public String reT;
  public int rnx;
  public bhy rny;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rZv == null) {
        throw new b("Not all required fields were included: Oplog");
      }
      if (this.rny == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.rZv != null)
      {
        paramVarArgs.fV(1, this.rZv.boi());
        this.rZv.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rnx);
      if (this.rny != null)
      {
        paramVarArgs.fV(3, this.rny.boi());
        this.rny.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.otY);
      if (this.reT != null) {
        paramVarArgs.g(5, this.reT);
      }
      paramVarArgs.fT(6, this.rZw);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rZv == null) {
        break label658;
      }
    }
    label658:
    for (paramInt = f.a.a.a.fS(1, this.rZv.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rnx);
      paramInt = i;
      if (this.rny != null) {
        paramInt = i + f.a.a.a.fS(3, this.rny.boi());
      }
      i = paramInt + f.a.a.a.fQ(4, this.otY);
      paramInt = i;
      if (this.reT != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.reT);
      }
      return paramInt + f.a.a.a.fQ(6, this.rZw);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rZv == null) {
          throw new b("Not all required fields were included: Oplog");
        }
        if (this.rny != null) {
          break;
        }
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        awd localawd = (awd)paramVarArgs[1];
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
            localObject1 = new pn();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pn)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localawd.rZv = ((pn)localObject1);
            paramInt += 1;
          }
        case 2: 
          localawd.rnx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localawd.rny = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localawd.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localawd.reT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localawd.rZw = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/awd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */