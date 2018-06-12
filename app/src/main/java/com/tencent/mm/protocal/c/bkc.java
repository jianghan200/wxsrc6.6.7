package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bkc
  extends com.tencent.mm.bk.a
{
  public int reH;
  public sx req;
  public bhy rer;
  public bhy res;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.res == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      if (this.req == null) {
        throw new b("Not all required fields were included: SvrPubECDHKey");
      }
      if (this.rer == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.res != null)
      {
        paramVarArgs.fV(1, this.res.boi());
        this.res.a(paramVarArgs);
      }
      if (this.req != null)
      {
        paramVarArgs.fV(2, this.req.boi());
        this.req.a(paramVarArgs);
      }
      if (this.rer != null)
      {
        paramVarArgs.fV(3, this.rer.boi());
        this.rer.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.reH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.res == null) {
        break label706;
      }
    }
    label706:
    for (int i = f.a.a.a.fS(1, this.res.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.req != null) {
        paramInt = i + f.a.a.a.fS(2, this.req.boi());
      }
      i = paramInt;
      if (this.rer != null) {
        i = paramInt + f.a.a.a.fS(3, this.rer.boi());
      }
      return i + f.a.a.a.fQ(4, this.reH);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.res == null) {
          throw new b("Not all required fields were included: AutoAuthKey");
        }
        if (this.req == null) {
          throw new b("Not all required fields were included: SvrPubECDHKey");
        }
        if (this.rer != null) {
          break;
        }
        throw new b("Not all required fields were included: SessionKey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bkc localbkc = (bkc)paramVarArgs[1];
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
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbkc.res = ((bhy)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbkc.req = ((sx)localObject1);
            paramInt += 1;
          }
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
            localbkc.rer = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        localbkc.reH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bkc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */